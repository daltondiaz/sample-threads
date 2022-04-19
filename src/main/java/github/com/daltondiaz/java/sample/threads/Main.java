package github.com.daltondiaz.java.sample.threads;

public class Main{

    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        Thread newThread = new Thread(new NewThread());
        newThread.start();
    }
}
