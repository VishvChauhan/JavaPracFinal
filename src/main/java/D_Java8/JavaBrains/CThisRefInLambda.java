package D_Java8.JavaBrains;

public class CThisRefInLambda {

    public static void doProcess(int i , Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(10,in-> {System.out.println("hello");
            System.out.println(this);});
    }
    public String toString() {
        return "This Ref In Lambda";
    }

    public static void main(String[] args) {
        int i =10;

        // will work in anonymous class
        doProcess(i, new Process() {
            @Override
            public void process(int i) {
                System.out.println("hello");
                System.out.println(this);
            }
            public String toString() {
                return "This Ref In Lambda";
            }
        });

        //Will work within lambda static block
        CThisRefInLambda c = new CThisRefInLambda();
        c.execute();

        //won't work within lambda static block
        /*doProcess(i,in-> {System.out.println("hello");
        System.out.println(this);});*/

    }
}
