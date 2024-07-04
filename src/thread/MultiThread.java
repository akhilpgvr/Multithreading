package thread;

public class MultiThread extends Thread{

    public void run() {

        try {
            for(int i=0; i<10; i++) {

                System.out.println("Number is: "+ i);
            }
        }
        catch (Exception ex) {
            throw ex;
        }
    }
}
