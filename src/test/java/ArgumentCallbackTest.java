import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import static org.mockito.ArgumentMatchers.anyDouble;

public class ArgumentCallbackTest {


    private int ecpectedInt = 0;
    private CallBack callBackMock;
    private ArgumentCallBack argumentCallBack;

    @Before
    public void setup(){
        callBackMock = PowerMockito.mock(CallBack.class);
        argumentCallBack = new ArgumentCallBack(callBack);
    }

    @Test
    public void shouldVerifyIntCallbackInvocationWhenValueIsZero(){
        //give
        int value = 0;
        //when
        argumentCallBack.executeCallBack(value);
        //then
        Mockito.verify(callBackMock).intCallback(ArgumentMatchers.eq(value));
        Mockito.verify(callBackMock, Mockito.times(0)).doubleCallback(anyDouble());

    }


    private CallBack callBack = new CallBack() {
        @Override
        public void intCallback(int value) {
            Assert.assertEquals(ecpectedInt, value);
        }

        @Override
        public void doubleCallback(Double doubleValue) {

        }

        @Override
        public void stringCallback(String stringValue) {

        }
    };


}
