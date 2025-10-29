package FourthExercise;

public class Date {
    private int day;
    private int year;
    private int month;


    void displayDate ()
    {
        System.out.printf("The date is %d/%d/%d%n",getMonth(),getDay(),getYear());
    }

    int getDay () {return day;}
    int getMonth () {return month;}
    int getYear () {return year;}

    void setDay (int day)
    {
        if(day < 32 && day > 0)
            this.day = day;
    }
    void setMonth (int month)
    {
        if (month > 0 && month < 13)
            this.month = month;
    }
    void setYear (int year)
    {
        if(year > 0)
            this.year = year;
    }



}
