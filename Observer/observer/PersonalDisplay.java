package statistics.observer;

public class PersonalDisplay implements Observer {

    @Override
    public void update(float fStats, float pStats, int count) {
        System.out.println("PLAYER STATISTICS \nWins: " + pStats + "%\n\n");
    }
}
