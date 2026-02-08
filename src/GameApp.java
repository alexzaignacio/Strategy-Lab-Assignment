public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character("Knight");
        knight.attack();
        knight.defend();

        Character wizard = new Character("Wizard");
        wizard.attack();
        wizard.defend();

        Character archer = new Character("Archer");
        archer.attack();
        archer.defend();
    }
}
