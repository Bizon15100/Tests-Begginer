import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.WeakHashMap;
@RunWith(JUnitParamsRunner.class)
public class VersionTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNull(){
       //expect
        new Version(null);
    }
    @Test(expected = IllegalArgumentException.class)
    @Parameters({"1.1.a","0.1.e","1.a.2"})
    public void shouldThrowExceptionWhenRegexDoesntMaches(String version){
        //expect

        new Version(version);


    }
    @Test
    @Parameters({"0","0.0","1.1000"})
    public void shouldCreateObjectWhenVersionIsCorrect(String version){
        //when
        Version version1 = new Version(version);
        //then
        Assert.assertNotNull(version1);
    }
    @Parameters({"1.0.0|2.0.0|1"})
    @Test
    @TestCaseName("WHen this is {0} and that is {1} we expect {2}")
    public void shouldGiveOneWhenObjectIsNull(String thisVersion, String thatVersion){
        //give
        Version thisVersionObj = new Version(thisVersion);
        Version thatVersionObj = new Version(thatVersion);
        //when
        int result = thisVersion.compareTo(String.valueOf(thatVersionObj));
        //then
        Assert.assertEquals(thatVersionObj,result);
    }


}
