package Designpatterns.MobileLegends;

public class BasicAttack implements Action{
    private String actionMessage;
    private int baseDamage;

    public BasicAttack(String actionMessage, int baseDamage) {
        this.actionMessage = actionMessage;
        this.baseDamage = baseDamage;
    }

    @Override
    public void execute(Character source, Character targetCharacter) {
            int damage = baseDamage;
        System.out.println(source.getName() + " " + actionMessage + " " + targetCharacter.getName() + " " + "for" +" "+ damage +" " + "damage!");

    }
}






