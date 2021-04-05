import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import by.gsu.pms.CommodityPurchase;
import by.gsu.pms.PurchasesFactory;


public class Runner {
    public static void main(String[] args) throws IOException {
        String fileName = "java/practice2/task1/src/in.txt";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        scanner.useDelimiter(System.getProperty("line.separator"));
        PurchasesFactory purchasesFactory = new PurchasesFactory();
        CommodityPurchase[] purchasesArray = new CommodityPurchase[6];
        float maxCost = 0;
        float totalCost = 0;
        boolean allPurchaseEqual = true;
        for(int i = 0; scanner.hasNext() && i < purchasesArray.length; i++){
            CommodityPurchase purchase = purchasesFactory.getClassFromFactory(scanner);
            purchasesArray[i] = purchase;
            System.out.println(purchase.toString());
            maxCost = Math.max(purchase.getCost(), maxCost);
            totalCost += purchase.getCost();
            if (i > 0 && Boolean.FALSE.equals(purchase.equals(purchasesArray[i - 1]))) {
                allPurchaseEqual = false;
            }
        }
        System.out.println("Max cost - " + maxCost);
        System.out.println("Total cost - " + totalCost);
        System.out.println("All purchases are equal - " + allPurchaseEqual);
        scanner.close();

    }
}
