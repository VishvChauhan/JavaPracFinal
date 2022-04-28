package C_Collections.RandomTest;

import java.util.ArrayList;

public class BikeExample {

    public static void main(String[] args) {
       BikeFactorty Bk = new BikeFactorty();
       // System.out.println(Bk.generateBike(5));

        int item = 5;
        ArrayList<Bike> store = Bk.generateBike(item);
        System.out.println(store);
        for( int k = 0; k < store.size(); k++){
            System.out.println(store.get(k).toString());
        }
    }

}


class BikeFactorty{

   ArrayList generateBike(int n){
       ArrayList<Bike> bikes = new ArrayList();
       for( int i= 0; i <n;i++){
           bikes.add(new Bike(i));
       }
       return bikes;
   }
}


 class Bike{
    //variable
    int BKid;

     //constructor
    Bike(int item1){
        this.BKid = item1;
    }
     //method
    public String toString(){
        return "Bike[bikeid : " + BKid + "]";
    }

}
