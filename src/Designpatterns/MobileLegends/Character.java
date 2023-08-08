package Designpatterns.MobileLegends;

public class Character {

    private String name;
    private Action basicAttack;
    private Action skill1;
    private Action skill2;


    public Character(String name, Action basicAttack, Action skill1, Action skill2) {
        this.name = name;
        this.basicAttack = basicAttack;
        this.skill1 = skill1;
        this.skill2 = skill2;
    }

    public  void performAction(String typeOfAction, Character targetCharacter ){
            if (typeOfAction.equalsIgnoreCase("basic")){
                basicAttack.execute(this, targetCharacter);
            } else if (typeOfAction.equalsIgnoreCase("skill1")) {
                skill1.execute(this, targetCharacter);
            } else if (typeOfAction.equalsIgnoreCase("skill2")) {
                skill2.execute(this, targetCharacter);
            }
            else {
                System.out.println("invalid action");
            }
    }


    public String getName() {
        return name;
    }
}


