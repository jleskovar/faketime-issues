import org.joda.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println(System.currentTimeMillis() + " : going again @" + new LocalDateTime());
            Thread.sleep(60);
        }

    }

}
