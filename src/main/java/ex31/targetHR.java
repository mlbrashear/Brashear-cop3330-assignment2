package ex31;

public class targetHR {
    public static double thr(int age, int restingHR, double inten) {
        return (((220 - age) - restingHR) * (inten/100)) + restingHR;
    }
}
