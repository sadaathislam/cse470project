package Test;

import static org.junit.jupiter.api.Assertions.*;
import orderingsystem.CONTROLLER.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalesReportTest {
	SalesReport r;
	@BeforeEach
	void setUp() throws Exception {
		r = new SalesReport(45,100,55);
	}

	@Test
	public void getAmounttest() {
		assertEquals(45,r.getAmount(),0);
	}
	@Test
	public void getCashtest() {
		assertEquals(100,r.getCash(),0);
	}
	@Test
	public void getChangetest() {
		assertEquals(55,r.getChange(),0);
	}

}
