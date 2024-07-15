import java.util.Scanner;
public class W05_01_ifelse_oddevenNumber {
    public static void main(String[] args) {
     Scanner kb = new Scanner (System.in);
     System.out.print ("Enter Num :");
     int number = kb.nextInt();
     int result = number%2;
     //case1
    if(result!=0){
        System.out.println (number +" the odd");
    }else{
        System.out.println (number + " the even");
    }
    //case2
    if (result == 1) {
        System.out.println(number + " the odd");
    } else {
        System.out.println(number + " the even");
    }
    //case3
    if (result == 0) {
        System.out.println(number + " the even");
    } else {
        System.out.println(number + " the odd");
    }
    //case4
    if (result != 1) {
        System.out.println(number + " the even");
    } else {
        System.out.println(number + " the odd");
    }
    kb.close();

}
}