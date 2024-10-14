public class ThreadExample2 {
    // Creating a class that extends Thread class and override the run method.
    
    public static class MyThread extends Thread{
         public void run(){
            System.out.println("MyThread Running");
            System.out.println("MyThread Finished");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Running");
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main Finished");
    }
}
