//Add this method to picture tester
public static void testEncodeAndDecode(){
    Picture nyc = new Picture("ny.jpg");
    nyc.explore();      //display original image
    Picture city = new Picture("sf.jpg");
    nyc.goodencode(city);
    nyc.explore();      //display encoded image
    Picture decoded = nyc.gooddecode();
    decoded.explore();    //display message
  }


//add these to Picture.java
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



  