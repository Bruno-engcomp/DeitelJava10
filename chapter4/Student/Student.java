package Chapter4.ClassStudent;

public class Student {
    private String name;
    private double average;

    // Construtor inicializa variaveis de instancia
    public Student(String name, double average)
    {
        this.name = name;

        // Valida a media
        if (average > 0.0 && average <= 100.0)
            this.average =  average;
    }

    //Define o nome de student
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAverage(double average)
    {
        this.average = average;
    }

    public String getName () {return name;}

    public double getAverage () {return average;}

    public String getLetterGrade()
    {
        String letterGrade = "";
        if(average >= 90)
            letterGrade = "A";
        else if(average >= 80)
            letterGrade = "B";
        else if(average >= 70.0)
            letterGrade = "C";
        else if(average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;

    }


} // Fim classe Student
