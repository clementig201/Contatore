public class ContatoreSync {
    private final Object lock = new Object();
    private int count = 0;

    public void increment() {
        synchronized (lock) {
            count++;
            //devo fare un ciclo
        }
    }

    public int getCount() {
        return count;
    }

}
