package JavaAdvance.JavaOOP.Encapsulation.Lab.SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        if(firstName.length() <= 3) {
            throw new IllegalArgumentException("Name must be longer.");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if(lastName.length() <= 3) {
            throw new IllegalArgumentException("Name must be longer.");
        }

        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("The age cannot be 0 or lower.");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less then 460 leva");
        }
        this.salary = salary;
    }

    public Person(String firstName, String lastName, int age, double salary){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old", this.getFirstName(), this.getLastName(), this.getAge());
    }

    public String printSalary() {
        return String.format("%s %s gets %f leva", this.getFirstName(), this.getLastName(), this.getSalary());
    }

    public void increaseSalary(double percentage) {
        if(this.getAge() < 30) {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }
    }
}
