package null_object.com.app;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> customerNames = new ArrayList<>();

    public Database() {
        customerNames.add("Kavita");
        customerNames.add("Jyoti");
        customerNames.add("Ravi");
    }

    public boolean exists(String name) {
        for (int i = 0; i < customerNames.size(); i++) {
            if (customerNames.get(i).equals(name)) {
                return true;
            }
        }
        return false;
    }
}
