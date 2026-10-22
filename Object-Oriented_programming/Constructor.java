class Constructor{
    public static class Car{
        int price;
        String name;
        // Default Constructor
        Car(){

        }
        //Parameterized Constructor
        Car(int p , String n){
            price = p;
            name = n;
        }
        void print(){
            System.out.print(name + " " + price);
        }
    }
    public static void main(String[] args) {
        // Here we have to repetitively give the values .
        Car c1 = new Car();
        c1.name = "Tata";
        c1.price = 500000;
        // Hhere We can pass the value as parameters.
        Car c2 = new Car(500000,"Maruti");
        c2.print(); 
    }
}