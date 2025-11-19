public class Main {
    public static void main(String[] args) {
        // il main è un thread
        Contatore counter = new Contatore();
        // il comportamento di un thread si trova dentro la funzione run di runnable
        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> counter.increment());
        Thread t2 = new Thread(() -> counter.increment());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
        ContatoreSync example = new ContatoreSync();

// Create multiple threads to increment the counter
        Thread t3 = new Thread(() -> example.incrementS());
        Thread t4 = new Thread(() -> example.incrementS());

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + example.getCount());

    }
}
