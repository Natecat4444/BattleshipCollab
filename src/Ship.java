/**
 * Created by nathankaufman on 11/24/18.
 */
public interface Ship {
    public void fire();
    public boolean canFire();
    public boolean isAlive();
    public void takeDamage();
    public void reduceCooldown();
}
