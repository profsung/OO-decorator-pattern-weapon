/**
 *   participant: ConcreteDecorator
 */
public class LaserPower extends PowerDecorator {

    public LaserPower(WeaponComponent weapon) {
        super(weapon);
    }
    
    @Override
    public String shoot() {
        return super.shoot() + addedPower();
    }
    
    private String addedPower() {
        return " + Laser power";
    }
    
}
