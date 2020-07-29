/**
 *   participant: Decorator
 */
public abstract class PowerDecorator implements WeaponComponent {
    
    protected WeaponComponent weapon;
    
    public PowerDecorator(WeaponComponent weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public String shoot() {
        return weapon.shoot();
    }
    
}
