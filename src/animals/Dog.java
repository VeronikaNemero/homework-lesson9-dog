package animals;

public class Dog extends Animal{

    private Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void eat(String food) {
        if("Meat".equalsIgnoreCase(food)) {
            System.out.println("Thank you, I like eat " + food.toLowerCase());
        } else {
            System.out.println("I don't like eat " + food.toLowerCase());
        }
    }

    public static Dog getDog(){
        return new Dog();
    }

    public static void methDog(String food){
        Dog dog = new Dog();
        dog.voice();
        dog.eat(food);
    }
}
