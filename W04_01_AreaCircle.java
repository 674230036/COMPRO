import java.util.Scanner;
public class W04_01_AreaCircle {
    public static void main (String [] args){
        Scanner sc = new  Scanner (System.in);
        System.out.print("ป้อนรัศมีของวงกลม: ");
        double radius = sc.nextDouble();
             //double radius;
             double area;
             double PI = 3.14159;
         //radius = 10;
         area = PI*radius*radius;
      System.out.println("Area: "+radius+"\nคือ: "+area);


    }

}
