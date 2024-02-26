package services;

/**
 * этот класс принимает строку делит ее по пробелам добавляя в массив строк
 *
 */
public class InputFromUser {
    private String[] inputArray;
    private String inputString;


    /**
     * Этот класс принимает строку от пользователя и преобразует ее в массив попутно проверяя на количество элементов в массиве
     * @param inputString
     */
    public InputFromUser(String inputString) {
        String[] array = inputString.split(" ");
        this.inputArray = array;
        this.inputString = inputString;
    }




    public String[] getInputArray() {
        return inputArray;
    }
}
