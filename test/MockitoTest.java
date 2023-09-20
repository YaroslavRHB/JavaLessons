import lessons.for_test.CalculatorMockito;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    @Mock
    CalculatorMockito mock;

    @Spy
    CalculatorMockito spy;

    @Test
    public void shouldMockMethod() {
        Mockito.when(mock.getRandom()).thenReturn(15);
        Mockito.when(mock.sum(ArgumentMatchers.anyInt())).thenCallRealMethod();

        int sum = mock.sum(6);

        Assert.assertEquals(21, sum);
    }

    @Test
    public void shouldMockMethodWithAnnotationMock() {

        Mockito.when(mock.getRandom()).thenReturn(15);
        Mockito.when(mock.sum(ArgumentMatchers.anyInt())).thenCallRealMethod();

        int sum = mock.sum(6);

        Assert.assertEquals(21, sum);
    }
    @Test
    public void shouldMockMethodWithAnnotationSpy() {

        Mockito.when(spy.getRandom()).thenReturn(15);

        int sum = spy.sum(6);

        Assert.assertEquals(21, sum);
    }


}
