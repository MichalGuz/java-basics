package hash_code_method;

import java.util.Objects;

public class HumanHashCode {
    private int id;
    private String name;
    private String city;

    public HumanHashCode(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public int hashCode(){
        int result;
        result = Objects.hashCode(id) * 31;

        return result;
    }
}
