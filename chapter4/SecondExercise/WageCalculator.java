package SecondExercise;

public class WageCalculator {
    String name;
    double hoursWage;
    int hours;
    int extraHours;

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

    
}
