public class ThreadExample2 {
    // Creating a class that extends Thread class and override the run method.

    public static class MyThread extends Thread{
        @Override
         public void run(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" Running");
            System.out.println(threadName+" Finished");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Running");
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main Finished");
    }
}
