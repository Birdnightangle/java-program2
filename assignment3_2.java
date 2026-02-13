
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.05;
    }

    void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": Good performance.");
    }

    void manageProject() {
        System.out.println(name + " is managing general company tasks.");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("----------------------------------");
    }
}
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; 
    }

    @Override
    void manageProject() {
        System.out.println(name + " is managing multiple projects and teams.");
    }
}

class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;   
    }

    @Override
    void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": Excellent coding skills.");
    }
}

class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.08;   // 8% bonus
    }

    @Override
    void manageProject() {
        System.out.println(name + " is working on assigned programming modules.");
    }
}
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", "Mumbai", 80000);
        Employee e2 = new Developer("Sneha", "Pune", 60000);
        Employee e3 = new Programmer("Amit", "Nagpur", 50000);

        e1.displayDetails();
        e1.manageProject();
        e1.generatePerformanceReport();

        e2.displayDetails();
        e2.manageProject();
        e2.generatePerformanceReport();

        e3.displayDetails();
        e3.manageProject();
        e3.generatePerformanceReport();
    }
}
