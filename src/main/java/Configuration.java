import browser.Browsers;
import model.Environment;

public class Configuration {

    public Environment environment;

    public Configuration(Environment environment, Browsers browsers) {
        this.environment = environment;
        this.browsers = browsers;
    }

    public Browsers browsers;

    public Browsers getBrowsers() {
        return browsers;
    }

    public Environment getEnvironment() {
        return environment;
    }
}
