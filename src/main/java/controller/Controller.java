package controller;

import services.InputFromUser;
import view.ViewInput;

public class Controller {

    public void start() {
        ViewInput viewInput = new ViewInput();
        InputFromUser inputFromUser = new InputFromUser(viewInput.getStr());


    }

}
