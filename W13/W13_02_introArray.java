package W13;
import java.util.Scanner;
public class W13_02_introArray {
    public static void main(String[] args) {
        String [] brandCars = new String[3];
        Scanner kb = new Scanner(System.in);
        // กำหนด ค่าให้กับ Arry
         brandCars[0]= "Toyota";
         brandCars[2]= "Honda";
         brandCars[1]= "Nissan";
         //เเสดงผลโดยใช้ loop
                  System.out.println("\n=========================================== " );
           System.out.println("Old  Barn of cars in the array are " );
         for (int i = 0; i < brandCars.length; i++) { 
              System.out.print(brandCars[i]+ "/ ");
         }

          //เเก้ไข Arry โดยรับค่าจากคีย์บอร์ด
        System.out.println("\n\n Please enter the brand of the 3rd car : ");
          for (int i = 0; i < brandCars.length; i++) {
            System.out.println("Enter the brand of the car"+(i+1)+ ": ");
            brandCars[i] = kb.next();
    
      }
         System.out.println("\n=========================================== " );
         System.out.println("\n New Barn of cars in the array are " );
          for (String car : brandCars) { // ใช้ for - each loop
              System.out.print(car+ "/ ");
         }
    }
    
}
