/**
 * Created by nathankaufman on 11/24/18.
 */
public class Carrier implements Ship {
    private int health;
    private int cooldown;

    public Carrier(){
        health = 5;
        cooldown = 0;
    }
    @Override
    public void fire() {
        if(canFire()){
            cooldown = 3;
        }

    }

    @Override
    public boolean canFire() {
        return cooldown == 0;
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
        if(cooldown > 0){
            cooldown = cooldown -1;
        }
    }
}
