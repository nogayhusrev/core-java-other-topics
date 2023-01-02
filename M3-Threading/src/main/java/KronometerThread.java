

public class KronometerThread implements Runnable{

    private Thread thread;
    private String threadName;

    public KronometerThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Created: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);

        for (int i = 1; i < 11; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Stooped: " + threadName);


    }

    public void start(){
        System.out.println("Thread is being created");
        if (thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
