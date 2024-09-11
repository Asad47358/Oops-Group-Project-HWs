package ZooEcosystem;

public abstract class  Animal implements AnimalBehavior{

    String name;
    String color;

    void displayInformation(){
        System.out.println("Name: "+name+" Color: "+color);
    }
}


class Mammal extends Animal{

    public  void eat(){
        System.out.println("Mammal eat:  leaves, shoots, fruits");
    }
    public void sleep(){
        System.out.println("Mammal can sleep");
    }
    public  void makeSound(){
        System.out.println("Mammal make sound");
    }
}



class Bird extends Animal{
    public  void eat(){
        System.out.println("Bird eat: seed, peanuts, suet and mealworms");
    }
    public void sleep(){
        System.out.println("Bird can sleep");
    }
    public  void makeSound(){
        System.out.println("Bird make sound");
    }

}
