public class BMIService {

    public int calculate (double mass, double growth) {
        double result = mass / (growth * growth / 10000);
        return (int) result;

    }
}
