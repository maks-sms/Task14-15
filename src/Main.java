import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Задание 1
        List<Integer> list = new ArrayList<>();
        Reader reader = new Reader(list);
        Writer writer = new Writer(list);
        Thread t11 = new Thread(reader);
        Thread t12 = new Thread(writer);

        t11.start();

        t12.start();


        //Задание 2

        String[] s = new String[20000000];

        Read r1 = new Read(s, 0, 5000000);
        Read r2 = new Read(s, 5000000, 10000000);
        Read r3 = new Read(s, 10000000, 2000000);
        Read rOne = new Read(s, 0, 20000000);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread tOne = new Thread(rOne);

        long start1 = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();

        tOne.start();
        tOne.join();

        long end2 = System.currentTimeMillis();

        long time1 = end1 - start1;
        long time2 = end2 - start2;

        System.out.println("Time some: " + time1);
        System.out.println("Time one: " + time2);
    }
}
