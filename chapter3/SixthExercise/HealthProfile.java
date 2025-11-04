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

    String getName() {return name;}
    String getSurname() {return surname;}
    String getSex() {return sex;}
    int getDd() {return dd;}
    int getMm() {return mm;}
    int getYy() {return yy;}
    float getHeight() {return height;}
    float getWeight() {return weight;}

    void setName(String name) {this.name = name;}
    void setSurname (String surname) {this.surname = surname;}
    void setSex(String sex) {this.sex = sex;}
    void setDd(int dd)
    {
        if (dd > 0 && dd < 32)
            this.dd = dd;
    }
    void setMm(int mm)
    {
        if (mm > 0 && mm < 13)
            this.mm = mm;
    }
    void setYy(int yy)
    {
        if(yy > 0 && yy < 2026)
            this.yy = yy;
    }

}
