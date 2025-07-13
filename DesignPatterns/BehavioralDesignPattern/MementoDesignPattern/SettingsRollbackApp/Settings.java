//Originator
public class Settings {
    private String theme = "Light";
    private boolean notifications = true;

    public void updateSettings(String theme, boolean notifications){
        this.theme = theme;
        this. notifications = notifications;
    }

    public SettingsSnapshot save(){
        return new SettingsSnapshot(theme, notifications);
    }

    public void restore(SettingsSnapshot settingsSnapshot){
        this.theme = settingsSnapshot.getTheme();
        this.notifications = settingsSnapshot.getNotifications();
    }

    public void display(){
        System.out.println("Theme : "+ theme + ", Notifications : "+ notifications);
    }

}
