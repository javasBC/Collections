import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count=0;

    public void add(T item){
        items[count++]=item;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator(this);
    }

    //inner Class
    private class GenericListIterator implements Iterator<T>{
        private GenericList<T> list ;
        private  int index=0;

        public GenericListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index<list.count);
        }

        @Override
        public T next() {

            return list.items[index++];
        }
    }
}
