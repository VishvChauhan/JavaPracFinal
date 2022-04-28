package C_Collections.RandomTest;


public class VishuCollection {

    private Object[] objArr  ;
    private int elementCount=0;
   // public VishuCollection() {}

    public VishuCollection(Object[] objArr) {
        this.objArr = objArr;
    }

    private void add1(Object obj){
       // objArr=new Object[5];
        if(elementCount == objArr.length){
            increaseCapacity();
        }
        objArr[elementCount] = obj;
        elementCount++;
    }

    private void increaseCapacity() {
        int Cap = objArr.length * 2;

        Object [] newArray = new Object[Cap];
        for( int i=0; i <newArray.length; i ++){
            newArray[i] = objArr[i];
        }


    }


    public int capacity(){
        return objArr.length;
    }

    public static void main(String[] args) {


       Object[] obj1 = new Object[5];



        VishuCollection col = new VishuCollection(obj1);
        col.add1("1");
        col.add1("s");
        col.add1("v");
        col.add1("1");
        col.add1(5);
        col.add1('c');

        System.out.println(col.capacity());
        for( int i=0; i <obj1.length; i ++){
            System.out.println(obj1[i]);
        }
    }
}
