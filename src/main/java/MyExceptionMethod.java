public class MyExceptionMethod {



    public int canThrowException(int value) {
        if (value > 0) {
            return value * 2;
        }
        if (value < 0) {
            throw new IllegalArgumentException(":D EXCEPTION");
        }
        return  0;
    }

}
