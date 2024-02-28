package Service;

public interface VerificationInterface<T> {

    public int checkLenArray(T[] array, int size);

    public void checkPhoneFormat(String str);

    public void checkDataFormat(String str);

    public void checkGenderFormat(String str, char[] gender);
}
