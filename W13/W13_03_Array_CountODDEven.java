package W13;

public class W13_03_Array_CountODDEven {
    public static void main(String[] args) {
        int [] number = {1, 5, 6, 34, 7, 8, 10, 10, 50, 44, 10, 20, 30, 40, 45, 87, 65, 10, 47, 12, 40, 41};
        int countodd = 0;
        int counteven = 0;
         System.out.println("\n===========================================================================================================");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" / ");
            if (number[i]% 2 == 0){
               counteven++; //เอามาเพิ่มค่าคู่
        }else{
              countodd++; //เอามาเพิ่มค่าเลขคี่
    }
    }
         System.out.println("\n===========================================================================================================");
        System.out.println("The Even "+ counteven);
    System.out.println("The Odd "+ countodd);
}
}

    

