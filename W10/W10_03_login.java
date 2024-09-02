package W10;

import java.util.Scanner;

public class W10_03_login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนชื่อ : ");
        String inputusername = kb.nextLine();
        System.out.print("กรุณาป้อนรหัสผ่าน : ");
        String inputpassword = kb.nextLine();
        if (username.equals(inputusername) && password.equals(inputpassword)) {
            System.out.println("เข้ารหัสผ่านเเล้ว");
        } else {
            if (!username.equals(inputusername) && password.equals(inputpassword)) {
                System.out.println("ชื่อผู้ใช้ไม่ถูกต้อง");
            } else if (username.equals(inputusername) && !password.equals(inputpassword)) {

                System.out.println("รหัสผิดพลาด");
            } else {

                System.out.println("ชื่อผู้ใช้เเละรหัสผิดพลาด");
            }
        }
    }
}