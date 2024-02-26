package services;

public class ExaminationNames implements Examination {

    /**
     * не хватает првоерки на верные символы
     * @param str
     * @return
     */
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




