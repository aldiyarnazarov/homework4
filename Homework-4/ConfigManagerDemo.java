public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        configManager.printConfigs();
    }
}

// Adapter Pattern: Legacy Chat System
interface ChatService {
    void sendMessage(String message);
}