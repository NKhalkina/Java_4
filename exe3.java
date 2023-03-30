package HomeWork_4;

import java.util.LinkedList;
import java.util.Scanner;

public class exe3 {
    /* В калькулятор добавьте возможность отменить последнюю операцию.*/
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Введите число: ");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        list.add(number1);

        System.out.println("Выберите операцию (+, -, /, *, del): ");
        Scanner in = new Scanner(System.in);
        String znak = in.nextLine();

        System.out.println("Введите число: ");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();
        list.add(number2);

        switchCase(znak, number1, number2, list);
        
        while(true) {
        System.out.println("Выберите операцию (+, -, /, *, del): ");
        Scanner in2 = new Scanner(System.in);
        String znak2 = in2.nextLine();

        if(znak2.equals("del") ){
            list.removeLast();
            System.out.println(("Текущее число: " + list.getLast()));
            continue;
        } else {
            System.out.println("Введите число: ");
            Scanner n3 = new Scanner(System.in);
            int number3 = n3.nextInt();

            switchCase(znak2, list.getLast(), number3, list);
            }
        }
    }

    public static void switchCase(String znak, int number1, int number2, LinkedList<Integer> list) {
        switch (znak) {
            case  ("+"):
                System.out.println(("Ответ: " + (number1 + number2)));
                list.add(number1 + number2);
                break;
            case  ("-"):
                System.out.println(("Ответ: " + (number1 - number2)));
                list.add(number1 - number2);
                break;
            case  ("/"):
                System.out.println(("Ответ: " + (number1 / number2)));
                list.add(number1 / number2);
                break;
            case  ("*"):
                System.out.println(("Ответ: " + (number1 * number2)));
                list.add(number1 * number2);
                break;
            case  ("del"):
                break;
            default:
                System.out.println("Доступны только операции +, -, /, * или del!");
        }
    }
}

