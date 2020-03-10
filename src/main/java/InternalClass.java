import java.io.FileNotFoundException;
import java.io.FileReader;

public class InternalClass {

    public void doSomethingCrazy(){
        try {
            FileReader fileReader = new FileReader("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String returnSomeString() {
        return "";
    }
}
