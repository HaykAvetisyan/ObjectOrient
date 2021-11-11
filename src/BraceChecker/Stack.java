package BraceChecker;

public class Stack {
    private char[] array = new char[20];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(char value) {
        if (size == array.length) {
            System.out.println("stack-ը վերջացավ");
        } else {
            array[++size] = value;
        }
    }

    public char pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }
    }


    public void print(){
        for (int i = 0; i <size ; i++) {
            System.out.println(array[i]);
        }
    }

    public boolean isEmty(){
        return size ==-1;
    }

}
