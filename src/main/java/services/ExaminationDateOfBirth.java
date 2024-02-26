package services;

public class ExaminationDateOfBirth implements Examination {


    @Override
    public boolean examen(String str) {
        try {
            isSize(str.length());
            isDot(str);
        } catch (MyStringSizeException e) {
            System.out.println("Поле с датой рождения состоит из неверного количества символов: " + str.length());
            return false;
        } catch (MyInvalidSymbolException e) {
            System.out.println("В параметрах даты рождения отсутствуют точки!");
            return false;
        }
        return true;
    }
    private void isSize(int size) {
        if (size != 10) {
            throw new MyStringSizeException();
        }
    }



    //нужна проверка на верные цифры
    //нужен класс ошибки на неверные цифры
    //нужна проверка на месяц
    //нужна проверка года
    //нужна проверка точек в определенных местах

    private void isDot(String str) throws MyInvalidSymbolException {
        char[] chars = str.toCharArray();
        if (chars[2] != '.' || chars[5] != '.') {
            throw new MyInvalidSymbolException();
        }
    }

    private void isCorrectDate(String str) {
        String[] arrStr = str.split(".");
        // если после деления получилось недостаточное количество делений
        // если не получилось преобразовать в инт полученный результат
        // если инт меньше или больше определенных значений
    }


}







