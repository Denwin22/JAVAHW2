public class Main {
    public static void main(String[] args) {

        int ticketCost = 13676;
        int milesForSpentRub = 20;

        int bonusMiles = ticketCost / milesForSpentRub;

        System.out.println("Ваши мили " + bonusMiles);
    }
}