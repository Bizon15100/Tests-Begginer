import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestCircleArea {
    @Test
    @Parameters({"10|314|0.2","-10|-1|0","4|133|0"})
    public void shouldGiveStringWhenNoArgumentProvided(double radius, double expected,double delta){
        //given
        CircleArea circleArea = new CircleArea();
        expected = Math.PI*radius*radius;
        //when
        double result = circleArea.Area(radius);
        //then
        Assert.assertEquals(expected,result,delta);
    }
}
