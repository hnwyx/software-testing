package pack1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PackTest {
    private Pack pa;
    @Before
    public void setUp() throws Exception {
          pa = new Pack();
     }
	@Test
	public void testisOk() {
		assertEquals("“Ï≥£",true,pa.judge(1));
	}
	@Test
	public void testisnotOk() {
		assertEquals("“Ï≥£",false,pa.judge(4));
	}
	@Test
	public void testtoobig() {
		assertEquals(false,pa.judge(100));
	}
}
