package Z_RandomPracticeData.FirstPDF;


 interface  intf{
    public void m1();
}

public class ThisKeyword {

    int x=777;

    public void m2() {
        intf i = () -> {
            int x = 888;
            System.out.println(x);
            System.out.println(this.x);
        };
        i.m1();
    }


    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword();
        t.x =100;
        t.m2();

    }
}
