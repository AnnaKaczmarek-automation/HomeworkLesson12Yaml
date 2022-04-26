//import browser.BrowsersTemplate;
//import model.EnvironmentTemplate;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.List;
//import java.util.Map;
//
//public class BrowserProperties {
//    Logger log = LoggerFactory.getLogger("BrowserProperties.class");
//
//
//    public BrowserProperties() {
//        setBrowserValuesFromYamlFileToSystem();
//    }
//
//    public void setBrowserValuesFromYamlFileToSystem() {
//        YamlReader yamlReader = new YamlReader();
//        Map<String, Object> browserProperties = yamlReader.getConfiguration().getBrowser().getBrowsersTemplate().getProperties();
//        for (Map.Entry entry : browserProperties.entrySet()) {
//            System.setProperty(entry.getKey().toString(), entry.getValue().toString());
//        }
//    }
//}
