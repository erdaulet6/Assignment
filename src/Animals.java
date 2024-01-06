public class Animals {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dog Food", "Home", "Labrador");
        Cat myCat = new Cat("Cat Food", "House", "Tabby");
        Horse myHorse = new Horse("Hay", "Stable", "Brown");


        myDog.performDogActions();
        myCat.performCatActions();
        myHorse.performHorseActions();
    }
}