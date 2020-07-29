/**
 *   participant: ConcreteComponent
 */
public class BasicWeapon implements WeaponComponent {

    @Override
    public String shoot() {
        return "Shoot: normal power";
    }
    
}
