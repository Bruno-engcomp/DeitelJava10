package SecondExercise;

public class WageCalculator {
    private String name;
    private double hoursWage;
    private int hours;
    private int extraHours;



    public WageCalculator(String name, double hoursWage, int hours, int extraHours)
    {
        this.name = name;
        if (hoursWage > 0)
            this.hoursWage = hoursWage;
        if (hours > 0)
            this.hours = hours;
        if (extraHours > 0)
            this.extraHours = extraHours;
    }

    double getWage()
    {
        return (hoursWage * hours) + (extraHours * hoursWage * 0.5);
    }
    String getName () {return name;}

    void setHoursWage (double hoursWage) {this.hoursWage = hoursWage;}
    void setHours (int hours) {this.hours = hours;}
    void setExtraHours (int extraHours) {this.extraHours = extraHours;}

    void employeeSummary ()
    {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Wage: %.2f", getWage());

    }


}
