package BuilderandStrategy_GameList;

import FactoryMethod_Member.User;
import Observer_Notify.ChungnamNotify;
import Observer_Notify.HanbatNotify;
import Observer_Notify.HannamNotify;
import Observer_Notify.Subject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Game {

    //필수 파라미터
    private String gameName;
    private Calendar gameDate;
    private String place;
    private String eventUniv;

    //선택 파라미터
    private String description;
    private String clubName;
    private String courtType;

    Game(ConcreteGameBuilder concreteGameBuilder) {
        this.gameName = concreteGameBuilder.getGameName();
        this.gameDate = concreteGameBuilder.getGameDate();
        this.place = concreteGameBuilder.getPlace();
        this.description = concreteGameBuilder.getDescription();
        this.clubName = concreteGameBuilder.getClubName();
        this.courtType = concreteGameBuilder.getCourtType();
        this.eventUniv = concreteGameBuilder.getEventUniv();
    }


    public static ConcreteGameBuilder builder() {
        return new ConcreteGameBuilder();
    }


    @Override
    public String toString() {
        return "gameName: " + gameName + " gameDate: " + gameDate.get(Calendar.YEAR) + "." + (gameDate.get(Calendar.MONTH) + 1)
                + "." + gameDate.get(Calendar.DATE) + " place: " + place + " description: " + description + " clubName: " + clubName
                + " courtType: " + courtType;
    }

    //게임참여
    private List<User> gameParticipant = new ArrayList<>();
    /////////

    public void attend(User user) {
        gameParticipant.add(user);
    }

    public void deAttend(User user) {
        gameParticipant.add(user);
    }

    public List<User> getGameParticipant() {
        return gameParticipant;
    }





}

