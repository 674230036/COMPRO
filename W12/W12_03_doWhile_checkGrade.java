package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

          int Score;// ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน

       // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
            System.out.print("Enter Your Score between 1 and 100 " );
            Score = kb.nextInt();
        } while (Score<1 || Score>100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
        
          if (Score >= 80) {
            System.out.println("Grade A");

        } else if (Score >= 70) {
            System.out.println("Grade B");

        } else if (Score >= 60) {
            System.out.println("Grade C");

        } else if (Score >= 50) {
            System.out.println("Grade D");

        } else {
            System.out.println("Grade E");
        }
        kb.close(); // ปิด Scanner object
    }
}

