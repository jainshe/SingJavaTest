package practice;

import java.io.IOException;

/**
 * @author shefali.jain
 */
public class ExceptionHandling {

    void m() throws IOException {
        throw new IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p(){
        try {
            n();
        }
        catch (Exception e){
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.p();
        System.out.println("exception handled here");
    }
}
