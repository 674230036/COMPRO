// โจทย์
// 1. สร้างโปรแกรมเพื่อแสดงข้อมูลทั้งหมดใน Array
// 2. หาผลรวมของข้อมูลทั้งหมดใน Array
// 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
// 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
// 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่
package W14;

import java.util.Scanner;

public class W14_01_SumNumber {

    public static void main(String[] args) {
        
        int numbers[] = {10, 30, 17, 9, 31, 225, 64, 89, 5, 120};
// 1. แสดงรายการข้อมูลใน Array ทั้งหมด
       for(int i = 0; i<numbers.length; i++){
        System.out.println("Data in Array are: "+ numbers[i]);
       }

        System.out.println("\n====================================");
        // 2. หาผลรวมของข้อมูลทั้งหมด

        System.out.println("====================================");
 int sum =0;
    for(int i=0; i< numbers.length; i++) {
                System.out.println("Data in Array are: "+ numbers[i]);
                sum = sum + numbers[i];
    }
            System.out.println("\n sum of Number "+ sum);




        // 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
                
        System.out.println("====================================");
         Scanner kb = new Scanner(System.in);
      int [] newnumbers = new int [5];
        for(int i=0; i< newnumbers.length; i++) {
                System.out.println("Enter number"+(i+1)+": ");
            newnumbers[i] = kb.nextInt();
        }
        // 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
        for(int i = 0; i<newnumbers.length; i++){
        System.out.println("Data in Array are: "+ newnumbers[i]);
       }
        System.out.println("====================================");
                // 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่
       sum =0;
    for(int i=0; i< newnumbers.length; i++) {
                System.out.println("Data in NewArray are: "+ newnumbers[i]);
                sum = sum + newnumbers[i];
    }
            System.out.println("\n newsum of Number "+ sum);

      System.out.println("====================================");
      //6 รวมผลรวมทั้งใน Arrayข้อ 1กับข้อ 3
        int [] mergeNumber = new int [numbers.length + newnumbers.length];
        for (int i = 0; i < numbers.length; i++) {
            mergeNumber[i] = numbers[i];
        }
        for (int i = 0; i < newnumbers.length; i++) {
            mergeNumber[numbers.length + i] = newnumbers[i];
        }
       sum =0;
       System.out.println("Data in New Array are:");
    for(int i=0; i< mergeNumber.length; i++) {
                System.out.print(mergeNumber[i]+" ");
                sum = sum + mergeNumber[i];
    }
            System.out.println("\n Nsum of Number "+ sum);
      System.out.println("====================================");

            
        }
    }

