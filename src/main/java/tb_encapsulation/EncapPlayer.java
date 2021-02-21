package tb_encapsulation;

public class EncapPlayer {
    private String name;
    private int hitPoint = 100;
    private int weapon;

    public EncapPlayer(String name, int health, int weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoint = health;
        }
        this.weapon = weapon;
    }
}
