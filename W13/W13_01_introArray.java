package W13;

public class W13_01_introArray {

    public static void main(String[] args) {
        String[] colors = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orange", "Red"};
        int [] bank = {20, 50, 100, 500, 1000};
        char [] Alphabet = {'A', 'B', 'C', 'D', 'E'};
        // เเสดงผลรับโดยใช้ index ของ Array
         System.out.println("\n ======================================================");
        System.out.println(" The First Color is " + colors[0]);
        System.out.println(" The Third Alphabet is " + Alphabet[2]);
         System.out.println("\n ======================================================");
        // เเสดงผลโดยใช้ Loop
         for (int i = 0; i < 7; i++) {
            System.out.print(colors[i] + "  ");
         }
        System.out.println("\n ======================================================");
        for (int i = 6; i >= 0; i--) {
            System.out.print(colors[i] + "  ");
        }
        System.out.println("\n ======================================================");
    System.out.println("Bank in the Arrr are:");
    for (int i = 0; i < bank.length; i++) {         //การหาขนาด ของ Arry โดยใช้ length
            System.out.print(bank[i] + "  ");
         }
          System.out.println("\n ======================================================");
    }
}
