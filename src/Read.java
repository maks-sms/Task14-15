public class Read implements Runnable{
    private String[] array;
    private int starting;
    private int ending;

    public Read(String[] array, int starting, int ending) {
        this.array = array;
        this.starting = starting;
        this.ending = ending;
    }

    @Override
    public void run() {
        for (int i = starting; i < ending; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                array[i] = "FizzBuzz";
            } else if(i % 3 == 0) {
                array[i] = "Buzz";
            } else if(i % 5 == 0) {
                array[i] = "Fizz";
            } else {
                array[i] = String.valueOf(i);
            }
        }
    }
}
