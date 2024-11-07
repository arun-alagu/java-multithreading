public class ThreadExample5 {
    // Creating a lambda expression which implements the runnable interface.
    // Passing the runnable instance to Thread class.
    public static void main(String[] args) {
        Runnable runnable = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" Running");
            System.out.println(threadName+" Finished");
        };

        System.out.println("Main Running");
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main Finished");
    }
    
}
