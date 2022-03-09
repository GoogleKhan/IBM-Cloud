package p1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CaculatorTest {

	@Test
	public void testAdd() {

		Calculator calculator = new Calculator();
		int result = calculator.add(10, 5);

		Assert.assertEquals(5, result);
	}

}
