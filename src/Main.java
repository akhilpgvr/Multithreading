import thread.MultiThread;
import thread.MultiThread1;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        for(int i=0; i<5; i++) {
            MultiThread thread = new MultiThread();
            thread.start();
        }
        System.out.println("---------------------------");
        for(int i=0; i<5; i++) {
            Thread thread1 = new Thread(new MultiThread1());
            thread1.start();
        }


        /*
        output:

        ---------------------------
        ---------------------------
        Number is: 0
        Number is: 1
        Number is: 0
        Number is: 1
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 9
        Number is: 0
        Number is: 1
        Number is: 0
        Number is: 1
        Number is: 2
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 9
        Number is: 0
        Number is: 1
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 9
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 9
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 9
        Number is: 0
        Number is: 1
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 9
        Number is: 0
        Number is: 1
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 0
        Number is: 1
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 0
        Number is: 1
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 0
        Number is: 8
        Number is: 9
        Number is: 9
        Number is: 8
        Number is: 1
        Number is: 2
        Number is: 3
        Number is: 4
        Number is: 5
        Number is: 6
        Number is: 7
        Number is: 8
        Number is: 9
        Number is: 9
                */
    }
}