package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import orderingsystem.CONTROLLER.*;

class OrderTest {
	Order t;
	@BeforeEach
	void setUp() throws Exception {
		t = new Order("Burger", 250.0, 5);
	}

	@Test
	public void getMealtest() {
		assertEquals("Burger", t.getMeal());
	}
	@Test
	public void getPricetest() {
		assertEquals(250.0, t.getPrice(),0);
	}
	@Test
	public void getQuantitytest() {
		assertEquals(5, t.getQuantity());
	}
	@Test
	public void getAmounttest() {
		assertEquals(1250, t.getAmount(),0);
	}

}
