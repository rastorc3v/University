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

        // search for all null elements and delete before main algorithm starting
        while (icecreamList.contains(null)) {
            icecreamList.remove(null);
        }

        for (Icecream icecream : icecreamList) {
            System.out.println(icecream);
        }

        // find amount of non-chocolate icecream
        int withChocolateCount = 0;
        for (Icecream icecream : icecreamList) {
            if (icecream.isChocolate()) {
                withChocolateCount++;
            }
        }
        System.out.println("Amount of chocolate icecream - " + withChocolateCount);

        // calculate average fat percentage
        float averageFatPercentage = 0;
        int validIcecreamsAmount = 0;
        for (Icecream icecream : icecreamList) {
            averageFatPercentage += icecream.getFatPercentage();
            validIcecreamsAmount++;
        }
        if (validIcecreamsAmount != 0) {
            System.out.println("Average fat percentage - " + averageFatPercentage / validIcecreamsAmount);
        }

        // sort by fat percentage
        for(int i = icecreamList.size() - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(icecreamList.get(j).getFatPercentage() > icecreamList.get(j + 1).getFatPercentage()){
                    Icecream tempIcecreamObject = icecreamList.get(j);
                    icecreamList.set(j, icecreamList.get(j + 1));
                    icecreamList.set(j + 1, tempIcecreamObject);
                }
            }
        }
        for (Icecream icecream: icecreamList) {
            System.out.println(icecream);
        }
    }
}
