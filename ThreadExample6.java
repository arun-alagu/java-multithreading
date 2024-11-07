public class ThreadExample6 {
    static class StoppableRunnable implements Runnable{
        boolean stoppedThread = false;

        public synchronized void stopThread(){
            this.stoppedThread = true;
        }
        
        public synchronized boolean isThreadStopped(){
            return this.stoppedThread;
        }

        @Override
        public void run() {
            System.out.println("Runnable Running");
            while (!stoppedThread) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("...");
            }
            System.out.println("Runnable Stopped!");
        }
        
    }

    public static void main(String[] args) {
        StoppableRunnable runnable = new StoppableRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Thread Running");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Stop Requested");
        runnable.stopThread();
        System.out.println(runnable.isThreadStopped());
        System.out.println("Thread stopped");
    }
}
