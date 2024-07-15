import java.util.Scanner;
public class W04_02_ifElse_compareNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number: ");
        int num2 = input.nextInt();
        int result=0;
        if (num1>num2) {
            System.out.println(" The Number: "+num1+" greater than "+num2);
            result = num1 - num2;
        } else {
            System.out.println(" The Number: " + num1 + " less than equal " + num2);
            result = num1 + num2;
        }
        System.out.println("The result is: "+ result);
    }
}
