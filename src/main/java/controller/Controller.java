package controller;

import services.ExamInput;
import services.InputFromUser;
import view.ViewInput;

public class Controller {

    private void input() {
        ViewInput viewInput = new ViewInput();
        InputFromUser inputFromUser = new InputFromUser(viewInput.getStr());
        ExamInput examInput = new ExamInput(inputFromUser.getInputArray());
        boolean bul = examInput.isResultExamen();
        System.out.println(bul);

    }

    public void start() {
        input();



    }

}
