import java.util.List;
import java.util.Random;

public class Writer implements Runnable {

    private final List<Integer> numbers;

    Random random = new Random();

    public Writer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2500);
                numbers.add(random.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
