package Exception;

public class CharException extends IllegalArgumentException {

    public CharException(String str) {
        super(String.format("Неверный формат строки %s, должна быть одна буква f или m", str));
    }
}
