class UserDefinedDatatype{
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        //Declaration
        Student s = new Student();
        //Initialization
        s.name = "Madhav";
        s.rno = 21;
        s.cgpa = 7.9;
        System.out.print(s.cgpa);
    }
}