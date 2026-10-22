class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.print("Bark ");
        }
    }
    public static class Cat{
        void speak(){
            System.out.print("Meow ");
        }
    }
    public static class Human{
        void speak(){
            System.out.print("Hello ");
        }
    }
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        Human h = new Human();
        d.speak();
        c.speak();
        h.speak();
    }
}