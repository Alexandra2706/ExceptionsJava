package Service;

public class StringProcessing implements StringProcessingInreface {

    public StringProcessing() {
    }

    @Override
    public String[] splitString(String initialString) {
        return initialString.split(" ");
    }

}
