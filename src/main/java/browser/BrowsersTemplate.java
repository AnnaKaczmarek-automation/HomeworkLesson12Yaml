package browser;
import YamlReader;
import org.apache.commons.lang3.StringUtils;
import java.io.IOException;

public class BrowsersTemplate {
    YamlReader yamlReader = new YamlReader();

    private String browserName = "chrome";
    private boolean headlessBrowser;
    private int webElementTimeOut = 5;


    public BrowsersTemplate() throws IOException {
        this.initBrowserSettings();
        this.headlessBrowser=false;

    }

    private void initBrowserSettings() throws IOException {

        this.browserName = yamlReader.getBrowsersProperties().getBrowserName().isEmpty() ? this.browserName : yamlReader.getBrowsersProperties().getBrowserName();
        this.webElementTimeOut = yamlReader.getBrowsersProperties().getWebElementTimeOutAsString().isEmpty() ? this.webElementTimeOut : yamlReader.getBrowsersProperties().getWebElementTimeOut();
        this.headlessBrowser = yamlReader.getBrowsersProperties().isHeadlessBrowserSpecifiedAsString().isEmpty() ? this.headlessBrowser : yamlReader.getBrowsersProperties().isHeadlessBrowser();
    }

    public boolean isSpecified() {

        return  StringUtils.isNotEmpty(String.valueOf(this.headlessBrowser));
    }

    public int getWebElementTimeOut() {
        return webElementTimeOut;
    }

    public String getWebElementTimeOutAsString() {
        return String.valueOf(webElementTimeOut);
    }

    public String getBrowserName() {
        return browserName;
    }


    public boolean isHeadlessBrowser() {
        return headlessBrowser;
    }

    public String isHeadlessBrowserSpecifiedAsString() {
        return String.valueOf(headlessBrowser);
    }



}


