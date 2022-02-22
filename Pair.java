public class Pair <K,V>{
    // DATA

    // create one instance
    // this instance ,ust be public
    // if the instance = null -> create it

    private K a;
    private V b;

    private static Pair instance;



    private Pair(K a, V b) {
        this.a = a;
        this.b = b;
    }


    public static  <A,B> Pair getInstance(A a,B b) {
        if(instance== null)
            instance= new Pair(a,b);
        else {
            instance.a = a;
            instance.b=b;
        }
        return instance;
    }


    @Override
    public String toString() {
        return "Pair{" + a +" ===>>> " + b + '}';
    }

    public K getA() {
        return a;
    }

    public void setA(K a) {
        this.a = a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }
}
