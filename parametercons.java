class student{
    int roll;
    String name;

    student(int r,String n){
        roll = r;
        name = n;

    }
    void display(){
        System.out.println("Roll no."+ roll);
        System.out.println("Name is "+ name);
    }
    public static void main(String[] args) {
        student s1 = new student(10,"aman");
        student s2 = new student(20,"ravi");

        s1.display();
        s2.display();
    }
}
