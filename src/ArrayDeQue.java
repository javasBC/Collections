import java.util.ArrayDeque;

public class ArrayDeQue {

    public static void main(String[] args) {
        ArrayDeque<String> q1=new ArrayDeque<>();

        q1.add("a");// enter from the tail
        q1.add("b");
        q1.addFirst("c");//enter from the head
        q1.addLast("d");// enter from the tail
        q1.offerFirst("g");
        q1.offer("g");
        q1.offerLast("p");
        System.out.println(q1.size());

        System.out.println(q1.peekLast());//the last element
        System.out.println(q1.peekLast());//the last element
        System.out.println(q1.peekLast());//the last element
        System.out.println(q1.peekLast());//the last element
        System.out.println(q1.peekLast());//the last element
        System.out.println(q1.peekLast());//the last element

        //System.out.println(q1.removeLast());
        //System.out.println(q1.remove());
        //System.out.println(q1.removeFirst());
       //System.out.println(q1.pollFirst());
       //System.out.println(q1.pollLast());
        q1.iterator();

        System.out.println(q1);



    }
}
