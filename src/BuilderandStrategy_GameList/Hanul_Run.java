package BuilderandStrategy_GameList;

import FactoryMethod_Member.User;

import java.util.List;

public class Hanul_Run implements RunGame {

    @Override
    public void Run(List<User> gameParticipant) {


        System.out.println("1번대진표");
        Print(gameParticipant, 0, 1, 2, 3);

        System.out.println("2번대진표");
        Print(gameParticipant, 0, 4, 3, 5);

        System.out.println("3번대진표");
        Print(gameParticipant, 1, 2, 3, 4);

        System.out.println("4번대진표");
        Print(gameParticipant, 0, 3, 1, 4);

        System.out.println("5번대진표");
        Print(gameParticipant, 1, 3, 2, 5);

        System.out.println("6번대진표");
        Print(gameParticipant, 0, 5, 2, 4);
    }

    private void Print(List<User> gameParticipant, int a, int b, int c, int d) {
        System.out.println(gameParticipant.get(a).getName() + " and " + gameParticipant.get(b).getName() + "vs."  + gameParticipant.get(c).getName() + " and " + gameParticipant.get(d).getName());
    }
}
