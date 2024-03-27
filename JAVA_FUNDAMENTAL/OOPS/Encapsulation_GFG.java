package JAVA_FUNDAMENTAL.OOPS;

public class Encapsulation_GFG {
    // Java Program to demonstrate
// Java Encapsulation
        // Encapsulating the name and age
        // only approachable and used using
        // methods defined
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        // main function
        public static void main(String[] args)
        {
            // person object created
            Encapsulation_GFG person = new Encapsulation_GFG();
            person.setName("ANJAN");
            person.setAge(21);

            // Using methods to get the values from the
            // variables
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }


