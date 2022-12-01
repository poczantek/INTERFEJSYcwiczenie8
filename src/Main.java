import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.inicjuj();
        person.print();
        Staff staff = new Staff();
        staff.inicjuj();
          staff.print1();

        double exampleTP = staff.salaryToPay(12, 2.5);
        double exampleFOT = staff.salaryForOverTime(8, 3);
        int exampleIsBonus = Salary.isBonus(50);

        System.out.println("Wynagrodzenie pracownika: "+ exampleTP);
        System.out.println("Wynagrodzenie pracownika: " + exampleFOT);
        System.out.println("Wynagrodzenie pracownika: "+ exampleIsBonus);
    }
}