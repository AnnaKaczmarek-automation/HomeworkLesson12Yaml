import model.EnvironmentTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;



public class ApplicationProperties {
Logger log = LoggerFactory.getLogger("ApplicationProperties.class");

    public void setPropertiesValuesFromYamlFile(){
        YamlReader yamlReader = new YamlReader();
        List<EnvironmentTemplate> lisOfEnvironments = yamlReader.getConfiguration().getEnvironment().getListOfEnvironments();
        boolean isEnvironmentActive = false;
        for (EnvironmentTemplate environment:lisOfEnvironments) {
            if(environment.isActive()==true){
                isEnvironmentActive = true;
                Map<String, Object> environmentProperties = environment.getProperties();
                log.info("Amount of loaded properties is: "+environmentProperties.size());
            }
            break;
        }

        if(isEnvironmentActive==false){
            setSampleValuesForProperties();
        }
    }

    private void setSampleValuesForProperties() {
        YamlReader yamlReader = new YamlReader();
        Map<String, Object> environmentProperties = yamlReader.getConfiguration().getEnvironment().getTest2().getProperties();
    }
}
