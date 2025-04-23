//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class AntiPatternExample {
    static Scanner scanner;
    private static int counter;
    private static AntiPatternExample instance;

    public static void main(String[] args) {
        AntiPatternExample example = new AntiPatternExample();
        example.run();
        example.printHello();
        example.printHi();
        example.complexLogic();
        example.increment();
        example.oldLogic();
        example.sendEmail("super_user@example.com", "Привет!");
        System.out.println("Приветствие: " + example.getGreeting());
        System.out.println("Null Value: " + example.getNullValue());
        example.openFile();
        Objects.requireNonNull(example);
        Addition addition = example.new Addition();
        System.out.println("Сложение: " + addition.execute(3, 4));
        AntiPatternExample singleton = getInstance();
        singleton.increment();
    }

    public void run() {
        System.out.println("Введите число: ");
        String input = scanner.nextLine();
        if (input.matches("\\d+")) {
            int number = Integer.parseInt(input);
            int result = this.calculate(number);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ошибка ввода");
        }

    }

    private int calculate(int x) {
        return x * 41 - 7;
    }

    public String getGreeting() {
        return "Hello, World!";
    }

    public void printHello() {
        System.out.println("Hello, World!");
    }

    public void printHi() {
        System.out.println("Hello, World!");
    }

    private void unusedMethod() {
        System.out.println("Я никогда не вызываюсь");
    }

    public void complexLogic() {
        int a = 5;
        int b = 10;
        int c = a + b;
        if (c > 10) {
            System.out.println("Сильно Больше 10");
        } else {
            System.out.println("Меньше или равно 10");
        }

        for(int i = 0; i < c; ++i) {
            System.out.println("Итерация: " + i);
        }

    }

    public void increment() {
        ++counter;
        System.out.println("Счётчик: " + counter);
    }

    public void oldLogic() {
        System.out.println("Старая логика");
    }

    public static AntiPatternExample getInstance() {
        if (instance == null) {
            instance = new AntiPatternExample();
        }

        return instance;
    }

    public void sendEmail(String recipient, String message) {
        System.out.println("Отправка письма: " + message + " для " + recipient);
    }

    public String getNullValue() {
        return null;
    }

    public void openFile() {
        try (FileReader fr = new FileReader("test.txt")) {
            System.out.println("Файл открыт и корректно закрыт");
        } catch (IOException e) {
            System.out.println("Ошибка открытия файла: " + e.getMessage());
        }

    }
    public class Addition implements Operation {
        public int execute(int a, int b) {
            return a + b;
        }
    }

    public interface Operation {
        int execute(int var1, int var2);
    }
    static {
        scanner = new Scanner(System.in);
        counter = 0;
    }


}
