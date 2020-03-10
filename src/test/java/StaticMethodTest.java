import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

@PrepareForTest({ConstructorsMocking.class})
public class StaticMethodTest {



    private ConstructorsMocking constructorsMocking;
    private ConstructorsMocking constructorsMocking2;


    @Test
    public void shouldMockStaticMethod(){
        constructorsMocking = mock(ConstructorsMocking.class);
        constructorsMocking2 = mock(ConstructorsMocking.class);
        PowerMockito.mockStatic(ConstructorsMocking.class);

        when(ConstructorsMocking.evilStaticMethod(anyInt())).thenReturn(100);



    }





}
