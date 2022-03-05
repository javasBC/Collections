import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        //List<String>list = new ArrayList<>();
        Set<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        //  O(n) -> O(10) -> O(10000000)
        // O(1)
        // {KEY , Value}

        //java: Maps
        // c# : Dictionary
        // Python : Dict
        // JavaScript : Objects
        // {k : v}

        //for(var l : list){
        //    if (l.equals("hodi"))
        //        System.out.println(l);
        //}

        //Map<Integer,User> empIds= new HashMap<>();
        //399330 -> hodi
        //543221 -> alexsey
        //122389 -> ikram

        //User s = new User(1,"a");
        //User s2 = new User(2,"b");
        //User s3 = new User(3,"c");
        //User s4 = new User(4,"d");
        //User s5 = new User(5,"e");
//
        //empIds.put(s.id,s);
        //empIds.put(s2.id,s2);
        //empIds.put(s3.id,s3);
        //empIds.put(s4.id,s4);
        //empIds.put(s5.id,s5);
        //empIds.put(6,new User(6,"f"));
        //empIds.replace(399330,"hwdi","dima");
        //empIds.putIfAbsent(399330,"dima");

        //System.out.println(empIds);
/////////////////////////////////////////////////
        // tergo1

        HashMap<String,String> hmCountry= new HashMap<>();
        hmCountry.put("ES", "Spain");
        hmCountry.put("DE", "Germany");
        hmCountry.put("FR", "France");
        hmCountry.put("CN", "China");
        hmCountry.put("US", "United States");
        hmCountry.put("RU", "Russia");
        hmCountry.put("UK", "United Kingdom");
        hmCountry.put("IN", "India");
        hmCountry.put("BR", "Brazil");
        hmCountry.put("SA", "South Africa");
        hmCountry.put("IL", "Israel");
        System.out.println(hmCountry.values());
        System.out.println(hmCountry.keySet().size());

        var keys= hmCountry.keySet();
        for( var sy : keys) {
            System.out.println("the key is : "+sy+" value is "+hmCountry.get(sy));
        }


        while(hmCountry.keySet().iterator().hasNext()){

        }

        ///////////////////////////////////





    }
}
