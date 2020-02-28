import java.util.*;
import java.text.DecimalFormat;

public class PEEBthree {
  public static void main(String[] args) {
    System.out.println("Calculate weight% of CO2 in Earth's atmosphere and");
    System.out.println("anthropomorphic contribution to that weight. Estimate");
    System.out.println("zero-emissions recovery time and project future trends.");
    System.out.println();



    Scanner console = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00E00");
    System.out.print("carbon footprint per person (tons) = ");
    double footprint = console.nextDouble();
    System.out.println("annual per capita CO2 absorption capacity = ");
    double capita = console.nextDouble();



    System.out.println("surface area Earth (sq mi) = 1.97E08");
    System.out.println("surface area Earth (sq in) = 7.91E17");
    System.out.println("weight of atmosphere (lbs) = 1.16E19");
    System.out.println("weight of atmosphere (tons) = 5.81E15");
    System.out.println("weight concentration CO2 (ppmw) = 616");
    System.out.println("weight percent CO2 = 0.062");
    System.out.println("weight CO2 (tons) = 3.58E12");
    double tons = 3.58*Math.pow(10,12);
    System.out.println();



    double anthro = 7.3*Math.pow(10,9)*footprint;
    double percent = (anthro/tons)*100.0;
    double centrounded = Math.ceil(percent*1000)/1000;
    System.out.println("anthropormorphic CO2 footprint (tons) = " + df.format(anthro));
    System.out.printf("anthropomorphic CO2 percent = %5.3f", centrounded);
    System.out.println();
    System.out.println();




    double capacity = 7.3*Math.pow(10,9)*capita;
    double right = (3.58*Math.pow(10,12)-2.51*Math.pow(10,12));
    double years = right/capacity;
    int years2 = (int)Math.ceil(years);
    System.out.println("weight CO2 in 1750 (tons) = 2.51E12");
    System.out.println("CO2 weight gain (tons) = 1.07E12");
    System.out.println("CO2 annual absorption capacity (tons) = " + df.format(capacity));
    System.out.println("zero-emissions absorption time (years) = " + years2);
    System.out.println();




    System.out.println("average CO2 interest rate since 1900 (percent) = 0.311");
    System.out.println("20 year factor @ 2015 interest rate = 1.18");
    System.out.println("50 year factor @ 2015 interest rate = 1.50");
    System.out.println("100 year factor @ 2015 interest rate = 2.26");
  }
}
