public class Main {
    public static void main(String[] args) {

        int ticketPrice = 59;
        int priceForBonus = 20;
        int totalBonusMiles = ticketPrice / priceForBonus;
        System.out.println("Начислено бонусных миль: " + totalBonusMiles);
    }
}