//Client
public class SettingsApp {
    public static void main(String[] args) {
        Settings settings = new Settings();
        SettingsManager manager = new SettingsManager();

        settings.display(); // Light, true

        manager.backup(settings);

        settings.updateSettings("Dark", false);
        settings.display(); // Dark , false

        manager.rollback(settings);
        settings.display(); // Light , true

    }
}
