import java.util.Scanner;
public class W05_IfElseif_PosNegZero {
    public static void main(String[] args) {
     Scanner kb = new Scanner (System.in);
     System.out.print ("Enter a Number :");
     int number = kb.nextInt();
       
        if(number > 0) {
            System.out.println(number+" is Positive number");
        } else if(number < 0) { 
            System.out.println(number+" is Nagative number");
        } else if(number==0){
            System.out.println(number+ " is Zero ");
        }
        kb.close();
    }
}

