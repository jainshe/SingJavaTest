package practice;

/**
 * @author shefali.jain
 */
public class ExampleRunnableHi implements Runnable{

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
