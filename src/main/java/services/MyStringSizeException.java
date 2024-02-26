package services;

class MyStringSizeException extends RuntimeException {
    public MyStringSizeException() {
        super();
    }

    public MyStringSizeException(int i) {
        super("В строке должно быть количество элементов от 2 до 15, у вас " + i);
    }
}
