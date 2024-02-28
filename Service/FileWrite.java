package Service;

import java.io.FileWriter;
import java.io.IOException;

import Model.Human;

public class FileWrite {
    public void writeToFile(Human human, String fileName) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, true);
            fileWriter.write(human.toString() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
