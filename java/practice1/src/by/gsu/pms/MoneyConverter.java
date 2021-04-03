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
        return bigDenomination + bigDenominationName + smallDenomination + smallDenominationName;
    }

    public String float2string(float moneyEquivalent) {
        return "";
    }
}
