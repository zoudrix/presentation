import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        XChart ch=new XChart();
        List<TitanicPassenger> passengers= new JSONReader().getPassengersFromJsonFile();
        ch.graphPassengerAges(passengers);
        ch.graphPassengerClass(passengers);
        ch.graphPassengerSurvived(passengers);
        ch.graphPassengersurvivedGender(passengers);



    }
}
