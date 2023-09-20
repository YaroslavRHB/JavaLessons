package for_test;

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
public class MockitoVerifyTest {

    @Spy
    CalculatorMockito spy;//field with name spy, type CalculatorMockito

    @Test
    public void shouldMockMethod() {
        Mockito.when(spy.getRandom()).thenReturn(15);

        int sum = spy.sum(6);

        Assert.assertEquals(21, sum);
        Mockito.verify(spy, Mockito.times(1)).getRandom();
        Mockito.verify(spy, Mockito.times(1)).sum(ArgumentMatchers.anyInt());
        Mockito.verifyNoMoreInteractions(spy);
    }

}
