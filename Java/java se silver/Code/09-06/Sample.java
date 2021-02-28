import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sample{
    public static void main(String[] args){
        LocalDate a = LocalDate.of(2021, 2, 27);
        LocalDate b = LocalDate.now();
        b.with(DayOfWeek.MONDAY);
        System.out.println(a.equals(b)
                + ", " + a.isBefore(b));
    }
}