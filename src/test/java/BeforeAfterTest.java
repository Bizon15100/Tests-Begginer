import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfterTest {

    private KelvinConverter kelvinConverter;

    @Before
    public void setup(){
        System.out.println("This will run before test");
        kelvinConverter = new KelvinConverter();
    }

    @After
    public void teardown(){
        System.out.println("This will execute after test");
    }

    @Test
    public void shouldDoSomethingWhenSomething(){

    }

}
