package tasks.tasks;

import java.util.Scanner;

public class Task20 {
    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text below, I'll count the dots:");

        String line = scanner.nextLine();
        int dots = countDots(line);

        System.out.println(dots);
    }

        private int countDots(String line) {
            char[] chars = line.toCharArray();
            int counter = 0;
            for (int i=0; i<chars.length; i++) {
                if (chars[i] == ',') {
                    counter++;
                }
            }
            return counter;
        }

    }

