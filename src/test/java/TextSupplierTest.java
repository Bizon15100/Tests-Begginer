import org.junit.Assert;
import org.junit.Test;

public class TextSupplierTest {
    @Test
    public void shouldGiveStringWhenNoArgumentProvided(){
        //given
        TextSupplier textSupplier = new TextSupplier();
        String expected = "Hello world";
        //when
        String result = textSupplier.giveMeAwsomeText();
        //then
        Assert.assertEquals(expected,result);
    }
    @Test
    public void shouldFailWHenExpectedIsIncorrect(){
        //given
        TextSupplier textSupplier = new TextSupplier();
        String expected = "Hello world!!!";
        //when
        String result = textSupplier.giveMeAwsomeText();
        //then
        Assert.assertEquals(expected,result);
    }

}
