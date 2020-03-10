public class ArgumentCallBack {

    private CallBack callBack;

    public ArgumentCallBack(CallBack callBack){
        this.callBack = callBack;
    }

    public void executeCallBack(int value){
        if (value == 0){
            callBack.intCallback(value);
        }
        if (value > 0){
            Double doubleValue = Double.valueOf(value);
            callBack.doubleCallback(doubleValue);
        }
        if (value < 0){
            String stringValue = String.valueOf(value);
            callBack.stringCallback(stringValue);
        }
    }

}
