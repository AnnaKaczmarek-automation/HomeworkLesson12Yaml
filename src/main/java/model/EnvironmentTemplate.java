package model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import configuration.YamlReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EnvironmentTemplate extends Environment {
    boolean active;
    private String envName;
    private String appUrl;
    private String eTitle;
    private String firstName;
    private String secondName;
    private String mail;
    private String age;
    private String continent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    YamlReader yamlReader = new YamlReader();

    public EnvironmentTemplate() throws IOException {
        if (yamlReader.getEnvironmentProperties().getTest1().isActive()==true) {
            this.envName = yamlReader.getEnvironmentProperties().getTest1().getEnvName().isEmpty() ? this.envName : yamlReader.getEnvironmentProperties().getTest1().getEnvName();
            this.appUrl = yamlReader.getEnvironmentProperties().getTest1().getAppUrl().isEmpty() ? this.appUrl : yamlReader.getEnvironmentProperties().getTest1().getAppUrl();
            this.eTitle = yamlReader.getEnvironmentProperties().getTest1().geteTitle().isEmpty() ? this.eTitle : yamlReader.getEnvironmentProperties().getTest1().geteTitle();
            this.firstName = yamlReader.getEnvironmentProperties().getTest1().getFirstName().isEmpty() ? this.firstName : yamlReader.getEnvironmentProperties().getTest1().getFirstName();
            this.secondName = yamlReader.getEnvironmentProperties().getTest1().getSecondName().isEmpty() ? this.firstName : yamlReader.getEnvironmentProperties().getTest1().getSecondName();
            this.mail = yamlReader.getEnvironmentProperties().getTest1().getMail().isEmpty() ? this.mail : yamlReader.getEnvironmentProperties().getTest1().getMail();
            this.age = yamlReader.getEnvironmentProperties().getTest1().getAge().isEmpty() ? this.age : yamlReader.getEnvironmentProperties().getTest1().getAge();
            this.continent = yamlReader.getEnvironmentProperties().getTest1().getContinent().isEmpty() ? this.continent : yamlReader.getEnvironmentProperties().getTest1().getContinent();
            this.active = yamlReader.getEnvironmentProperties().getTest1().getActiveInString().isEmpty() ? this.active : yamlReader.getEnvironmentProperties().getTest1().getActive();
        }
        if (yamlReader.getEnvironmentProperties().getTest2().isActive() == true) {

            this.envName = yamlReader.getEnvironmentProperties().getTest2().getEnvName().isEmpty() ? this.envName : yamlReader.getEnvironmentProperties().getTest2().getEnvName();
            this.appUrl = yamlReader.getEnvironmentProperties().getTest2().getAppUrl().isEmpty() ? this.appUrl : yamlReader.getEnvironmentProperties().getTest2().getAppUrl();
            this.eTitle = yamlReader.getEnvironmentProperties().getTest2().geteTitle().isEmpty() ? this.eTitle : yamlReader.getEnvironmentProperties().getTest2().geteTitle();
            this.firstName = yamlReader.getEnvironmentProperties().getTest2().getFirstName().isEmpty() ? this.firstName : yamlReader.getEnvironmentProperties().getTest2().getFirstName();
            this.secondName = yamlReader.getEnvironmentProperties().getTest2().getSecondName().isEmpty() ? this.firstName : yamlReader.getEnvironmentProperties().getTest2().getSecondName();
            this.mail = yamlReader.getEnvironmentProperties().getTest2().getMail().isEmpty() ? this.mail : yamlReader.getEnvironmentProperties().getTest2().getMail();
            this.age = yamlReader.getEnvironmentProperties().getTest2().getAge().isEmpty() ? this.age : yamlReader.getEnvironmentProperties().getTest2().getAge();
            this.continent = yamlReader.getEnvironmentProperties().getTest2().getContinent().isEmpty() ? this.continent : yamlReader.getEnvironmentProperties().getTest2().getContinent();
            this.active = yamlReader.getEnvironmentProperties().getTest2().getActiveInString().isEmpty() ? this.active : yamlReader.getEnvironmentProperties().getTest2().getActive();

        }
    }


    public boolean isActive() {
        return active;
    }

    public String getActiveInString() {
        return String.valueOf(active);
    }


    public String getEnvName() {
        return envName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public String getAge() {
        return age;
    }

    public String getContinent() {
        return continent;
    }

    public String geteTitle() {
        return eTitle;
    }

    public String getMail() {
        return mail;
    }

    public boolean getActive() {
        return active;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
