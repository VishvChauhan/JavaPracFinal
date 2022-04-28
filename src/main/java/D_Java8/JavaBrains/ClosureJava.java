package D_Java8.JavaBrains;

public class ClosureJava {


    public static void doProcess(int i, Process pro){
        pro.process(i);
    }
    public static void main(String[] args) {

        int a =10;
        int b=5;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                //b=4; should be final or effectively final.
                System.out.println(i+b);
            }
        });

        doProcess(a,  i ->System.out.println(i-b));
                //b=4; should be final or effectively final.
    }

}

interface Process{
    void process(int i);
}
