package W14;

public class W14_02_Array_Gender {
    public static void main(String[] args) {
        // สร้าง Array ชื่อ name เพื่อเก็บชื่อนักเรียน จำนวน 5 คน
        String [] name = {"นายสมชาย","นางสมใจ","นางสาวสมนึก","นายสมดี","นางสาวสมฤทัย"};
        String [] codes = {"123TH","124EN","125EN","126TH","127EN"};
        // 1) แสดงจำนวนนักเรียนทั้งหมด

        System.out.println("จำนวนนักเรียนทั้งหมด = "+ name.length + " คน");

          // 2) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" [startsWith()] และมีจำนวนนักเรียนเท่ากับกี่คน

        // แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย"
        System.out.println("ชื่อนักเรียนขึ้นต้นด้วยคำว่า 'นาย'");
       // System.out.println(name[0]);
        //System.out.println(name[3]);
             int count = 0;
        for (int i = 0; i < name.length; i++) {
            if(name[i].startsWith("นาย")){
           System.out.println(name[i]);
           count++;
        
            }
            
        }
                   System.out.println("จำนวนนักเรียนขึ้นต้นด้วยนาย "+count+" คน");



        // และมีจำนวนนักเรียนเท่ากับกี่คน
  
        System.out.println("====================================");
        




        //  3) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" 
        count=0;
        System.out.println("ชื่อนักเรียนขึ้นต้นด้วยคำว่า 'นาง'");
        for (int i = 0; i < name.length; i++) {
            if(name[i].startsWith("นาง")){
           System.out.println(name[i]);
           count++;
        
            }
            
        }
                   System.out.println("จำนวนนักเรียนขึ้นต้นด้วยนาง "+count+" คน");
 
        // และมีจำนวนนักเรียนเท่ากับกี่คน
    
        System.out.println("====================================");
        





        // 4) แสดงชื่อนักเรียนทั้งหมด และแสดงเพศของนักเรียนแต่ละคน
                // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" ให้แสดงว่าเป็นเพศชาย
                // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" ให้แสดงว่าเป็นเพศหญิง
        count=0;
        for (int i = 0; i < name.length; i++) {
            if(name[i].startsWith("นาง")){
           System.out.println(name[i] +" เป็นเพศหญิง");
            }else{
            System.out.println(name[i] +" เป็นเพศชาย");
            }
            count++;
            
        }
                   System.out.println("จำนวนนักเรียนทั้งหมดชายเเละหญิง "+count+" คน");
 

        // มีจำนวนนักเรียนเท่ากับกี่คน
   
        System.out.println("====================================");







        // 5) แสดงเลขลำดับของนักเรียนแต่ละคน 
                // มีจำนวนนักเรียนเท่ากับกี่คน
                // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
                // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน


        // มีจำนวนนักเรียนเท่ากับกี่คน
        

        // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
        

        // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน
       int countAll=0;
        int countMale = 0;
        for (int i = 0; i < name.length; i++) {
            if(name[i].startsWith("นาง")){
           System.out.println((i+1)+":"+ name[i] +" เป็นเพศหญิง");
             countAll++;

            }else{
            System.out.println((i+1)+":"+ name[i]+ " เป็นเพศชาย");
            countAll++;
            countMale++;
            }
            
        }
                   System.out.println("จำนวนนักเรียนทั้งหมดชายเเละหญิง "+countAll+" คน");
        System.out.println("====================================");

          System.out.println("มีจำนวนเพศชาย "+countMale+" คน");
        System.out.println("มีจำนวนเพศหญิง "+(countAll-countMale)+" คน");


                
        
        System.out.println("====================================");
        
        
        

    }
}
