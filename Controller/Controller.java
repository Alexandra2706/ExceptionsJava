package Controller;

import java.util.Scanner;

import Exception.MyArraySizeException;
import Model.Human;
import Service.FileWrite;
import Service.StringProcessing;
import Service.Verification;

public class Controller {
    private int ARRAY_LEN = 6;
    private char[] GENDER = new char[] { 'm', 'f' };

    StringProcessing stringProcessing;
    Verification verification;
    FileWrite fw;

    public Controller() {
        stringProcessing = new StringProcessing();
        verification = new Verification();
        fw = new FileWrite();
    }

    public void run() {
        System.out.println("----------START----------");
        String initialData = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате Фамилия Имя Отчество дата_рождения номер_телефона пол: ");
            initialData = scanner.nextLine();
            // initialData = "Ivanov Ivan Ivanovich 05.07.1978 1234567890 m";
            String[] dataPerson = stringProcessing.splitString(initialData);
            if (verification.checkLenArray(dataPerson, ARRAY_LEN) != ARRAY_LEN) {
                throw new MyArraySizeException(initialData, ARRAY_LEN);
            }
            verification.checkDataFormat(dataPerson[3]);
            verification.checkPhoneFormat(dataPerson[4]);
            verification.checkGenderFormat(dataPerson[5], GENDER);
            Human human = new Human(dataPerson);
            fw.writeToFile(human, human.getLastName() + ".txt");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода данных");
        }

        System.out.println("----------END----------");
    }

}
