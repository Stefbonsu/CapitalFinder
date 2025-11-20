
import java.util.HashMap;

public class CapitalFinder {

    private static HashMap<String, String> capitals = new HashMap<>();

    static {
        capitals.put("Canada", "Ottawa");
        capitals.put("USA", "Washington, D.C.");
        capitals.put("Ghana", "Accra");
        capitals.put("South Korea", "Seoul");
        capitals.put("Denmark", "Copenhagen");
    }


    public static String getCapital(String country) {
        return capitals.getOrDefault(country, "Unsupported country");
    }


    public static String listCountries() {
        return String.join(", ", capitals.keySet());
    }
}
