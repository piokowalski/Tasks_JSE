package tasks.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task22 {
    public void run() {

        boolean flag = true;



                Integer result = null;
        while (result == null) {
            result = readNumber();
            if (result != null) {
                flag = false;
            }
        }
    }
    public Integer readNumber() {
        Scanner scanner = new Scanner(System.in);
        Integer result = null;
        System.out.println("Give me some digit: ");
        try {
            result = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("This is not a digit!!!");
        }
        return result;
    }
}
