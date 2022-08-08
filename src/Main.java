public class Main {

    public static void main(String[] args) {
        BMIService service = new BMIService();
        int mass = 100;
        int growth = 170;
        double BMI = service.calculate(mass, growth);

        System.out.println("Индекс массы тела - " + BMI);
    }
}
