package github.com.daltondiaz.java.sample.threads;

public class NewThread implements Runnable {
    
    public void run(){

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
