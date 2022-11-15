package BuilderandStrategy_GameList;



import java.util.Calendar;

public interface GameBuilder_Interface {
    public GameBuilder_Interface gameName(String gameName);

    public GameBuilder_Interface gameDate(Calendar gameDate);

    public GameBuilder_Interface place(String place);

    public GameBuilder_Interface description(String description);


    public GameBuilder_Interface clubName(String clubName);

    public GameBuilder_Interface courtType(String courtType);

    public GameBuilder_Interface eventUniv(String eventUniv);

    public Game build();
}
