import java.util.Date;
import java.util.List;

public class Reader implements Runnable {

    private final List<Integer> list;

    public Reader(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);

                if (list.isEmpty()) {
                    Date date = new Date();
                    System.out.println(date + " The list is empty");
                }
                System.out.println(list);
                list.clear();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
