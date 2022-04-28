package D_Java8.JavaBrains;

public class  RunnableExample {

    public static void main(String[] args) {


//Calling methods via Anonymous Class
        // Using Anonymous Class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
        thread.run();

//Calling methods via Lambda Expression
        Thread t1 = new Thread ( () -> {System.out.println("hello 2");});
        t1.run();

    }
}
