class UserDefinedDatatype{
    //Student is a class that refers to all the classification that it consist of. A class is like a Blueprint for the Objects.
    public static class Student{
        String name;
        int rno;
        double cgpa;
        //We can also make User defined data structure to help print the variables inside the main function.
        void print(){
            System.out.println(name + " " + rno + " " + cgpa);
        }
    }
    public static void main(String[] args) {
        //Declaration
        //Here "s" is an object that is like an instance of a class that consist of real world entities.
        Student s = new Student();
        //Initialization
        s.name = "Madhav";
        s.rno = 21;
        s.cgpa = 7.9;
        // prints the variables without using System.out.print()
        s.print();
        
    }
}