package FifthExercise;

public class HeartRates {
    private String name;
    private String surname;
    private int birthday;
    private int birthmonth;
    private int birthyear;

    public HeartRates (String name, String surname, int birthday, int birthmonth, int birthyear)
    {
        this.name = name;
        this.surname = surname;

        if(birthday > 0 && birthday < 32)
            this.birthday = birthday;
        if(birthmonth > 0 && birthmonth < 13)
            this.birthmonth = birthmonth;
        if(birthyear > 1900)
            this.birthyear = birthyear;
    }
    void birthdate()
    {
        System.out.printf("%d/%d/%d", getBirthday(), getBirthmonth(), getBirthyear());
    }
    void heartRateInterval(int birthyear)
    {
        double maxHeartRate = 220 - (2025 - birthyear);
        System.out.printf("The max Heart Rate is %.1f%n", maxHeartRate);
        System.out.printf("The tarjet heart rate is from %f to %.1f%n%n", maxHeartRate * 0.5, maxHeartRate * 0.85);
    }
    // Funcoes para armazenar nas variaveis
    public void setName (String name) {this.name = name;}
    public void setSurname (String surname) {this.surname = surname;}
    public void setBirthday (int birthday) {this.birthday = birthday;}
    public void setBirthmonth (int birthmonth) {this.birthmonth = birthmonth;}
    public void setBirthyear (int birthyear) {this.birthyear = birthyear;}

    // Funcoes para exibir as variaveis
    public String getName () {return name;}
    public String getSurname () {return surname;}
    public int getBirthday () {return birthday;}
    public int getBirthmonth () {return birthmonth;}
    public int getBirthyear () {return birthyear;}
    public int getAge () {return 2025 - birthyear;}


}
