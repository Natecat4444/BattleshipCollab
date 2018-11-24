/**
 * Created by nathankaufman on 11/24/18.
 */
public class Battleship implements Ship {
    int health;
    int coolDown;

    public Battleship(){
        health = 4;
        coolDown = 0;
    }

    @Override
    public void fire() {
        if(canFire()){
            coolDown = 2;
        }
    }

    @Override
    public boolean canFire() {
        return coolDown == 0;
    }

    @Override
    public boolean isAlive() {
        return health >0;
    }

    @Override
    public void takeDamage() {
        health = health-1;
    }

    @Override
    public void reduceCooldown() {
        if(coolDown>0) {
            coolDown = coolDown - 1;
        }
    }
}
