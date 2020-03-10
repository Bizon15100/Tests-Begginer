import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest({InternalClass.class, ConstructorsMocking.class})
public class ConstructorMockingTest {


    private ConstructorsMocking constructorMocking;

    @Before
    public void setup(){
        constructorMocking = new ConstructorsMocking();
    }

    @Test
    public void shouldMockConstructors() throws Exception {
        InternalClass internalClassMock = mock(InternalClass.class);
        PowerMockito.whenNew(InternalClass.class).withNoArguments().thenReturn(internalClassMock);
    }

}
