package D_Java8.JavaBrains;

public class Wisher {

    public void wish(Wishing wishing){
        wishing.perform();
    }
    public static void wish1(WBirthDayWish BirthDayWish){
        BirthDayWish.perform();
    }

    public static void main(String[] args) {
//Object
        // Class Object.
        Wisher wisher = new Wisher();
        // Interface implemented class object.
        WBirthDayWish birthDayWish = new WBirthDayWish();
        // Interface Object using implemented class.
        Wishing birthDayWish1 = new WBirthDayWish();

//Calling methods via Object
        //Calling implemented class method via this class object instance.
        wisher.wish(birthDayWish);
        //Calling implemented Interface method via this class object instance.
        wisher.wish(birthDayWish1);
        //Calling implemented Interface method via class and interface objects.
        birthDayWish.perform();
        birthDayWish1.perform();
        //Calling static method.
        Wisher.wish1(birthDayWish);

//Calling methods via Anonymous Class
        // Using Anonymous Class
        Wishing birthDayWish2 = new WBirthDayWish(){
            public void perform() {
                    System.out.println("hello");
                };
        };
        //Calling implemented method
        birthDayWish2.perform();

//Calling methods via Lambda Expression

     Wishing lambdaExTest = ()-> System.out.println(" Hello Lambda");
        wisher.wish(birthDayWish);

    }
}
