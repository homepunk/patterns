package statistics.realisation;

import statistics.observable.Statistics;
import statistics.observer.OverallDisplay;
import statistics.observer.PersonalDisplay;

public class StatisticsTest {
    public static void main(String[] args) {
        PersonalDisplay pDisplay = new PersonalDisplay();
        OverallDisplay fDisplay = new OverallDisplay();

        Statistics stats = new Statistics();
        stats.registerObserver(pDisplay); 
        stats.registerObserver(fDisplay);

        stats.addWin();
        stats.addWin();
        stats.addWin();
        stats.addWin();
        stats.addDefeat();
        stats.addDefeat();
        stats.removeObserver(pDisplay);
        stats.addDefeat();
        stats.addWin();
    }
}
