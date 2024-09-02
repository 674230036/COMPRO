package W12;

import java.util.Scanner; // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {
    public static void main(String[] args) {
        // ประกาศ Scanner object
        Scanner kb = new Scanner(System.in);

        int choice;
        int num1 = 1;
        int num2 = 1;

        // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้เลือก

        // ให้ผู้ใช้เลือกเมนูซ้ำจนกว่าจะเลือกออก ใช้ do-while
        // เงื่อนไขคือ วนลูปไปเรื่อยๆ จนกว่าผู้ใช้จะเลือก 3
        do {
            System.out.println("====================================");
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.println("====================================");

            System.out.print("Enter your Choice");
            choice = kb.nextInt();
            System.out.println("-------------------------------------------------");
            switch (choice) {
                case 1:
                    System.out.print("Enter the  fiest Choice");
                    num1 = kb.nextInt();
                    System.out.print("Enter the  fiest Choice");
                    num2 = kb.nextInt();
                    int sum = num1 + num2;
                    System.out.println("The sum id " + sum);
                    break;
                case 2:
                    System.out.print("Enter the  fiest Choice");
                    int num3 = kb.nextInt();
                    System.out.print("Enter the  first Choice");
                    int num4 = kb.nextInt();
                    int total = num3 - num4;
                    System.out.println("The sum id " + total);
                    break;
                case 3:
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Invalid choice Please try again");
            }
        } while (choice != 3);

    }
}
