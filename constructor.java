//CONSTRUCTOR :- 


    class student{
        int roll;
        String name;

        student(){
            System.out.println("Calling constructor");
            roll = 61;
            name = "Siddhant";
        }
        
        void display(){
            System.out.println("Roll no: - "+ roll);
            System.out.println("Name: - "+ name);
        }
        public static void main(String[] args) {
            student s = new student();
            s.display();

        }
    }

