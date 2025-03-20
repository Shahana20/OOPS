interface Walkable {
    void walk();    
}

interface Speakable {
    void speak();
}

class Human implements Walkable, Speakable {
    public void walk() {
        System.out.println("I walk");
    }
    public void speak() {
        System.out.println("I speak");
    }
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.walk();
        obj1.speak();
    }
}
