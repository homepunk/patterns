package statistics.observable;

import statistics.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Statistics implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();
    private float pWinsStats, fWinStats;
    private int pDefeats, pWins; // Победы и поражения игрока
    private int fDefeats, fWins; // Общее количесвто побед и поражений
    private int count; // счетчик количества игр

    public Statistics() {
        this.count = 50;
        this.pWinsStats = 0;
        this.fWinStats = 50f;
        this.fDefeats = 25;
        this.fWins = 25;
        this.pWins = 0;
        this.pDefeats = 0;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            System.out.println("Notifying Observers on change Statistics");
            ob.update(this.fWinStats, this.pWinsStats, this.count);
        }
    }

    public void addWin() {
        fWins += ++pWins;
        count++;
        changeStats();
        notifyObservers();
    }

    public void addDefeat() {
        fDefeats += ++pDefeats;
        count++;
        changeStats();
        notifyObservers();
    }

    private void changeStats() {
        pWinsStats = (float) (pWins * 100) / (pDefeats + pWins); // Процент побед игрока по отношению ко всем сыграным играм
        fWinStats = (float) (fWins * 100) / (count);
    }
}
