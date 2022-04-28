package Z_RandomPracticeData.FirstPDF;


interface interF{

    // Interface with 1 abstract and 2 default methods.
    //public void add();
    default void test1(){
        System.out.println("default Method 1");
    };
    default void test2(){  System.out.println("default Method");};
}


interface interG{
    default void test1(){
        System.out.println("default Method 2");
    };
}


public class defaultMethodTest implements interF,interG {


/*    @Override
    public void add() {
        System.out.println("default add 1");
    }

    @Override
    public void test1() {
        // super keyword can be used to access default method in overridden method.
        // interface.super.default method.
        interF.super.test1();
        System.out.println("default Method 1");
    }

    @Override
    public void test2() {
        interF.super.test2();
        System.out.println("default Method 2");
    }*/


    public static void main(String[] args) {

        defaultMethodTest d = new defaultMethodTest();
       // d.add();
       // d.test1();
        //d.test2();



/*        // when i just directly added it with lambda without implementing and overriding.
        interF i = () -> {
            System.out.println(10 + 20);
         };
        i.add();
        i.test1();
        i.test2();*/


/*        // when i implementing and overriding and called the method in main method.
        // super keyword can be used to access default method in overridden method.

       defaultMethodTest d = new defaultMethodTest();
            d.add();
            d.test1();
            d.test2();*/


    }


    // When you have same name default method in two different interface then
    // you have qmbiguity problem
    // so override them in main call and use below expression.
    @Override
    public void test1() {
        interF.super.test1();
        interG.super.test1();
    }
}