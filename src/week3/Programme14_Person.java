package week3;

public class Programme14_Person {

    private String firstName;
    private String lastName;
    private int age;

    // Constructor (optional)
    public Programme14_Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    // Method to check if the person is a teen
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Method to get the full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    // Main method (for testing purposes)
    public static void main(String[] args) {
        Programme14_Person person = new Programme14_Person("John", "Doe", 18);
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Is Teen? " + person.isTeen());
    }
}