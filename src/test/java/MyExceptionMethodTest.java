import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyExceptionMethodTest {
    private MyExceptionMethod myExceptionMethod;

    @Before
    public void before(){
        myExceptionMethod = new MyExceptionMethod();
    }

    @Test
    public void shouldDoubleValueWhenValuePositive(){
        //given
        int value = 10;
        //when
        int result = myExceptionMethod.canThrowException(value);
        //then
        Assert.assertEquals(20,result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldDoubleValueWhenValueNegative(){
        //given
        int value = -10;

        //when
        try {
            myExceptionMethod.canThrowException(value);
        } catch (IllegalArgumentException e) {
            //then
            return;
        }
        Assert.fail();
    }
}
