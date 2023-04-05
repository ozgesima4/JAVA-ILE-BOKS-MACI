package boksmacı;

import java.util.Random;

public class mach {
    Fighter f1;
    Fighter f2;
    int maxweight;
    int minweight;

    public mach(Fighter f1, Fighter f2, int minweight ,int maxweight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxweight = maxweight;
        this.minweight = minweight;
    }
    
   boolean Karsilasma(){
        if(f1.weight>minweight&&f1.weight<maxweight&&f2.weight>minweight&&f2.weight<maxweight){
              System.out.println("karsilasabilirler...");
              return true;
        }
        else{
            return false;
        }
          
    }
    void run(){
        if(Karsilasma()){
           
                
                
                if(baslangic()==1){
                while(f1.healthy>0 && f2.healthy>0){
                System.out.println("===YENİ ROUND===");
                f1.healthy=f2.hit(f1);
                System.out.println(f1.name+"nin"+f1.healthy+"kaldi.");
                if(isWin()){
                    break;
                }
                f2.healthy=f1.hit(f2);
                System.out.println(f2.name+"nin"+f2.healthy+"kaldi.");
                if(isWin()){
                    break;
                }}
                }
                else if(baslangic()==0){
                    while(f1.healthy>0 && f2.healthy>0){
                    System.out.println("===YENİ ROUND===");
                    f2.healthy=f1.hit(f2);
                     System.out.println(f2.name+"nin"+f2.healthy+"kaldi.");
                    if(isWin()){
                        break;
                    }
                    f1.healthy=f2.hit(f1);
                     System.out.println(f1.name+"nin"+f1.healthy+"kaldi.");
                    if(isWin()){
                        break;          
                    }
                }}
                
                
            
        }
        else{
             System.out.println("sikletleri bu maca uygun degil...");
        }
        
        
        
    }
    boolean isWin(){
        if(f1.healthy==0){
            System.out.println(f2.name+" yarisi kazanmistir.");
            return true;
        }
        else if(f2.healthy==0){
              System.out.println(f1.name+" yarisi kazanmistir.");
              return true;
        }
        else
            return false;
    }
    int baslangic(){
        Random rndm=new Random();
        int first=rndm.nextInt(2);
        if(first==0){
            return 0;
        }
           return 1;
           
    }

}
