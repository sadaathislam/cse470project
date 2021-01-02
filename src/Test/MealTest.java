package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import orderingsystem.CONTROLLER.*;

class MealTest {
	Meal m;

	@BeforeEach
	void setUp() throws Exception {
	 m = new Meal("Burger",150.0);
	}

	@Test
	public void getMealtest() {
		assertEquals("Burger",m.getMeal());
	}
	@Test
	public void getPricetest() {
		assertEquals(150,m.getPrice(),0);
	}
	@Test
	public void setMealtest() {
		m.setMeal("Pizza");
		assertEquals("Pizza",m.getMeal());
	}
	@Test
	public void setPricetest() {
		m.setPrice(120);
		assertEquals(120,m.getPrice(),0);
	}



}
