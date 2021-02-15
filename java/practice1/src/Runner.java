import by.gsu.pms.BusinessTrip;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] trips = {
                new BusinessTrip(200, "Vlad", 1000, 5),
                new BusinessTrip(300, "Jhon", 1300, 3),
                null,
                new BusinessTrip(200, "Dwight", 1200, 5),
                new BusinessTrip(500, "Jim", 900, 4),
                new BusinessTrip(500, "Pam", 1100, 4),
                new BusinessTrip(100)
        };
        for (int i = 0; i < trips.length; i++) {
            if (trips[i] != null) {
                trips[i].show();
                System.out.println("-----------------");
            } else {
                System.out.println("This is null item!\n-----------------");
            }
        }
        trips[trips.length - 1].setTransport(2000);
        int duration = trips[0].getDays() + trips[1].getDays();
        System.out.println("Duration = " + duration);
        for (int i = 0; i < trips.length; i++) {
            if (trips[i] != null) {
                System.out.println(trips[i].toString());
                System.out.println("-----------------");
            } else {
                System.out.println("This is null item!\n-----------------");
            }
        }
        int totalSum = 0;
        for (int i = 0; i < trips.length; i++) {
            if (trips[i] != null) {
                totalSum += trips[i].getTotal();
            }
        }
        System.out.println("Total sum = " + totalSum);
        int[] totalsList = new int[trips.length];
        for (int i = 0; i < trips.length; i++) {
            if (trips[i] != null) {
                totalsList[i] = trips[i].getTotal();
            }
        }
        System.out.println(totalsList[2]);
        int maxTotal = 0;
        String accountNameWithMaxExpenses = "";
        for (int i = 0; i < totalsList.length; i++) {
            if (totalsList[i] > maxTotal) {
                maxTotal = totalsList[i];
                accountNameWithMaxExpenses = trips[i].getAccount();
            }
        }
        System.out.println(accountNameWithMaxExpenses);
    }
}