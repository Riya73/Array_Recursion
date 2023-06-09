package Array_Recursion;

import java.util.Arrays;

public class AddingTaxToSalaries {
    public static double[] taxAndsalaries(double[] salaries, int index) {
        if (index == salaries.length) {
            return new double[0];
        } else {
            double salary = salaries[index];
            double newSalary = salary + (0.1 * salary);
            double[] remaining = taxAndsalaries(salaries, index + 1);
            double[] result = new double[remaining.length + 1];
            result[0] = newSalary;
            System.arraycopy(remaining, 0, result, 1, remaining.length);
            return result;
        }
    }

    public static void main(String[] args) {
        double[] salaries = {140000, 342000.0, 233000.0};
        double[] newSalaries = taxAndsalaries(salaries, 0);
        System.out.println("New salaries: " + Arrays.toString(newSalaries));
    }
}
