package services;

public class ExamInput {
    private boolean result;

    /**
     * Этот класс содержит булевое значение проверки по всем 6 элементам
     * @param array переданный массив
     */
    public ExamInput(String[] array){
        boolean size = isSizeArray(array);
        boolean surname = isCurectlyName(array[0]);
        boolean name = isCurectlyName(array[1]);
        boolean patronymic = isCurectlyName(array[2]);
//        boolean bul3 = isCurectlyName(array[0]);
//        boolean bul4 = isCurectlyName(array[0]);
//        boolean bul5 = isCurectlyName(array[0]);
        this.result = size && surname && name && patronymic;

    }

    private boolean isCurectlyName(String str) {
        ExaminationNames examinationNames = new ExaminationNames();
        return examinationNames.examen(str);

    }



    private boolean isSizeArray(String[] array) {
        ExaminationSizeArray examinationSizeArray = new ExaminationSizeArray();
        return examinationSizeArray.examen(array);
    }

    public boolean isResultExamen() {
        return result;
    }
}
