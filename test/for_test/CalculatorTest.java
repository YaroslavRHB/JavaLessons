package for_test;

import lessons.for_test.Calculator;
import org.junit.*;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class CalculatorTest {

    @BeforeClass
    public static void beforeAllTests() {
        //     System.out.println("Before all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        //     System.out.println("After all tests");
    }

    @Before
    public void beforeEachTest() {
        //     System.out.println("Before each test");
    }

    @After
    public void afterEachTest() {
        //     System.out.println("After each test");
    }

    @Rule
    public SystemOutRule outRule = new SystemOutRule().enableLog();

    @Test
    public void shouldReturnSumOfValues() {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(4, 5);

        Assert.assertEquals("Should return 9", 9, sum);
    }

    @Test
    public void shouldReturnSumOfValues1() {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(4, 5);

        Assert.assertEquals("Should return 9", 9, sum);
    }

    @Test
    public void shouldReturnDifferenceOfValues() {
        Calculator calculator = new Calculator();

        int difference = calculator.difference(4, 5);

        Assert.assertEquals("Should return -1", -1, difference);
    }

    @Test
    public void shouldReturnProductOfValues() {
        Calculator calculator = new Calculator();

        int product = calculator.product(4, 5);

        Assert.assertEquals("Should return 20", 20, product);
    }

    @Test
    public void shouldReturnQuotientOfValues() {
        Calculator calculator = new Calculator();

        double quotient = calculator.quotient(10, 5);

        Assert.assertEquals(2.0, quotient, -1); // ???
    }

    @Test
    public void shouldTestConsole() {
        Calculator calculator = new Calculator();

        calculator.print();

        String log = outRule.getLog();

        Assert.assertTrue(log.contains("Hello"));
    }
}
