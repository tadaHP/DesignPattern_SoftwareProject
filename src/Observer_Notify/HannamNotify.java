package Observer_Notify;

import java.util.Date;

public class HannamNotify extends Subject{

    private static HannamNotify hannamNotify = new HannamNotify();

    private HannamNotify() {
    }

    public static HannamNotify getInstance() {
        return hannamNotify;
    }
}
