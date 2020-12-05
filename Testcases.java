
public class Testcases {
    
     public static void main(String[] args) {
        
       Vehicle benz = new Car("blue",false);
       
       Vehicle Scania = new Truck("black",false);
       
       
        GarageTester BnG = new GarageTester();
       
        CarRentalContract c2 = new CarRentalContract("Ronald Rani"," Kampala");    
        CarRental v8 = new CarRental();
        v8.addContract(c2);
        
       System.out.println(benz.toString());
       System.out.println(Scania.toString()); 
       System.out.println("BnG Garage Tester: "+BnG.getExample()); 
       System.out.println("CarRental Contract:"+v8.displayContracts());     
        
    }
    
}
