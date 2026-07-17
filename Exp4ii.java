import java.util.Scanner;
public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String idInput = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        String salaryInput = sc.nextLine();
        System.out.print("Enter Bonus: ");
        String bonusInput = sc.nextLine();
        Integer empId = Integer.valueOf(idInput);
        Double basicSalary = Double.valueOf(salaryInput);
        Double bonus = Double.valueOf(bonusInput);
        if (basicSalary <= 0) {
            System.out.println("Invalid salary! Salary must be greater than zero.");
        } else if (bonus < 0) {
            System.out.println("Invalid bonus! Bonus cannot be negative.");
        } else {
            double netSalary = basicSalary + bonus;
            System.out.println("Employee ID: " + empId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Net Salary: " + netSalary);
        }
        sc.close();
    }
}
