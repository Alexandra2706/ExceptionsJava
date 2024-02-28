package Exception;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(int size) {
        System.out.println("Количество введенных данных должно быть равно " + size);
    }

    public MyArraySizeException(String str) {
        System.out.println("Неверное количество данных в строке " + str);
    }

    public MyArraySizeException(String str, int size) {
        System.out.println(String.format("Количество данных в строке {%s} должно быть равно %d", str, size));
    }
}