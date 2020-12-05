
public class CarRental {
            String carArray[] = new String[25];
       
        void addContract(CarRentalContract c1){
            for(int x=0; x<carArray.length; x++){
                carArray[x] = c1.toString();
            }
        }
       
        String displayContracts(){
           
            for (String y : carArray){
               
                return y;
            }
           
            return "There are no contracts for CarRental";
        }
}
