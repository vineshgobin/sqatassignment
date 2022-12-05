public class Main {
    public static void main(String[] args) {
        // Initializing the objects
        Bird myBird = new Bird();
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        // Outputting their sound object
        System.out.println("I am a bird! " + myBird.sound());
        System.out.println("I am a cat! " + myCat.sound());
        System.out.println("I am a dog! " + myDog.sound());
    }
}