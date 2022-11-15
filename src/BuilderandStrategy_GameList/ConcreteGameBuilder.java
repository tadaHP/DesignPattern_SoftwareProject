package BuilderandStrategy_GameList;

import Observer_Notify.ChungnamNotify;
import Observer_Notify.HanbatNotify;
import Observer_Notify.HannamNotify;

import java.util.Calendar;

public class ConcreteGameBuilder implements GameBuilder_Interface{
    private String gameName;
    private Calendar gameDate;
    private String place;
    private String eventUniv;

    private String clubName;
    private String description;
    private String courtType;

    public String getGameName() {
        return gameName;
    }

    public Calendar getGameDate() {
        return gameDate;
    }

    public String getPlace() {
        return place;
    }

    public String getEventUniv() {
        return eventUniv;
    }

    public String getClubName() {
        return clubName;
    }

    public String getDescription() {
        return description;
    }

    public String getCourtType() {
        return courtType;
    }

    public GameBuilder_Interface gameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    public GameBuilder_Interface gameDate(Calendar gameDate) {
        this.gameDate = gameDate;
        return this;
    }

    public GameBuilder_Interface place(String place) {
        this.place = place;
        return this;
    }

    public GameBuilder_Interface description(String description) {
        this.description = description;
        return this;
    }

    public GameBuilder_Interface clubName(String clubName) {
        this.clubName = clubName;
        return this;
    }

    public GameBuilder_Interface courtType(String courtType) {
        this.courtType = courtType;
        return this;
    }

    public GameBuilder_Interface eventUniv(String eventUniv) {
        this.eventUniv = eventUniv;
        return this;
    }

    public Game build() {

        if (eventUniv.equals("충남대"))
            ChungnamNotify.getInstance().notifyObservers(gameName, gameDate, place, eventUniv);
        else if (eventUniv.equals("한밭대") )
            HanbatNotify.getInstance().notifyObservers(gameName, gameDate, place, eventUniv);
        else
            HannamNotify.getInstance().notifyObservers(gameName, gameDate, place, eventUniv);
        return new Game(this);
    }

}
