public class DogApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Rocky";
        dog1.breed = "German Shepherd";
        dog1.age = 5;

        Dog dog2 = new Dog();
        dog2.name = "Lucy";
        dog2.breed = "Poodle";
        dog2.age = 2;

        dog1.bark();
        dog2.bark();
    }
}