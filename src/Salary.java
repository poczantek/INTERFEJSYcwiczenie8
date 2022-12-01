public interface Salary {
    double salaryToPay (double hours, double rate);


    default double salaryForOverTime(double hours, double rate){return  hours * rate;}


    static int isBonus (int yearOfExperiance){
        if (yearOfExperiance > 5)
            return 100;
        else
            return 0;
    }

}