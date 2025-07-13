//Memento
public class SettingsSnapshot {
    private final String theme;
    private final boolean notifications;

    public SettingsSnapshot(String theme, boolean notifications) {
        this.theme = theme;
        this.notifications = notifications;
    }

    public String getTheme(){
        return theme;
    }

    public boolean getNotifications(){
        return notifications;
    }

}
