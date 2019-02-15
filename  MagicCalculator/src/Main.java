import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Please input your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Please enter your annual salary: ");
        String annualSalary = scanner.nextLine();
        System.out.print("Please enter your work start year: ");
        String workYear = scanner.nextLine();

        String fullName = firstName + " " + lastName;


        double annualSalaryNumber = Double.parseDouble(annualSalary);

        BigDecimal monthlySalary = BigDecimal.valueOf(annualSalaryNumber / 12);

        System.out.printf("%1$.2f", monthlySalary);

        // if monthly salary decimal remainder is >= 0.50 round up using math ceiling, else round down using math floor

       // if (monthlySalary % 0 ){

        //}
        

        int workYearNumber = Integer.parseInt(workYear);

        int magicYear = workYearNumber + 65;

        System.out.println("Name: " + fullName);
        //System.out.println("Monthly Salary: " + monthlySalary.setScale(0, RoundingMode.HALF_UP));
        System.out.println("Magic Year: " + magicYear);

    }
}

//Ceiling Floor rounding decide whether which one to use