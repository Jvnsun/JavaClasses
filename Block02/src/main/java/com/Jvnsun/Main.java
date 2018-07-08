package com.Jvnsun;

import com.Jvnsun.View.View;
import com.Jvnsun.controller.Controller;
import com.Jvnsun.model.Model;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        ResourceLoader resourceLoader = new ResourceLoader();
        Properties config = resourceLoader.getProperties("config.properties");
        Properties enLocale = resourceLoader.getProperties("en.properties");
        Controller controller = new Controller(model, view);
        controller.applyConfig(config);
        controller.applyLocale(enLocale);
        controller.processUser();
    }

}
