import by.gsu.pms.Icecream;
import java.util.ArrayList;


public class Runner {
    public static void main(String[] args) {
        ArrayList<Icecream> icecreamList = new ArrayList<>();
        icecreamList.add(new Icecream("Yammy", true, (float) 12.8));
        icecreamList.add(new Icecream("IceIce", false, (float) 16.1));
        icecreamList.add(new Icecream("Morty", true, (float) 14.3));
        icecreamList.add(new Icecream("Sinson", false, (float) 18.5));
        icecreamList.add(new Icecream("Loji", true, (float) 12.7));
        icecreamList.add(new Icecream("QoP", true, (float) 9.1));
        icecreamList.add(null);
        icecreamList.add(new Icecream("Dastar", true, (float) 8.1));
        icecreamList.add(new Icecream("Farnos", true, (float) 4.7));
        icecreamList.add(new Icecream("IceCity", true, (float) 19));

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
