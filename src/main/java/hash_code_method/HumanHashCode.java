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
        result = 31 * Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(city);
        return result;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass()!= o.getClass()) {
            return false;
        }
        HumanHashCode that = (HumanHashCode) o;

    }
}
