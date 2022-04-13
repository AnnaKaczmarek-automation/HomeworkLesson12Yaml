package model;

import configuration.YamlReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Environment {
    static YamlReader yamlReader = new YamlReader();

    public EnvironmentTemplate test1;
    public EnvironmentTemplate test2;

    public EnvironmentTemplate getTest1() {
        return test1;
    }
    public EnvironmentTemplate getTest2() {
        return test2;
    }

    public List<EnvironmentTemplate> getListOfEnvironments() {
        List<EnvironmentTemplate> environments = new ArrayList<>();
        environments.add(getTest1());
        environments.add(getTest2());
        return environments;
    }

    static EnvironmentTemplate activeEnvironment;
    public static EnvironmentTemplate getActiveTest() throws IOException {
        List<EnvironmentTemplate> listOfEnvironments = yamlReader.getEnvironmentProperties().getListOfEnvironments();
        for (EnvironmentTemplate env:listOfEnvironments) {
            if(env.getActive()==true){
               activeEnvironment= env;
            }
        }
        return activeEnvironment;
    }

    public void setTest1(EnvironmentTemplate test1) {
        this.test1 = test1;
    }

    public void setTest2(EnvironmentTemplate test2) {
        this.test2 = test2;
    }


//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

//    public static Environment getInstance() {
//        return Environment.EnvironmentPropertySingleton.INSTANCE;
//    }
//
//    private static class EnvironmentPropertySingleton {
//        private static final Environment INSTANCE = new Environment();
//        //private EnvironmentPropertySingleton() {
//        //}
//    }
//
//    public int getIntValue(String key) {
//        return Integer.parseInt(key);
//    }


}
