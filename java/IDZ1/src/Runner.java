import by.gsu.pms.Icecream;

public class Runner {
    public static void main(String[] args) {
        Icecream[] icecreamList = {
            new Icecream("Yammy", true, (float) 12.8),
            new Icecream("IceIce", false, (float) 16.1),
            new Icecream("Morty", true, (float) 14.3),
            new Icecream("Sinson", false, (float) 18.5),
            new Icecream("Loji", true, (float) 12.7),
            new Icecream("QoP", true, (float) 9.1),
            null,
            new Icecream("Dastar", true, (float) 8.1),
            new Icecream("Farnos", true, (float) 4.7),
            new Icecream("IceCity", true, (float) 19),
        };

        for (Icecream icecream : icecreamList) {
            if (icecream != null) {
                System.out.println(icecream);
            } else {
                System.out.println("Empty icecream");
            }
        }

        int withChocolateCount = 0;
        for (Icecream icecream : icecreamList) {
            if (icecream != null && icecream.isChocolate()) {
                withChocolateCount++;
            }
        }
        System.out.println("Amount of chocolate icecream - " + withChocolateCount);

        float averageFatPercentage = 0;
        int validIcecreamsAmount = 0;
        for (Icecream icecream : icecreamList) {
            if (icecream != null) {
                averageFatPercentage += icecream.getFatPercentage();
                validIcecreamsAmount++;
            }
        }
        if (validIcecreamsAmount != 0) {
            System.out.println("Average fat percentage - " + averageFatPercentage / validIcecreamsAmount);
        }
    }
}
