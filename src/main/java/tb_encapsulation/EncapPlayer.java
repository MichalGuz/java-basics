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

    public String getName() {
        return name;
    }

    public int getHealthy() {
        return hitPoint;
    }

    public int getWeapon() {
        return weapon;
    }

    public static void main(String[] args) {
        EncapPlayer player = new EncapPlayer("One", 50, 3);
        System.out.println("initial player health is: " + player.getHealthy());
    }
}
