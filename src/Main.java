public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 12670;
        int miles = service.calculate(price);
        System.out.println("Миль накоплено: "+ miles);
    }
}