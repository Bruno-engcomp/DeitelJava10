package FifthExercise;

public class HeartRates {
    private String name;
    private String surname;
    private int birthday;
    private int birthmonth;
    private int birthyear;

    public HeartRates (String name, String surname, int birthday, int birthmonth, int birthyear)
    {
        if(birthday > 0 && birthday < 32)
            this.birthday = birthday;
        if(birthmonth > 0 && birthmonth < 13)
            this.birthmonth = birthmonth;
        if(birthyear > 1900)
            this.birthyear = birthyear;
    }
    void birthdate(int birthday, int birthmonth, int birthyear)
    {
        System.out.printf("");
    }

    // Funcoes para armazenar nas variaveis
    void setName (String name) {this.name = name;}
    void setSurname (String surname) {this.surname = surname;}
    void setBirthday (int birthday) {this.birthday = birthday;}
    void setBirthmonth (int birthmonth) {this.birthmonth = birthmonth;}
    void setBirthyear (int birthyear) {this.birthyear = birthyear;}

}
