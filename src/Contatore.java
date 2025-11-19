public class Contatore {
    private int count = 0;
    /*public synchronized void incrementSyn() {
        int i = 0;
        while(i < 5000) {
            i++;
            count++;
        }
    }*/
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}