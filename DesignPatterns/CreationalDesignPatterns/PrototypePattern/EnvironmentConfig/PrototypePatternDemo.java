public class PrototypePatternDemo {
    public static void main(String[] args) {
        EnvironmentConfig devConfig = new EnvironmentConfig("Development");
        devConfig.addSettings("URL","https://localhost:8080");
        devConfig.addSettings("DB_CONNECTION","dev-db");
        devConfig.addSettings("CACHE_ENABLED","false");

        //Clone development configuration for staging

        EnvironmentConfig stagingConfig = devConfig.cloneConfig();
        stagingConfig.addSettings("URL", "http://staging.example.com");
        stagingConfig.addSettings("DB_CONNECTION", "staging-db");

        //Clone Prod settings.
        EnvironmentConfig prodConfig = devConfig.cloneConfig();
        prodConfig.addSettings("URL", "http://example.com");
        prodConfig.addSettings("DB_CONNECTION", "prod-db");
        prodConfig.addSettings("CACHE_ENABLED", "true");

        System.out.println("Development Config: " + devConfig);
        System.out.println("Staging Config: " + stagingConfig);
        System.out.println("Production Config: " + prodConfig);

    }
}
