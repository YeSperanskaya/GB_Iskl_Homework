package services;

/**
 * этот класс принимает строку делит ее по пробелам добавляя в массив строк
 *
 */
public class InputFromUser {
    private String[] inputArray;
    private String inputString;

    public InputFromUser(){}
    public InputFromUser(String inputString) {
        String[] array = inputString.split(" ");

        if(array.length != 6) {
            throw new MyArraySizeException(array.length);
        }
        this.inputArray = array;
        this.inputString = inputString;
    }


    class MyArraySizeException extends RuntimeException{
        public MyArraySizeException() {
            super();
        }
        public MyArraySizeException(int i) {super("В строке количество элементов " + i + " вместо 6");}

    }

    public String[] getInputArray() {
        return inputArray;
    }
}
