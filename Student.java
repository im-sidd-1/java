public class Student {
   // Private variables (Encapsulation)
   private String name;
   private int age;
   private int marks;
   // Getter methods
   public String getName() {
       return name;
   }
   public int getAge() {
       return age;
   }
   public int getMarks() {
       return marks;
   }
   // Setter methods
   public void setName(String name) {
       this.name = name;
   }
   public void setAge(int age) {
       this.age = age;
   }
   public void setMarks(int marks) {
       this.marks = marks;
   }
   // Method to display details
   public void display() {
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Marks: " + marks);
   }
   public static void main(String[] args) {
       Student s1 = new Student();
       s1.setName("Anita");
       s1.setAge(21);
       s1.setMarks(90);
       s1.display();
   }
}

