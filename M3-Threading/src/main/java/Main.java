public class Main {

    public static void main(String[] args) {

        KronometerThread[] threads = new KronometerThread[150];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new KronometerThread("kron" + i);
            threads[i].start();
        }
    }
}
