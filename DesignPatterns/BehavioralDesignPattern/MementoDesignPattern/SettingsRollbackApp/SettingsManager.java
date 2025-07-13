//Caretaker
public class SettingsManager {
    private SettingsSnapshot snapshot;

    public void backup(Settings settings){
        snapshot = settings.save();
    }

    public void rollback(Settings settings){
        settings.restore(snapshot);
    }
}
