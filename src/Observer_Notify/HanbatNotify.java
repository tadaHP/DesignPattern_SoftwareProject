package Observer_Notify;

import java.util.Date;

public class HanbatNotify extends Subject{

    private static HanbatNotify hanbatNotify = new HanbatNotify();

    private HanbatNotify() {
    }

    public static HanbatNotify getInstance() {
        return hanbatNotify;
    }

}
