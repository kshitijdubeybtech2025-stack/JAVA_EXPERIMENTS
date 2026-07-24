import java.util.Scanner;

// Employee payroll program
public class Exp4P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking employee details
        int id = scanner.nextInt();
        double salary = scanner.nextDouble();
        double bonus = scanner.nextDouble();
        // Converting values into wrapper objects
        Integer empId = Integer.valueOf(id);
        Double basicSalary = Double.valueOf(salary);
        Double empBonus = Double.valueOf(bonus);
        // Checking salary is valid
        if (basicSalary > 0 && empBonus >= 0) {
            double netSalary = basicSalary + empBonus;
            Double result = Double.valueOf(netSalary);

            System.out.println("Employee ID: " + empId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus: " + empBonus);
            System.out.println("Net Salary: " + result);
        } else {
            System.out.println("Invalid Salary");
        }
        scanner.close();
    }
}