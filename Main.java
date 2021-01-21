package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyLinkedList Mll = new MyLinkedList(null);
        Mll.traverse(Mll.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6 0";

        String[] data = stringData.split(" ");
        for (String s : data) {
            Mll.addItem(new LinkedList(s));
        }
        Mll.traverse(Mll.getRoot());


    }
}
