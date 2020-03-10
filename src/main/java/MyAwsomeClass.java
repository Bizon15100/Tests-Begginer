
public class MyAwsomeClass {

    private InternalClass internalClass;

    public MyAwsomeClass(InternalClass internalCLass) {
        this.internalClass = internalCLass;

    }

    public String printHappyText(){
        internalClass.doSomethingCrazy();
        return "I AM HAPPY";
    }
    public String thisMethodIsStubbed(){
        return "STUB";
    }
}
