package HomeWork_4;

import java.util.LinkedList;
import java.util.Scanner;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */
public class exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в очереди: ");
        int size=scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i < size; i++ ){
            System.out.println("Введите " + (i+1) + " номер очереди:  ");
            Integer temp = scanner.nextInt();
            list.add(temp);
        }
        System.out.println(list);
        System.out.println(" Выберите нужную операцию: 1 - помещает элемент в конец очереди, 2 - возвращает первый элемент из очереди и удаляет его, 3 - возвращает первый элемент из очереди, не удаляя. ");
        int command = scanner.nextInt();
        
        switch (command){
            case 1:
                enqueue();
                System.out.println(enqueue(1, list));
                break;
            case 2:
                dequeue(); 
                System.out.println("Возвращаю первый элемент и удаляю его: " + dequeue(list));
                break;
            case 3:
                first();
                System.out.println("Возвращаю первый элемент не удаляя его: " + first(list));
        }
    }

    public static LinkedList<Integer> enqueue (Integer n, LinkedList<Integer> array) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число, которое нужно добавить: " );
        n = scanner.nextInt();
        array.addLast(n);
        return array;
    }
    
    public static Integer dequeue (LinkedList<Integer> array) {
        int first = array.getFirst();
        array.removeFirst();
        return first;
    }

    public static Integer first(LinkedList<Integer> array) {
        return array.getFirst();
     }

    private static void enqueue() {
    }
    private static void dequeue() {
    }
    private static void first() {
    }

}

