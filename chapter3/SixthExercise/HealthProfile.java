package SixthExercise;

public class HealthProfile {
    String name;
    String surname;
    String sex; // Male or Female
    int dd;
    int mm;
    int yy;
    float height; // In meters
    float weight; // In Kilograms

    public HealthProfile (String name, String surname, String sex, int dd, int mm, int yy, float height, float weight)
    {
        this.name = name;
        this.surname = surname;
        this.sex = sex;

        if (dd > 0 && dd < 32)
            this.dd = dd;
        if (mm > 0 && mm < 13)
            this.mm = mm;
        if (yy > 0 && < 2026)
            this.yy = yy;
        if (height > 0.20)
            this.height = height;
        if (weight > 2.6)
            this.weight = weight;

    }


}
