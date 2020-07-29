/**
 *   participant: ConcreteDecorator
 */
public class MissilePower extends PowerDecorator {

    public MissilePower(WeaponComponent weapon) {
        super(weapon);
    }
    
    @Override
    public String shoot() {
        return super.shoot() + addedPower();
    }
    
    private String addedPower() {
        return " + Missile power";
    }
    
}
