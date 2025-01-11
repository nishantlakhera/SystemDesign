import java.util.HashMap;
import java.util.Map;

//Concrete Prototype
public class EnvironmentConfig implements ConfigPrototype{
    private String environmentName;
    private Map<String,String> settings;

    public EnvironmentConfig(String environmentName){
        this.environmentName = environmentName;
        this.settings = new HashMap<>();
    }

    public void addSettings(String key, String value){
        settings.put(key, value);
    }

    public String getSettings(String key){
        return settings.get(key);
    }

    @Override
    public EnvironmentConfig cloneConfig() {
        EnvironmentConfig environmentConfig = new EnvironmentConfig(this.environmentName+ "-clone");
        environmentConfig.settings = new HashMap<>(this.settings);// deep cloning
        return environmentConfig;
    }

    @Override
    public String toString() {
        return "Environment: " + environmentName + ", Settings: " + settings;
    }

}
