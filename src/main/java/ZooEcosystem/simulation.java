package ZooEcosystem;

public class simulation {
    public static void main(String[] args) {

        Bird b = new Bird();
        b.name = "Eagle";
        b.color = "Brown";
        b.displayInformation();
        b.eat();
        b.sleep();
        b.makeSound();
        System.out.println();
        Mammal m = new Mammal();
        m.name="Beer";
        m.color="Black";
        m.displayInformation();
        m.eat();
        m.sleep();
        m.makeSound();


    }
}
