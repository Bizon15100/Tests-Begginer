import org.junit.Assert;
import org.junit.Test;

public class KelvinConverterTest {

    @Test
    public  void shouldConvertZeroToCorrectTemperature(){
        //given
        KelvinConverter kelvinConverter = new KelvinConverter();
        double cesius = 0;
        double expected = cesius + 273.15;
        //when
        double result = kelvinConverter.convert(cesius);
        //then
        Assert.assertEquals(expected,result,0);
    }
}
