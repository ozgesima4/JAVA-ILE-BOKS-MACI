package boksmacı;

public class BoksMacı {

    public static void main(String[] args) {
       Fighter ali=new Fighter("ali", 100, 20, 80);
       Fighter veli=new Fighter("veli", 80, 25, 55);
       
       mach m1=new mach(ali, veli, 50, 100);
       m1.run();
       
    }
    
}
