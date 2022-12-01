import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff  extends  Person implements  Salary{
    private  String position;
    private  String education;

    @Override
    public double salaryToPay(double hours, double rate)
    {
        return hours * rate;
    }
    @Override
    public double salaryForOverTime(double hours, double rate)
    {
        return hours * rate * 3.0;
    }


    public void inicjuj1() throws IOException{
        BufferedReader read = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        super.inicjuj();
        System.out.println("");
        this.position = read.readLine();
        System.out.println();
        this.education = read.readLine();
    }
    public void  print1()
    {
        System.out.println("Twoja edukacja "+ education);
        System.out.println("Twoja pozycja "+ position);

    }
}
