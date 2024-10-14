public class ThreadExample3 {

    // Creating a class that implements runnable interface
    //and pass the instance of the class to Thread class.
    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("MyRunnable Running");
            System.out.println("MyRunnable Finished");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Running");
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("Main Finished");
    }
    
}
