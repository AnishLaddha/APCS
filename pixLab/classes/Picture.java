import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }




  public void goodencode(Picture secretpic){
    Pixel[][] pixs = this.getPixels2D();
    Pixel[][] secpixs = secretpic.getPixels2D();

    for(int row = 0; row < pixs.length; row++){

      for(int col = 0; col < pixs[0].length; col++){
        Pixel ogpix = pixs[row][col];
        Pixel messPix = secpixs[row][col];


        String ogred = String.format("%8s", Integer.toBinaryString(ogpix.getRed())).replace(' ', '0');
        String ogblue = String.format("%8s", Integer.toBinaryString(ogpix.getBlue())).replace(' ', '0');
        String oggreen = String.format("%8s", Integer.toBinaryString(ogpix.getGreen())).replace(' ', '0');

        String mesred = String.format("%8s", Integer.toBinaryString(messPix.getRed())).replace(' ', '0');
        String mesblue = String.format("%8s", Integer.toBinaryString(messPix.getBlue())).replace(' ', '0');
        String mesgreen = String.format("%8s", Integer.toBinaryString(messPix.getGreen())).replace(' ', '0');
        

        String encred = ogred.substring(0,4) + mesred.substring(0,4);
        String encblue = ogblue.substring(0,4) + mesblue.substring(0,4);
        String encgreen = oggreen.substring(0,4) + mesgreen.substring(0,4);

        ogpix.setRed(Integer.parseInt(encred,2));
        ogpix.setBlue(Integer.parseInt(encblue,2));
        ogpix.setGreen(Integer.parseInt(encgreen,2));

      
      }
    
    }
  
  }

  public Picture gooddecode(){
    Pixel[][] pixs = this.getPixels2D();
    Picture decoded = new Picture("decoded.jpg");
    Pixel[][] decpixs = decoded.getPixels2D();
    for(int row = 0; row < pixs.length; row++){

      for(int col = 0; col < pixs[0].length; col++){
        Pixel ogpix = pixs[row][col];
        Pixel decpix = decpixs[row][col];


        String ogred = String.format("%8s", Integer.toBinaryString(ogpix.getRed())).replace(' ', '0');
        String ogblue = String.format("%8s", Integer.toBinaryString(ogpix.getBlue())).replace(' ', '0');
        String oggreen = String.format("%8s", Integer.toBinaryString(ogpix.getGreen())).replace(' ', '0');

        String decred = ogred.substring(4)+"0000";
        String decblue = ogblue.substring(4) + "0000";
        String decgreen = oggreen.substring(4) + "0000";

        decpix.setRed(Integer.parseInt(decred,2));
        decpix.setBlue(Integer.parseInt(decblue,2));
        decpix.setGreen(Integer.parseInt(decgreen,2));



      }
    }
    return decoded;

  }















  /*
  Hide a black and white message in the current
  picture by changing the red to even and then
  setting it to odd if the message pixel is black. 
  @param messagePict the picture with a message.
  */

  public void encode(Picture messagePic){
    Pixel[][] pixs = this.getPixels2D();

    Pixel[][] messPix = messagePic.getPixels2D();



    for(int rows = 0; rows < pixs.length; rows++){

      for(int col = 0; col < pixs[0].length; col++){
        Pixel pixObj = pixs[rows][col];

        Pixel messagePixel = messPix[rows][col];


        int ogred = pixObj.getRed();
        int newred;
        newred = ogred;
        if (ogred % 2 == 1){
          newred--;
          pixObj.setRed(newred);
        }
        if (messagePixel.colorDistance(Color.BLACK) < 50){
          pixObj.setRed(newred+1);
        }


      }

    }

  }

  public Picture decode(){
    Pixel[][] pixs = this.getPixels2D();
    Picture newimg = new Picture("beach.jpg");
    Pixel[][] imgpix = newimg.getPixels2D();
    for(int row = 0; row < pixs.length; row++){
      for(int col = 0; col < pixs[0].length; col++){

        Pixel pix = pixs[row][col];
        Pixel fin = imgpix[row][col];
        if(pix.getRed() % 2 == 1){
          fin.setColor(Color.BLACK);

        }
        else{
          fin.setColor(Color.WHITE);
        }
      }
    }
    return newimg;

  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
