public class DZ31 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int milesAccrual = service.calculate(60);
        System.out.println(milesAccrual);
    }
}
