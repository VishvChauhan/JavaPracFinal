package Z_RandomPracticeData.FirstPDF;


interface InterS1{
    public  static int add(int a , int b){
        return a+b;

    }
}

interface InterM1{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}


public class StaticMethodTest
    //implements InterS1
    //We can define exactly same method in the implementation class, it’s valid but not overriding.

 {


    public static void main(String[] args) {
       // StaticMethodTest s = new StaticMethodTest();
      //  s.add();
       // StaticMethodTest.add();
        //call it with interface name

        System.out.println(InterS1.add(10,20));
    }



}
