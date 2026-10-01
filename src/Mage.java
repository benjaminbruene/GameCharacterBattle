public class Mage extends GameCharacter{
    //Constructor
    public Mage(String name, int health, int attackPower){
        super(name, health, attackPower);
    }

    //Attack Method Override
    @Override
    public void attack(GameCharacter target){
        //Check if this character is alive
        if (!isAlive())
            throw new IllegalStateException(getName() + " cannot attack because they're defeated.");

        //Check if target character is alive
        if (!target.isAlive())
            throw new IllegalStateException(target.getName() + " is already defeated. It would be a waste of mana");

        //Apply the attack
        System.out.println(getName() + " casts Snow Grave at " + target.getName() + "!");
        target.takeDamage(getAttackPower());
    }
}
