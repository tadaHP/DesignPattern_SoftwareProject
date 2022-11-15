package Builder_GameList;

import FactoryMethod_Member.User;

import java.util.Date;

public class Game {

    //필수 파라미터
    private String gameName;
    private Date gameDate;
    private String place;

    //선택 파라미터
    private String description;
    private String clubName;
    private String courtType;

    private Game(GameBuilder builder) {
        this.gameName = builder.gameName;
        this.gameDate = builder.gameDate;
        this.place = builder.place;
        this.description = builder.description;
        this.clubName = builder.clubName;
        this.courtType = builder.clubName;
    }

    public static GameBuilder builder() {
        return new GameBuilder();
    }


    @Override
    public String toString() {
        return "gameName: " + gameName + " gameDate: " + gameDate + " place: " + place + " description: " + description + " clubName: " + clubName + " courtType: " + courtType;
    }

    public void Enrollment(User user) {
        user.getClass();
    }


    public static class GameBuilder {

        private String gameName;
        private Date gameDate;
        private String place;

        private String description;
        private String clubName;
        private String courtType;

        private GameBuilder(){}

        public GameBuilder gameName(String gameName) {
            this.gameName = gameName;
            return this;
        }

        public GameBuilder gameDate(Date gameDate) {
            this.gameDate = gameDate;
            return this;
        }

        public GameBuilder place(String place) {
            this.place = place;
            return this;
        }

        public GameBuilder description(String description) {
            this.description = description;
            return this;
        }

        public GameBuilder clubName(String clubName) {
            this.clubName = clubName;
            return this;
        }

        public GameBuilder courtType(String courtType) {
            this.courtType = courtType;
            return this;
        }

        public Game build() {
            return new Game(this);
        }

    }


}

