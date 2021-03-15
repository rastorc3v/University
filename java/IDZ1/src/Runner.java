import by.gsu.pms.Icecream;

public class Runner {
    public static void main(String[] args) {
        Icecream[] icecreamList = {
            new Icecream(true, (float) 12.8),
            new Icecream(false, (float) 16.1),
            new Icecream(true, (float) 14.3),
            new Icecream(false, (float) 18.5),
            new Icecream(true, (float) 12.7),
            new Icecream(true, (float) 9.1),
            null,
            new Icecream(true, (float) 8.1),
            new Icecream(true, (float) 4.7),
            new Icecream(true, (float) 19),
        };

        for (int i = 0; i < icecreamList.length; i++) {
            if (icecreamList[i] != null) {
                System.out.println(icecreamList[i]);
            } else {
                System.out.println("Empty icecream");
            }
        }

        int withChocolateCount = 0;
        for (int i = 0; i < icecreamList.length; i++) {
            if (icecreamList[i] != null && icecreamList[i].isChocolate()) {
                withChocolateCount++;
            }
        }
        System.out.println("Amount of chocolate icecream - " + withChocolateCount);

        float averageFatPercentage = 0;
        int validIcecreamsAmount = 0;
        for (int i = 0; i < icecreamList.length; i++) {
            if (icecreamList[i] != null) {
                averageFatPercentage += icecreamList[i].getFatPercentage();
                validIcecreamsAmount++;
            }
        }
        System.out.println("Average fat percentage - " + averageFatPercentage / validIcecreamsAmount);
    }
}
