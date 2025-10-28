package ThirdExercise;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String lastName;
        String Desc;
        double salary;

        Employee Employee1 = new Employee("Allana","Silva","The best worker of the company", 100000.00);
        Employee Employee2 = new Employee("Bruno", "Almeida", "Is not better than Allana, but is very good too", 10000.00);

        System.out.printf("Employee name: %s %s %nDescription: %s%nSalary:%.2f%n"
                , Employee1.getName(), Employee1.getLastName(), Employee1.getDesc(), Employee1.getSalary());

        System.out.printf("Employee name: %s %s %nDescription: %s%nSalary:%.2f%n%n"
                , Employee2.getName(), Employee2.getLastName(), Employee2.getDesc(), Employee2.getSalary());

        System.out.printf("Anual salary of %s is %.2f%n", Employee1.getName(), Employee1.getSalary() * 12);
        System.out.printf("Anual salary of %s is %.2f%n%n", Employee2.getName(), Employee2.getSalary() * 12);

        System.out.printf("Enter the new salary of %s %s:",Employee1.getName(), Employee1.getLastName());;
        salary = input.nextDouble();
        Employee1.setSalary(salary);

        System.out.printf("Enter the new salary of %s %s:",Employee2.getName(), Employee2.getLastName());;
        salary = input.nextDouble();
        Employee2.setSalary(salary);

        System.out.printf("%n The new salary of %s is %.2f%n",Employee1.getName(), Employee1.getSalary());;
        System.out.printf("The new salary of %s is %.2f%n",Employee2.getName(), Employee2.getSalary());;

        System.out.print("The employees got a 10% raise\n.");

        Employee1.raiseSalary();
        Employee2.raiseSalary();
        
        System.out.printf("%n The new salary of %s is %.2f%n", Employee1.getName(), Employee1.getSalary());
        System.out.printf("%n The new salary of %s is %.2f%n", Employee2.getName(), Employee2.getSalary() *);
    }
}
