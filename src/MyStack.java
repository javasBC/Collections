import java.util.ArrayDeque;

public class MyStack {
    private ArrayDeque<Double> stack= new ArrayDeque<>();

    public MyStack() {
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }
    public boolean contain(double d){
        return stack.contains(d);
    }
    public void push(double d )
    {
        stack.offerLast(d);
    }
    public double pop(){
        return stack.pollLast();
    }

    public int under(int x){
        int c=0;
        var list=new ArrayDeque<Double>();
        for (var v: stack){
            list.add(v);
        }
        for (int i=0;i<stack.size();i++){
            if(list.pollLast()<x)
                c++;
        }


        return c;
    }






}
