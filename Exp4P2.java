import java.util.Scanner;

// Employee class
class Employee {
    Integer id;
    Double salary;
    Double bonus;
    // Store employe details
    Employee(Integer id, Double salary, Double bonus) {
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    // Calculae salary
    void calculateSalary() {
        double netSalary = salary + bonus;
        System.out.println("Net Salary: " + netSalary);
    }
}
public class Exp4P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take employee details
        System.out.print("Enter Employee ID: ");
        Integer id = Integer.valueOf(sc.nextLine());
        System.out.print("Enter Basic Salary: ");
        Double salary = Double.valueOf(sc.nextLine());
        System.out.print("Enter Bonus: ");
        Double bonus = Double.valueOf(sc.nextLine());
        // Chck salary value
        if (salary > 0 && bonus >= 0) {
            Employee e = new Employee(id, salary, bonus);
            e.calculateSalary();
        } else {
            System.out.println("Invalid Salary or Bonus");
        }
        sc.close();
    }
}