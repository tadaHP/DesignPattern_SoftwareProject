package Observer_Notify;

import java.util.Calendar;
import java.util.Date;

public class Observer {

    public void receive(String title, Calendar date, String place, String univName) {
        System.out.println("**************************");
        System.out.println(univName + "에서 경기 알림" );
        System.out.println("경기제목: " + title);
        System.out.println("날짜: " + date.get(Calendar.YEAR) + "." + date.get(Calendar.MONTH) + 1 + "." + date.get(Calendar.DATE));
        System.out.println("장소: " + place);
    }

}
