
public class Garage {
     Vehicle spacio = new Car("Grey", true);
     Vehicle tata = new Truck("white",true);
        
           public String setVehicle(Vehicle parked){
               
           return parked.toString();
    
           }
           public String toString(){//overriding the toString() method  
           return tata.toString()+spacio.toString();  
        }
}
