import java.util.HashMap;
import java.util.Map;

// Singleton Pattern: Configuration Manager
class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> config;

    private ConfigurationManager() {
        config = new HashMap<>();
        config.put("maxPlayers", "100");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "medium");
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.getOrDefault(key, "Not Found");
    }

    public void printConfigs() {
        config.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}