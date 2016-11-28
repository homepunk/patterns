package statistics.observable;

import statistics.observer.Observer;

public interface Observable {
        public void registerObserver(Observer ob);
        public void removeObserver(Observer ob);
        public void notifyObservers();
}
