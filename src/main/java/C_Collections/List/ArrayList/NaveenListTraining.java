package C_Collections.List.ArrayList;


public class NaveenListTraining {
String a;
String b;
String c;

    public String getA() {
        return a;
    }


    public void setA(String a) {
        this.a = a;
    }

    int d;

    public NaveenListTraining(String a, String b, String c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public NaveenListTraining(String a, String b, int d) {
        this(a, b, null, d);
    }



    public static void main(String[] args) {



/*

        HashMap<Integer, String> mp1 = new HashMap<Integer, String>();
        mp1.put(1,"A");        mp1.put(2,"B");        mp1.put(3,"C");

        HashMap<Integer, String> mp2 = new HashMap<Integer, String>();
        mp2.put(3,"C");        mp2.put(1,"A");        mp2.put(2,"B");

        HashMap<Integer, String> mp3 = new HashMap<Integer, String>();
        mp3.put(1,"A"); mp3.put(2,"B");mp3.put(3,"C");        mp3.put(3,"D");

        HashMap<Integer, String> mp4 = new HashMap<Integer, String>();
        mp4.put(1,"A"); mp4.put(2,"B");mp4.put(3,"C");        mp4.put(4,"D");

        System.out.println(mp1.equals(mp2));
        System.out.println(mp1.equals(mp3));
        System.out.println(mp1.keySet().equals(mp3.keySet()));


        HashSet<Integer> hs = new HashSet<Integer>(mp1.keySet());
        hs.addAll(mp4.keySet());
        System.out.println(hs);
        hs.removeAll(mp1.keySet());
        System.out.println(hs);


        // with values

        System.out.println( new ArrayList<>(mp1.values()).equals(new ArrayList<>(mp4.values())));
        System.out.println( new HashSet<>(mp1.values()).equals(new HashSet<>(mp4.values())));
*/

















     /*   ArrayList<Integer> cp =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,83,4,5,6,7,8,93,4,53,4,5,6,7,8,6,7,8,10));
        ArrayList<Integer> cp1 =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,83,4,5,6,7,8,93,4,53,4,5,6,7,8,6,7,8,10,17,18,19));
        ArrayList<Integer> cp2 =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,83,4,5,6,7,8,93,4,53,4,5,6,7,8,6,7,8,10,465,465,468,456,5));*/



        // additional Element
    /*    cp2.removeAll(cp1);
        System.out.println(cp2);*/

        // Missing Element
   /*     cp1.removeAll(cp2);
        System.out.println(cp1);*/

        //  Common Element
    /*    cp1.retainAll(cp2);
        System.out.println(cp1);*/



 /*       boolean status =  cp.equals(cp1);
        System.out.println(status);


        Collections.sort(cp, (o1, o2) -> {
            if(o1 < o2){return +1;}
            if(o1 > o2){return -1;}
            else
            return 0;
        });

        Collections.sort(cp1);
        System.out.println(cp);
        System.out.println(cp1);
*/



/*
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

          for(Integer i : cp){
              if(hm.containsKey(i)){
                  hm.put(i, cp.get(i)+1);
              }else
                  hm.put(i,1);
          }

          for(Map.Entry<Integer, Integer> i : hm.entrySet()){
                System.out.println(i.getKey() +"  :  " + i.getValue());
            }

          Set set = hm.keySet();
             for(Object i : set){
                 System.out.println(i + " " + hm.get(i));
             }
*/





      /*  ArrayList<Integer> Al = new ArrayList<>(Arrays.asList(v));
        Al.removeIf(num -> num%2 != 0);
        System.out.println(Al);

        ArrayList<String> Al1 = new ArrayList<String>(Arrays.asList("tom", "hello", "me"));
        System.out.println(Al1);
        Object [] al = Al1.toArray();
        System.out.println(Arrays.toString(al));

        for(Object o: al){
            System.out.println((String) o);
        }*/


   /*  List<String> arrayList =  Collections.synchronizedList(new ArrayList<String>(Arrays.asList("tom", "hello", "me")));

     synchronized (arrayList) {
         Iterator it = arrayList.iterator();
         while (it.hasNext()) {
             System.out.println(it.next());
         }
     }
*/




    }
}