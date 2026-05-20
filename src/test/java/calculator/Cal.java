package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Cal {
	
	
	@Test
    public void testAddition() {
        int result = 2 + 2;
        Assert.assertEquals(result, 4);
        System.out.println("Addition Test Passed!");
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 2;
        Assert.assertEquals(result, 3);
        System.out.println("Subtraction Test Passed!");
    }

    @Test
    public void testMultiplication() {
        int result = 3 * 3;
        Assert.assertEquals(result, 9);
        System.out.println("Multiplication Test Passed!");
    }

	

}
