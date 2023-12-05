package animals;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Squeak");
    }

    @Override
    public void eat(String food) {
        if("Grass".equalsIgnoreCase(food)) {
            System.out.println("Thank you, I like eat " + food.toLowerCase());
        } else {
            System.out.println("I don't like eat " + food.toLowerCase());
        }
    }
}
