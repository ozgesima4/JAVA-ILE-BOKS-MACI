package boksmacı;

public class Fighter {
    String name;
    int healthy;
    int damage;
    int weight;
    

    public Fighter(String name, int healthy, int damage, int weight ) {
        this.name = name;
        this.healthy = healthy;
        this.damage = damage;
        this.weight = weight;
       
    }
    int hit(Fighter ff1){
        System.out.println(this.name+" "+ff1.name+" e"+this.damage+"kadar hasar vurdu...");
        
        if(ff1.healthy-this.damage<0){
            return 0;
        }
        return healthy-damage;    
    }
    
  
}
