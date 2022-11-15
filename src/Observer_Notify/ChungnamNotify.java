package Observer_Notify;

import java.util.Date;

public class ChungnamNotify extends Subject {

    private static ChungnamNotify chungnamNotify = new ChungnamNotify();

    private ChungnamNotify() {
    }

    public static ChungnamNotify getInstance() {
        return chungnamNotify;
    }

}
