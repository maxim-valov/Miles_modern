public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 14_988;
        int miles = service.calculate(price);
        System.out.println("Bonus Miles: " + miles);
    }
}