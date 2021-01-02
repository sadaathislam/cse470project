package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import orderingsystem.CONTROLLER.*;

class PasswordTest {
	Password p;

	@BeforeEach
	void setUp() throws Exception {
	  p = new Password("Kai'sa");
	}
	
	@Test
	public void getPasswordtest() {
		assertEquals("Kai'sa",p.getPassword());
	}
	@Test
	public void getTriestest() {
		assertEquals(3,p.getTries());
	}

}
