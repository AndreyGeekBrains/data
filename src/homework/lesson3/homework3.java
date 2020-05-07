package homework.lesson3;

import homework.lesson3.Stack;
import homework.lesson3.StackImpl;

public class homework3 {
    public static void main(String[] args) {

        String str = "abcd";

        System.out.println(new StringBuilder(str).reverse());

        Stack<Character> st = new StackImpl<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        while ( !st.isEmpty() ) {
            System.out.print(st.pop());
        }
        System.out.println();

        if (true) {
            return;
        }
    }

    private static <E> void insertRight(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}
