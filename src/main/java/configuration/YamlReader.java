package configuration;

import browser.Browsers;
import browser.BrowsersTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import model.EnvironmentTemplate;

import java.io.*;

public class YamlReader {

    public EnvironmentTemplate getEnvironmentProperties() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("config.yaml").getFile());

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        EnvironmentTemplate environment = objectMapper.readValue(file, EnvironmentTemplate.class);

        return environment;
    }

    public BrowsersTemplate getBrowsersProperties() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("config.yaml").getFile());
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        BrowsersTemplate browsers = objectMapper.readValue(file, BrowsersTemplate.class);
        return browsers;
    }
}
