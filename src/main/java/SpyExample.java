import java.util.LinkedList;

public class SpyExample<T> {

    private LinkedList<T> linkedList;


    public SpyExample(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    public boolean add (T value){
        return linkedList.add(value);
    }
    public T get (int index){
        return linkedList.get(index);
    }

}
