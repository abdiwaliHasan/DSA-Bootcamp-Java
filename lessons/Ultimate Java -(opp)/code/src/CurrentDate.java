import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {
        Date now = new Date() {
        };
        System.out.println(now);
    }
}