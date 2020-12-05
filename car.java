
public class Car extends Vehicle{
        
       boolean wintertires = false;

    
        Car(String col, boolean hastires){
            
         this.color = col; 
         
        this.wintertires = hastires;
        
        }
        
         public String toString(){ 
             
            return "This vehicle is "+getcolor(color)+",has winter tires: "+wintertires;  
    }
    
    }
