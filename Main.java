import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Main {
    //creat  ageneric type to represent a pair of objects
    // the two objects in the pair can be a different types

    public static void main(String[] args) {
        //var p1 = new Pair<int >(3, "hodi");
        //int p2 = 13;
        //Integer x = new Integer(13);
        //Shape s;
        //s = new Shape();
//
        ////System.out.println(p1);
//
        //Pair p3=Pair.getInstance("Sting",1);
        //System.out.println(p3);
        //Pair p4 =Pair.getInstance(LocalDateTime.now(),19.5);
        //System.out.println(p4);
        //System.out.println(p3);
//
        //var genericList=new GenericList<Integer>();
        //genericList.add(3);
        //genericList.add(5);
        //genericList.add(0);
        //genericList.add(7);
        //genericList.add(19);
        //genericList.add(55);
        ////[]    [4,5,6,7]
        ////             ^
        ////     value=7
        //for (var i : genericList){
        //    System.out.println(i);
        //}
//
        //while (genericList.s.hasNext()){
        //    System.out.println(genericList.s.next());
        //}

        //ArrayList<Integer> arrayList= new ArrayList<>();
        //arrayList.add(4);
        //arrayList.add(5);
        //arrayList.add(6);
//
        //for(int i : arrayList){
        //    System.out.println(i);
        //}
//
       //while(arrayList.iterator().hasNext())
       //   System.out.println(arrayList.iterator().next());
//


        var stringList= new ArrayList<String>();
        //stringList.add("hodi");
        //stringList.add("dor");
        //stringList.add("eyal");
        //stringList.add("gary");
        //var s = new ArrayList<String>();
        //s.add("naama");
        //s.add("oshri");
//
        //stringList.addAll(s);
        //stringList.remove("oshri");
        //System.out.println(stringList.containsAll(s));
        //stringList.removeAll(s);
        //stringList.clear();
//
        //System.out.println(stringList);
        //String[] a = new String[10];
        //String [] arr= stringList.toArray(a);


        var fill= new FillList();
        fill.add(5.8);
        fill.add(5.3);
        fill.add(0.19);

        for(double item : fill){
            System.out.println(item);
        }





    }


}
