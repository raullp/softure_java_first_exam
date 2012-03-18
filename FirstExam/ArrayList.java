
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayList
{
    private static final int INITIAL_ARRAY_LIST_CAPACITY = 4;
    
    private Object data[];
    
    private int size;
    
    public ArrayList() {
        this.data = new Object[INITIAL_ARRAY_LIST_CAPACITY];
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void add(Object element) {
        data[size++] = element;
    }
}
