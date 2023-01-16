package InherietJava;

public class InheritnceAnimal {
    public static void main(String[] args){
        Cat cat = new Cat(false , "milk" , 4 , "black");

        System.out.println("Cat is vegetarian? " + cat.isVegetarian());
        System.out.println("Cats eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
    }
}
