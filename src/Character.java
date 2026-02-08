import java.util.ArrayList;
import java.util.List;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies = new ArrayList<>();

    public Character(String type) {
        this.type = type;
        if (type.equals("Knight")) {
            attackStrategy = new SwingSword();
            defenseStrategies.add(new Shield());
            defenseStrategies.add(new Dodge());
            defenseStrategies.add(new CreateMagicBarrier());
        } else if (type.equals("Wizard")) {
            attackStrategy = new CastSpell();
            defenseStrategies.add(new CreateMagicBarrier());
        } else if (type.equals("Archer")) {
            attackStrategy = new ShootArrow();
            defenseStrategies.add(new Dodge());
        }
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}
