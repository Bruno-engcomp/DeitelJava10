package FourthExercise;

public class Date {
    private int day;
    private int year;
    private int month;

    public Date (int day, int month, int year)
    {
        if(day < 32 && day > 0)
            this.day = day;
        if (month > 0 && month < 13)
            this.month = month;
        if(year > 0)
            this.year = year;
    }
    public void displayDate ()
    {
        System.out.printf("The date is %d/%d/%d%n",getMonth(),getDay(),getYear());
    }

    public int getDay () {return day;}
    public int getMonth () {return month;}
    public int getYear () {return year;}

    public void setDay (int day)
    {
        if(day < 32 && day > 0)
            this.day = day;
        else
            System.out.println("The day is invalid");
    }
    public void setMonth (int month)
    {
        if (month > 0 && month < 13)
            this.month = month;
        else
            System.out.println("The month is invalid");
    }
    public void setYear (int year)
    {
        if(year > 0)
            this.year = year;
        else
            System.out.println("The year is invalid");
    }



}
