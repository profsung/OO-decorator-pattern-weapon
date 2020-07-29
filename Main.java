/*
 *   Decorator design pattern
 */

public class Main {
    
    public static void main(String[] args) {
        WeaponComponent weapon = new BasicWeapon();
        System.out.println(weapon.shoot());
        
        weapon = new MissilePower(weapon);
        System.out.println(weapon.shoot());
        
        weapon = new LaserPower(weapon);
        System.out.println(weapon.shoot());
        
        System.out.println("--------------------");
        WeaponComponent another = new LaserPower(
                new MissilePower(new LaserPower(new BasicWeapon()))
        );
        System.out.println(another.shoot());
    }
    
}
