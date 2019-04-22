import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;




public class BackPackTest {
    private BackPack bp = null;
    @Before
    public void setUp() throws Exception {
        bp = new BackPack();
    }
    @Test
	public void test() {
		 int m = 10;
	        int n = 3;
	        /*
	        放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
	         */
	        int w[] = {3, 4, 5};
	        int p[] = {4, 5, 6};
	        int c[][] = bp.BackPack_Solution(m, n, w, p);
	        assertEquals(11,c[3][10]);
	}

}
