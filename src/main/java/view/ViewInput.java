package view;

import services.InputFromUser;

import java.util.Scanner;

public class ViewInput {
    private String str;
    private void viewInfo() {
        System.out.println("Введите одной строкой через пробел следующие данные: ");
        System.out.println("Фамилия Имя Отчество дата_рождения номер_телефона пол");
        System.out.println("Форматы данных: \nфамилия, имя, отчество - строки \n" +
                "дата _ рождения - строка формата dd.mm.yyyy\n" +
                "номер _ телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m.");
    }

    public ViewInput() {
        viewInfo();
        Scanner sc = new Scanner(System.in);
        this.str = sc.nextLine();

    }

    public String getStr() {
        return str;
    }
}
