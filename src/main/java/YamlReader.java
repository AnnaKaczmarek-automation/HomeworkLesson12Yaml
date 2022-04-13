import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.*;

public class YamlReader {
    public static  Configuration configuration;

    public static Configuration getConfiguration() {
        return configuration;
    }



    public void readApplicationPropertiesFromFile() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("config.yaml").getFile());

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        this.configuration = objectMapper.readValue(file, Configuration.class);

    }
}
