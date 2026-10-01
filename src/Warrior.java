public class Warrior extends GameCharacter{
    //Constructor
    public Warrior(String name, int health, int attackPower){
        super(name, health, attackPower);
    }

    //Attack Override
    @Override
    public void attack(GameCharacter target){
        if(!isAlive())
            throw new IllegalStateException(getName() + " cannot attack because they're defeated.");

        if(!target.isAlive())
            throw new IllegalStateException(target.getName() + " is already defeated.");

        System.out.println(getName() + " swings a sword at " + target.getName() + "!");
        target.takeDamage(getAttackPower());
    }
}
