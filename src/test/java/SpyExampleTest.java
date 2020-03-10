import com.thedeanda.lorem.LoremIpsum;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import java.util.LinkedList;

public class SpyExampleTest {
   private SpyExample<String> spyExample;

    @Test
    public void shouldAddValueToStorage(){
        //given
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> spy = PowerMockito.spy(list);
        spyExample = new SpyExample<>(spy);
        //when

        spyExample.add("Some string to add");
        //then

      //  Mockito.verify(spy,Mockito.times(5)).add("Some string to add");
        LoremIpsum loremIpsum = new LoremIpsum();
        boolean result = spyExample.add(loremIpsum.getWords(1));

        Assert.assertTrue(result);
        Mockito.verify(spy).add(ArgumentMatchers.anyString());
    }




}
