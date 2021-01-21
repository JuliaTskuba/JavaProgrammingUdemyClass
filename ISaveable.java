package academy.learnprogramming;

import java.util.List;

public interface ISaveable {
    List<String> read();
    void write(List<String> arraylist);
}
