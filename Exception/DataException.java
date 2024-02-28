package Exception;

import java.time.DateTimeException;

public class DataException extends DateTimeException {

    public DataException(String data) {
        super(String.format("Неверный формат даты %s", data));
    }

}
