
import java.util.Arrays;

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
    
    private int currentIndex;
    
    public ArrayList() {
        this.data = new Object[INITIAL_ARRAY_LIST_CAPACITY];
        this.currentIndex = 0;
    }
    
    public boolean isEmpty() {
        return currentIndex == 0;
    }
    
    public void add(Object element) {
        int listCapacity = data.length;
        if(currentIndex>= listCapacity)
            resize();
        
        data[currentIndex++] = element;
    }
    
    private void resize() {
        int newCapactity = data.length * 2;
        
        Object newData [] = Arrays.copyOf(data, newCapactity);
        
        data = newData;
    }
    
    public int size() {
        return currentIndex;
    }
}
