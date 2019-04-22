import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class BubbleSortTest {
	 private BubbleSort bs = null;
	    @Before
	    public void setUp() throws Exception {
	        bs = new BubbleSort();
	    }
	    @Test
		public void test() {
	    	 int arr[] = new int[]{1,6,2,2,5};
	         bs.BubbleSort(arr);
	         int ans[] = new int[]{1,2,2,5,6};
	         assertArrayEquals(ans,arr);
		}

}
