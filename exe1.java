package HomeWork_4;

import java.util.LinkedList;
import java.util.Scanner;

/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод(не void), который вернет “перевернутый” список*/
 public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в списке: ");
        int size=scanner.nextInt();
     
        LinkedList<Integer> list = new LinkedList<>();
    
        for(int i=0; i < size; i++ ){
            System.out.println("Введите " + (i+1) + "-е число:  ");
            Integer temp = scanner.nextInt();
            list.add(temp);
        }
        System.out.println(list);
        System.out.println("Перевёрнутый список: " + reverse(list));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> array) {
        LinkedList<Integer> reverseList = new LinkedList<>();
         for (int i = 0; i < array.size(); i++) {
            reverseList.add(i, array.get(array.size() - i - 1));
         }
        return reverseList;
    }     
}
        
