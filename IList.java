package academy.learnprogramming;

public interface IList {
    ListItem getRoot();
    boolean addItem(ListItem newItem);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
