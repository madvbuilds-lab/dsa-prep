class Students{
    String name;
    //The Private Variables remain hidden or cannot be changed, accessed by the users. The only way to access them is by using The getter and setter methods.
    private int rno;
    double cgpa;
    void print(){
        System.out.println(rno);
    }
    int getrno(){
        return rno;
    }
    void setrno(int x){
        rno = x;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Students s = new Students();
        s.getrno();
        s.setrno(45);
    }
}