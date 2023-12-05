package animals;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Roar");
    }

    @Override
    public void eat(String food) {
        if("Meat".equalsIgnoreCase(food)) {
            System.out.println("Thank you, I like eat " + food.toLowerCase());
        } else {
            System.out.println("I don't like eat " + food.toLowerCase());
        }
    }
}
