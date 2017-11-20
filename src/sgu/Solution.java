package sgu;

import java.util.*;

// Задача 2057 с http://acm.sgu.ru/lang/
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfOperations = scanner.nextInt();

//        List<Integer> list = new ArrayList<>();
        Queue<Integer> elements = new PriorityQueue<>();
        for (int i = 0; i < numberOfOperations; i++) {
            int operation = scanner.nextInt();
            if (operation == 1) {
                elements.add(scanner.nextInt());
            } else if (operation == 2) {
                System.out.println(elements.poll());
            }
        }
    }

}
