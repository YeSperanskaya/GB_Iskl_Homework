package services;

public class ExaminationSizeArray{

    public boolean examen(String[] array) {
        try {
            isArraySize(array.length);
        } catch (MyArraySizeException e) {
            System.out.println("В строке количество элементов " + array.length + " вместо 6");
            return false;
        }
        return true;

    }


    private void isArraySize(int size) {
        if(size != 6) {
            throw new MyArraySizeException(size);
        }
    }


    class MyArraySizeException extends RuntimeException{
        public MyArraySizeException() {
            super();
        }
        public MyArraySizeException(int i) {super("В строке количество элементов " + i + " вместо 6");}

    }


}
