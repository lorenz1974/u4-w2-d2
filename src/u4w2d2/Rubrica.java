package u4w2d2;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

    private HashMap<String, String> rubrica;

    public Rubrica(Map<String, String> rubrica) {

        if (rubrica == null) {
            this.rubrica = new HashMap<>();
        } else {
            this.rubrica = new HashMap<>(rubrica);
        }
    }

}
