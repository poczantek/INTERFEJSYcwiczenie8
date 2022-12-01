import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

public class Person {
    private String name;
    private String surname;
    private String street;
    private String code;
    private String city;

    public Person() {
    }



    public void inicjuj() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wpisz swoje imię: ");
        this.name = reader.readLine();
        System.out.println("Wpisz swoje nazwisko: ");
        this.surname = reader.readLine();
        System.out.println("Wprowadź swoją ulicę: ");
        this.street = reader.readLine();
        System.out.println("Wpisz swój kod pocztowye: ");
        this.code = reader.readLine();
        System.out.println("Wprowadź swoje miasto: ");
        this.city = reader.readLine();
    }

    public void print(){
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Twoje imie: " + this.name);
        System.out.println("Twoje nazwisk: " + this.surname);
        System.out.println("Twoja ulica: " + this.street);
        System.out.println("Twoj kod pocztowy: " + this.code);
        System.out.println("Twoje miasto: " + this.city);
    }
}