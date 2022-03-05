import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        //Set<String> set= new HashSet<>();
        //set.add("sky");
        //set.add("is");
        //set.add("blue");
        //set.add("sky");
        //set.add("is");

        Set<String> set1= new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        Set<String> set2= new HashSet<>(Arrays.asList("b","c","d"));

        // Union
        //set1.addAll(set2);

        //Intersection
        //set1.retainAll(set2);

        //Difference
        //set1.removeAll(set2);


        System.out.println(set1);

    }



}
