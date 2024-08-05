//  A  =>  80-100
//  B  =>  70-79
//  C  =>  60-69
//  D  =>  50-59
//  E  =>  0-49

package W08;
import java.util.Scanner;
public class W08_07_Grade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Your Score (0-100) : ");
        byte score = kb.nextByte();
        if (score > 100 || score < 0) {  
            System.out.println("Out of range");
        } else if (score >= 80) {
            System.out.println("Yore Grade is A");
        } else if (score >= 70) {
            System.out.println("Yore Grade is B");
        } else if (score >= 60) {
            System.out.println("Yore Grade is C");
        } else if (score >= 50) {
            System.out.println("Yore Grade is D");
        } else {
            System.out.println("Yore Grade is E");
        }
        kb.close();
    }

}
