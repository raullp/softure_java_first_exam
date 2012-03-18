

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayListTest
{

    ArrayList list;

    /**
     * Default constructor for test class ArrayListTest
     */
    public ArrayListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list = new ArrayList();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        list = null;
    }
    
    @Test
    public void testInitializeArrayList() {
       
       assertTrue(list.isEmpty());
    }
    
    @Test 
    public void testAddElement() {
        String element = "element";
        
        list.add(element);
        
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void testSizeIncreasesForTwoElements(){
        String firstElement = "first element";
        String secondElement = "second element";
        int expectedSize = 2;
        
        list.add(firstElement);
        list.add(secondElement);
        
        assertEquals(expectedSize, list.size());
    }
    
    @Test
    public void testListResizesWhenItExeedsItsCapacity() {
        int numberOfElementsToAdd = 7;
        
        for(int i = 0; i < numberOfElementsToAdd; i++)
            list.add(i);
            
        assertEquals(numberOfElementsToAdd, list.size());
    }
    
}
