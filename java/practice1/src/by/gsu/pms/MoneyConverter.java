package by.gsu.pms;

public class MoneyConverter {
    // how much kopeck in rubble (example: 100)
    int divider = 100;
    String bigDenominationName = "руб.";
    String smallDenominationName = "коп.";

    public MoneyConverter() { }

    public MoneyConverter(int divider, String bigDenominationName, String smallDenominationName) {
        this.divider = divider;
        this.bigDenominationName = bigDenominationName;
        this.smallDenominationName = smallDenominationName;
    }

    public String int2string(int moneyEquivalent) {
        int bigDenomination = moneyEquivalent / this.divider;
        int smallDenomination = moneyEquivalent % this.divider;
        return resultPrettier(bigDenomination, smallDenomination);
    }

    public String float2string(float moneyEquivalent) {
        String[] bigAndSmallDenomination = Float.toString(moneyEquivalent).split("\\.");
        int bigDenomination = Integer.parseInt(bigAndSmallDenomination[0]);
        if (bigAndSmallDenomination[1].length() > 2) {
            bigAndSmallDenomination[1] = bigAndSmallDenomination[1].substring(0, 2);
        }
        if (bigAndSmallDenomination[1].length() == 1) {
            bigAndSmallDenomination[1] += "0";
        }
        int smallDenomination = Integer.parseInt(bigAndSmallDenomination[1]);
        return this.resultPrettier(bigDenomination, smallDenomination);
    }

    private String resultPrettier(int bigDenomination, int smallDenomination) {
        String resultString = "";
        if (bigDenomination != 0) {
            resultString += bigDenomination + bigDenominationName;
        }
        if (smallDenomination != 0) {
            resultString += smallDenomination + smallDenominationName;
        }
        return resultString;
    }
}
