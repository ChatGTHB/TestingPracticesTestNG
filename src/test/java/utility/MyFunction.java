package utility;

public class MyFunction {

    public static void wait(int sn) {
        try {
            Thread.sleep(1000L * sn); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
