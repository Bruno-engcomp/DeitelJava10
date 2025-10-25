package ThirdExercise;

public class Employee {
    private String name;
    private String lastName;
    private String desc;
    private double salary;

    public Employee (String name, String lastName, String desc, double salary)
    {
    this.name = name;
    this.desc = desc;
    this.lastName = lastName;

    if(salary > 0)
        this.salary = salary;
    else
        System.out.print("This salary is invalid,");
    }

    public void setName(String name) {this.name = name;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDesc(String Desc) {this.desc = desc;}
    public void setSalary(double salary) {this.salary = salary;}

    public String getName() {return name;}
    public String getLastName() {return lastName;}
    public String getDesc() {return desc;}
    public double getSalary() {return salary;}





}
