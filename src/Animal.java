class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is making some noise.");
    }

    public void eat() {
        System.out.println("The animal is eating " + food + ".");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public void performActions() {
        makeNoise();
        eat();
        sleep();
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public void makeNoise() {
        System.out.println("The dog is barking.");
    }

    public void eat() {
        System.out.println("The dog is eating " + food + " from a bowl.");
    }

    public void fetch() {
        System.out.println("The dog is fetching the ball.");
    }

    public void performDogActions() {
        performActions();
        fetch();
    }
}

class Cat extends Animal {
    String furColor;

    public Cat(String food, String location, String furColor) {
        super(food, location);
        this.furColor = furColor;
    }

    public void makeNoise() {
        System.out.println("The cat is meowing.");
    }

    public void eat() {
        System.out.println("The cat is delicately eating " + food + ".");
    }

    public void purr() {
        System.out.println("The cat is purring.");
    }

    public void performCatActions() {
        performActions();
        purr();
    }
}

class Horse extends Animal {
    String maneColor;

    public Horse(String food, String location, String maneColor) {
        super(food, location);
        this.maneColor = maneColor;
    }

    public void makeNoise() {
        System.out.println("The horse is neighing.");
    }

    public void eat() {
        System.out.println("The horse is grazing on " + food + ".");
    }

    public void gallop() {
        System.out.println("The horse is galloping in the field.");
    }

    public void performHorseActions() {
        performActions();
        gallop();
    }
}

