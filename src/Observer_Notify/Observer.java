package Observer_Notify;

import java.util.Date;

public class Observer {
    public String univName;

    public void receive(String title, Date date, String place, String univName) {
        this.univName = univName;
        System.out.println(this.univName + "에서 경기 알림" );
        System.out.println("경기제목: " + title);
        System.out.println("날짜: " + date);
        System.out.println("장소: " + place);
    }

}
