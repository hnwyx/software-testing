package homework3;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class PrimeTest {
	private PrintPrimes p= null;
    @Before
    public void setUp() throws Exception {
        p = new PrintPrimes ();
    }
    @Test
    public void test() {
        p.printPrimes(0);
        p.printPrimes(25);
        p.printPrimes(100);
    }
}
