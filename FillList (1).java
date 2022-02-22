import java.util.Iterator;

public class FillList implements Iterable<Double>{
    private  double[] items = new double[10];
    private int count;

    public void add (double item){
        this.items[count++]=Math.ceil(item);
    }

    public double get(int index) {
        return items[index];
    }


    // private class XXXXXX implements Iterator<Double>
    @Override
    public Iterator<Double> iterator() {
        return new Iterator<Double>() {
            private int innerCount;
            @Override
            public boolean hasNext() {
                return innerCount<count;
            }

            @Override
            public Double next() {
                return items[innerCount++];
            }
        };
    }




}
