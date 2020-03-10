import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

public class MyAwsomeClassTest {

    @Test
    public void shouldprintHappyText() {
        //given
        InternalClassMock mock = new InternalClassMock();
        InternalClass mock2 = PowerMockito.mock(InternalClass.class);
        MyAwsomeClass myAwsomeClass = new MyAwsomeClass(mock2);

        //when
        String result = myAwsomeClass.printHappyText();
        //then
        Assert.assertEquals("I AM HA",result);
    }
    @Test
    public void shouldCosTamWhenCosTam(){
        //given
        InternalClass mock = PowerMockito.mock(InternalClass.class);
        PowerMockito.when(mock.returnSomeString()).thenReturn("STUB");
        MyAwsomeClass myAwsomeClass = new MyAwsomeClass(mock);
        //when
        String result = myAwsomeClass.thisMethodIsStubbed();

        //then
        Assert.assertEquals("STUB",result);
    }
}