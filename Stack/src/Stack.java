public class Stack {
    private static final int INITIAL_CAPACITY = 16;
    private int[] elements;
    private int size; // zeigt auf den nächsten freien Platz

    public Stack() {
        elements = new int[INITIAL_CAPACITY];
    }

    public void push(int e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public int pop() {
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            int[] neuesArray = new int[(2 * size)];

            for (int i = 0; i < size; i++) {
                neuesArray[i] = elements[i];
            }

            elements = neuesArray;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 20; i++) {
            stack.push(100 + i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());
        }
    }
}