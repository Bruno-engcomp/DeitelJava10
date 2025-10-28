package Chapter4.ClassStudent;

public class studentTest {
    public static void main(String[] args) {
        student account1 = new student("Jane Green", 93.5);
        student account2 = new student("John Blue", 72.75);

        System.out.printf("%s's grade is %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's grade is %s%n", account2.getName(), account2.getLetterGrade());
    }
} // Fim classe StudentTest
