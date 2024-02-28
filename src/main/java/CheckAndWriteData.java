import java.io.FileWriter;
import java.io.IOException;

public class CheckAndWriteData {
    private DataInput dataInput = new DataInput();
    public void checkAndWriteData() throws IOException, CheckContentException {


        String s = dataInput.dataInput();
        String[] array = dataInput.parseStringData(s);
        if(array.length != 4){
            throw new  CheckCountException("Вы ввели неверное количество данных");
        } else if(array[0].split(" ").length != 3){
            throw new CheckCountException("Вы ввели неверное ФИО");
        } else if(array[1].length() != 10){
            throw new CheckCountException("Вы неверно ввели дату рождения");
        } else if(array[2].length() != 11){
            throw new CheckCountException("Вы неверно ввели номер телефона");
        } else if(array[3].length() != 1){
            throw new CheckCountException("Вы неверно ввели пол");
        }
        String[] name = array[0].split(" ");
        String[] date = array[1].split("\\.");
        for (int i = 0; i < name.length; i++) {
            if(!name[i].toLowerCase().matches("[а-я]+")){
                throw new CheckContentException("Имя содержит недопустимые символы");
            }
        }
        try {
            if (Integer.parseInt(date[0]) > 31 ||
                    Integer.parseInt(date[0]) < 1 ||
                    Integer.parseInt(date[1]) > 12 ||
                    Integer.parseInt(date[1]) < 1 ||
                    Integer.parseInt(date[2]) > 2024 ||
                    Integer.parseInt(date[2]) < 1924){
                throw new CheckContentException("Некорректно введена дата");
            }

        } catch (NumberFormatException e){
            throw new CheckContentException("Использованы недопустимые символы" +
                    " при вводе даты рождения");
        }
        if(!array[2].matches("[0-9]+")){
            throw new CheckContentException("Некорректно введен номер телефона," +
                    " использованы недопустимые символы");
        }
        if(!(array[3].toLowerCase().contains("f") || array[3].toLowerCase().contains("m"))){
            throw new CheckContentException("Использованы некорректные символы при вводе пола");
        }
        try (FileWriter fileWriter = new FileWriter(name[0] + ".txt", true)) {
            for (int i = 0; i < name.length; i++) {

                fileWriter.write("<" + name[i] + ">");
            }
            fileWriter.write("<" + array[1] + ">");
            fileWriter.write("<" + array[2] + ">");
            fileWriter.write("<" + array[3] + ">\n");
        }


    }

}
