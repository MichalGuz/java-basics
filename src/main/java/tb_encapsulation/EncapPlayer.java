package tb_encapsulation;

public class EncapPlayer {
    private String name;
    private int hitPoint = 100;
    private int weapon;

    public EncapPlayer(String name, int hitPoint, int weapon) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.weapon = weapon;
    }
}
