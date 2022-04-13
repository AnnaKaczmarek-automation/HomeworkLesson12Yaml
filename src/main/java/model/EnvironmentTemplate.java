package model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import YamlReader;

import java.util.LinkedHashMap;
import java.util.Map;

public class EnvironmentTemplate {
    boolean active;
    private String envName;
    private String appUrl;
    private String eTitle;
    private String firstName;
    private String secondName;
    private String mail;
    private String age;
    private String continent;

    private Map<String, Object> envProperties = new LinkedHashMap<>();

    public EnvironmentTemplate(boolean active, String envName, String appUrl, String eTitle, String firstName, String secondName, String mail, String age, String continent, Map<String, Object> additionalProperties) {

        this.envName = envName;
        this.appUrl = appUrl;
        this.eTitle = eTitle;
        this.firstName = firstName;
        this.secondName = secondName;
        this.mail = mail;
        this.age = age;
        this.continent = continent;
        this.envProperties = additionalProperties;
    }


    YamlReader yamlReader = new YamlReader();


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
    public Map<String, Object> getProperties() {
        return envProperties;
    }

    @JsonAnySetter
    void setProperties(String key, Object value) {
        envProperties.put(key, value);
    }
}
