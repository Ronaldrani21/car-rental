
public class Truck extends Vehicle{
    
    boolean wintertires = false;
    
        Truck(String col, boolean hastrailor){
            
         this.color = col; 
         
        this.wintertires = hastrailor;
        
        }
        
      public String toString(){ 
             
            return "This vehicle is "+getcolor(color)+",has Trailor: "+wintertires;  
    }
    
    }
        
        
