package guru.qa;

public class Deposition {
    int year;
    double depo;
    float percent;

    public Deposition(double depo, float percent, int year) {
        this.depo = depo;
        this.percent = percent;
        this.year = year;
    }

    void depoCalc() {
        for (int i = 1; i <= year; i++) {
            depo += depo * percent;
        }
            System.out.println("Сумма на депозите за " + year + " год(а) составила " + depo + " рублей");

    }
}
