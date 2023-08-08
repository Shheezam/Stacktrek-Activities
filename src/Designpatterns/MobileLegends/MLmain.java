package Designpatterns.MobileLegends;

public class MLmain {
    public static void main(String[] args) {
        Action jawheadBasic = new BasicAttack("shoots missile at", 10);
        Action jawheadSkill1 = new Skill("flings", 50);
        Action jawheadSkill2 = new Skill("locks onto and charges at", 80);

        Character jawhead = new Character("Jawhead", jawheadBasic, jawheadSkill1, jawheadSkill2);

        Action chouBasic = new BasicAttack("punches", 11);
        Action chouSkill1 = new Skill("dashes towards", 65);
        Action chouSkill2 = new Skill("does a roundkick at", 70);

        Character chou = new Character("Chou", chouBasic, chouSkill1, chouSkill2);

        jawhead.performAction("skill1", chou);
        chou.performAction("basic", jawhead);
    }
}
