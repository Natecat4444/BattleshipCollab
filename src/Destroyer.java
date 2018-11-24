/**
 * Created by nathankaufman on 11/24/18.
 */
public class Destroyer implements Ship {
    private int health;
    private int cooldown;

    public Destroyer(){
        health = 2;
        cooldown = 0;
    }

    @Override
    public void fire() {
        cooldown = 0;
    }

    @Override
    public boolean canFire() {
        return true;
    }

    @Override
    public boolean isAlive() {
        return health>0;
    }

    @Override
    public void takeDamage() {
        health = health-1;
    }

    @Override
    public void reduceCooldown() {
        cooldown = 0;
    }
}
