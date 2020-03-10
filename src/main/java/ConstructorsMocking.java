public class ConstructorsMocking {

    private MyAwsomeClass myAwsomeClass;

    public int constructorInside(){

        InternalClass internalClass = new InternalClass();
        myAwsomeClass = new MyAwsomeClass(internalClass);
        myAwsomeClass.printHappyText();
        return 0;
    }

    public static int evilStaticMethod(int value){
        return  value + 666;
    }
}
