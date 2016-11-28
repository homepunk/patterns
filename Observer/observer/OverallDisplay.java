//Слушатель событий

package statistics.observer;

public class OverallDisplay implements Observer{

    @Override
    public void update(float fStats, float pStats, int count) {
        System.out.println("FULL STATISTICS\nAll games: " + count + "\nFull wins: " + fStats + "%\nPersonal wins: " + pStats + "%\n\n");
    }

}
