package tb_interface_savable;

import java.util.List;

public interface Saveable {
    List<String> save();
    void read (List<String> savedItems);
}
