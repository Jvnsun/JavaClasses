package com.Jvnsun;

import com.Jvnsun.View.ConsoleView;
import com.Jvnsun.View.View;

public class Main {

    public static void main(String[] args) {
	Model model = new Model();
        View view = new ConsoleView();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
