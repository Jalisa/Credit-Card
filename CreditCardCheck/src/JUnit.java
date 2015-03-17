import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit extends CardValidation {
	@Test
	public void testisValid() {
		assertEquals("79927398710", true, checkSingleDigit(0));
	}

}