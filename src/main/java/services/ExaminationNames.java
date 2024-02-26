package services;

public class ExaminationNames implements Examination {


    @Override
    public boolean examen(String str) {
        try {
            isSize(str.length());
        } catch (MyStringSizeException e) {
            System.out.println("Поле с именем состоит из неверного количества символов: " + str.length());
            return false;
        }
        return true;
    }
    private void isSize(int size) {
        if (size < 2 || size > 12) {
            throw new MyStringSizeException();
        }
    }


}




class MyStringSizeException extends RuntimeException {
    public MyStringSizeException() {
        super();
    }

    public MyStringSizeException(int i) {
        super("В строке должно быть количество элементов от 2 до 15, у вас " + i);
    }
}