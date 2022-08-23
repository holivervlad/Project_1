package utils;

import io.qameta.allure.Step;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Users {

//    @Step
//    public String getEnvironment(){
//        return getPropertyValue("env_url");
//    }

    @Step
    public String getSalesRepUserName() {
        return getPropertyValue("username");
    }

    @Step
    public String getSalesRepPassword() {
        return getPropertyValue("password");
    }

    @Step
    public String getSalesRepTerritory() {
        return getPropertyValue("phoenix_territory");
    }

    @Step
    public String getAdminUserName() {
        return getPropertyValue("adminusername");
    }

    @Step
    public String getAdminPassword() {
        return getPropertyValue("adminpassword");
    }

    public String getPropertyValue(String propertyName) {
        String propertyValue = "";
        Properties properties = new Properties();
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("creds_for_development.properties");
            properties.load(inputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return propertyValue;
    }

}
