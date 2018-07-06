package com.Jvnsun;

import com.Jvnsun.View.View;
import com.Jvnsun.controller.Controller;
import com.Jvnsun.model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
