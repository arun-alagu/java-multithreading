public class ThreadExample4 {
    // Creating an anonymous implementation of runnable interface,
    // which is similar to the a class that implements the runnable interface.
    // Passing the instance of the runnable interface to a Thread.
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Runnable Running");
                System.out.println("Runnable Finished");
            }
            
        };
        System.out.println("Main Running");
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main Finished");
    }
    
}
