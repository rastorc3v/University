import by.gsu.pms.BusinessTrip;
import java.util.Objects;
import by.gsu.pms.MoneyConverter;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] trips = {
                new BusinessTrip(200, "Vlad", 1000, 5),
                new BusinessTrip(300, "John", 1300, 3),
                null,
                new BusinessTrip(200, "Dwight", 1200, 5),
                new BusinessTrip(500, "Jim", 900, 4),
                new BusinessTrip(500, "Pam", 1100, 4),
                new BusinessTrip(100)
        };

        for (BusinessTrip trip : trips) {
            if (trip != null) {
                trip.show();
                System.out.println("-----------------");
            } else {
                System.out.println("This is null item!\n-----------------");
            }
        }

        trips[trips.length - 1].setTransport(2000);
        int duration = trips[0].getDays() + trips[1].getDays();

        System.out.println("Duration = " + duration);

        for (BusinessTrip trip : trips) {
            if (trip != null) {
                System.out.println(trip.toString());
                System.out.println("-----------------");
            } else {
                System.out.println("This is null item!\n-----------------");
            }
        }

        int totalSum = 0;

        for (BusinessTrip trip : trips) {
            if (trip != null) {
                totalSum += trip.getTotal();
            }
        }

        // use case of money converter class
        MoneyConverter moneyConverter = new MoneyConverter();
        System.out.println("Total sum = " + moneyConverter.int2string(totalSum));

        int[] totalsList = new int[trips.length];

        for (int i = 0; i < trips.length; i++) {
            if (trips[i] != null) {
                totalsList[i] = Objects.requireNonNull(trips[i]).getTotal();
            }
        }

        System.out.println(totalsList[2]);

        int maxTotal = 0;
        String accountNameWithMaxExpenses = "";

        for (int i = 0; i < totalsList.length; i++) {
            if (totalsList[i] > maxTotal) {
                maxTotal = totalsList[i];
                accountNameWithMaxExpenses = Objects.requireNonNull(trips[i]).getAccount();
            }
        }

        System.out.println(accountNameWithMaxExpenses);
    }
}