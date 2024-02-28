package Service;

import java.util.regex.Pattern;

import Exception.CharException;
import Exception.DataException;

public class Verification implements VerificationInterface<String> {

    @Override
    public int checkLenArray(String[] array, int size) {
        if (array == null) {
            System.out.println("Массив не может быть null");
            return -1;
        }
        if (array.length < size) {
            System.out.println("Вы ввели не все данные");
            return -2;
        }
        if (array.length > size) {
            System.out.println("Вы ввели слишком много данных");
            return -3;
        }
        return array.length;
    }

    @Override
    public void checkPhoneFormat(String data) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(data).matches()) {
            throw new NumberFormatException(String.format("Неверный формат номера телефона %s", data));
        }
    }

    @Override
    public void checkDataFormat(String data) {
        Pattern pattern = Pattern.compile(
                "^(29.02.(2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26])))$"
                        + "|^((0[1-9]|1[0-9]|2[0-8]).02.((19|2[0-9])[0-9]{2}))$"
                        + "|^((0[1-9]|[12][0-9]|3[01]).(0[13578]|10|12).((19|2[0-9])[0-9]{2}))$"
                        + "|^((0[1-9]|[12][0-9]|30).(0[469]|11).((19|2[0-9])[0-9]{2}))$");
        if (!pattern.matcher(data).matches()) {
            throw new DataException(data);
        }
    }

    @Override
    public void checkGenderFormat(String str, char[] arrayChar) {
        if (str.length() != 1 || !String.valueOf(arrayChar).contains(str)) {
            throw new CharException(str);
        }
    }

}
