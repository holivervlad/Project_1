package utils;

import io.qameta.allure.Step;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Users {

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
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("/Users/vladyslavholiver/Documents/Projects_for_self_learning/Project_1/src/main/resources/creds.properties");
            prop.load(input);
            return prop.getProperty(propertyName);
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
