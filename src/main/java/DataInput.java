import java.util.Scanner;

public class DataInput {
    public String dataInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через запятую следующие данные\n" +
                "Фамилия Имя Отчество - строка без форматирования\n" +
                "дата _ рождения - строка формата dd.mm.yyyy\n" +
                "номер _ телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m");
        return scanner.nextLine();
    }
    public String[] parseStringData(String data){
        String[] parseData = data.split(", ");
        return parseData;
    }
}
