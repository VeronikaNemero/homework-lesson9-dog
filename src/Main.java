import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog.getDog().voice();
        Dog.getDog().eat("meat");

        Dog.methDog("carrot");
    }
}