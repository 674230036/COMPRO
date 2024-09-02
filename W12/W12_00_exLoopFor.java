// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 
package W12;

public class W12_00_exLoopFor {

    public static void main(String[] args) {

// โครงสร้างคำสั่งลูป for แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า
// TODO
// ======================================================================
//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
        // System.out.println("รอบที่ 1");
        // System.out.println("รอบที่ 2");
        // System.out.println("รอบที่ 3");
        // System.out.println("รอบที่ 4");
        // System.out.println("รอบที่ 5");
        System.out.println("TODO 1-For Loop");
        int total;
        for (int i = 1; i <= 5; i++) {
            System.out.println("รอบที่ " + i + " ");
        }
        System.out.println("-----------------------------------------------------");
// ==============================TODO 1 End FOR Loop=======================================
        System.out.println("TODO 1-While loop");
        int time = 1;
        while (time <= 5) {
            System.out.println("รอบที่ " + time + "");
            time++;
        }
        System.out.println("== == == == == == == == == == == == == == ==");
// == == == == == == == == == == == == == == == TODO 1 End While == == == == == == == == == == == == == == == == == == ==

// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello WorldF
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World
// TODO
        System.out.println("TODO 2-For Loop");
        int n1;
        for (int i = 1; i <= 5; i++) {
            System.out.println("รอบที่ " + i + " Hello World");
        }
        System.out.println("-----------------------------------------------------");
// ==============================TODO 2 End FOR Loop=======================================
        System.out.println("TODO 2-While loop");
        int l = 1;
        while (l <= 5) {
            System.out.println("รอบที่ " + l + " Hello World");
            l++;
        }
        System.out.println("== == == == == == == == == == == == == == ==");
// == == == == == == == == == == == == == == == TODO 2 End While == == == == == == == == == == == == == == == == == == ==

//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10
// TODO
        System.out.println("TODO 3-For Loop");
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println("-----------------------------------------------------");

// ==============================TODO 3 End FOR Loop=======================================
        System.out.println("TODO 3-For Loop");
        int c = 0;
        while (c <= 10) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println("-----------------------------------------------------");

// == == == == == == == == == == == == == == == TODO 3 End While == == == == == == == == == == == == == == == == == == ==
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55
// TODO
        System.out.println("\n");
        total = 0;
        for (int m = 1; m <= 10; m++) {
            total = total + m;
            if (m < 10) {
                System.out.print(" " + m);
            } else {
                System.out.println(" " + m + " = " + total);
            }
        }

// ==============================TODO 4 End FOR Loop=======================================












// == == == == == == == == == == == == == == == TODO 4 End While == == == == == == == == == == == == == == == == == == ==
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
// TODO
        System.out.println("\n");
        total = 0;
        for (int k = 1; k <= 10; k++) {
            total = total + k;
            if (k < 10) {
                System.out.print(k + "+");
            } else {
                System.out.println(k + " = " + total);
            }
        }

// ==============================TODO 5 End FOR Loop=======================================
// == == == == == == == == == == == == == == == TODO 5 End While == == == == == == == == == == == == == == == == == == ==

//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1
// TODO
        System.out.println("\n");
        total = 10;
        for (int p = 1; p <= 10; p++) {
            System.out.print(total + " ");
            total--;
        }

// ==============================TODO 6 End FOR Loop=======================================








// == == == == == == == == == == == == == == == TODO 6 End While == == == == == == == == == == == == == == == == == == ==

//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19
// TODO
         System.out.println("TODO 7-For Loop");
        total = 1;
        for (int p = 1; p <= 10; p++) {
            System.out.print(total + " ");
            total += 2;
        }
                System.out.println("======================================");


// ==============================TODO 7 End FOR Loop=======================================
  System.out.println("TODO 7-While Loop");
        time = 1;
       int op =0;
        while(time <= 10)
        {
            System.out.print(op + " ");
            op += 2;
            time++;
        }
            System.out.println("======================================");

// == == == == == == == == == == == == == == == TODO 7 End While == == == == == == == == == == == == == == == == == == ==

//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20
// TODO
        System.out.println("\n");
        total = 2;
        for (int p = 1; p <= 10; p++) {
            System.out.print(total + " ");
            total += 2;
        }
// ==============================TODO 8 End FOR Loop=======================================











// == == == == == == == == == == == == == == == TODO 8 End While == == == == == == == == == == == == == == == == == == ==
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100
// TODO
        System.out.println("\n");
        for (int p = 1; p <= 10; p++) {
            total = p * p;
            System.out.print(total + " ");
        }

// ==============================TODO 9 End FOR Loop=======================================















// == == == == == == == == == == == == == == == TODO 9 End While == == == == == == == == == == == == == == == == == == ==//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่
// TODO
System.out.println("TODO 3-For Loop");
        System.out.println("\n");
        for (int p = 1; p < 5; p++) {
            if (p % 2 == 0) {
                System.out.println("Even" + p);
            } else {
                System.out.println("Odd" + p);
            }
        }
            System.out.println("======================================");

// ==============================TODO 10 End FOR Loop=======================================
          System.out.println("TODO 3-While Loop");
         int OdEv = 1;
         while (OdEv < 5) {
            if (OdEv % 2 == 0){
                    System.out.println("Even" + OdEv);
            } else {
                System.out.println("Odd" + OdEv);
            }
            OdEv++;
        }
           System.out.println("======================================");












// == == == == == == == == == == == == == == == TODO 10 End While == == == == == == == == == == == == == == == == == == ==
    }
}