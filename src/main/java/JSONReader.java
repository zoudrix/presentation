import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JSONReader {
    public List<TitanicPassenger> getPassengersFromJsonFile() throws IOException {
        List<TitanicPassenger> allPassengers = new ArrayList<TitanicPassenger>();
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream input = new FileInputStream("Data/titanic_csv.json");
        allPassengers = objectMapper.readValue(input, new TypeReference<List<TitanicPassenger>>(){});
        return allPassengers;
    }

}
