
public class CarRentalContract {
      Customer Rani = new Customer();
        Vehicle prado = new Car("brown",true);
       
        CarRentalContract(String name,String address){
            Rani.Customername = name;
            Rani.Customeraddress = address;
        }
       
       
        public String toString(){//overriding the toString() method  
           return Rani.Customername+" : "+prado.toString();  
        }
    
}
