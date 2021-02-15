package by.gsu.pms;

public class BusinessTrip {
    public final int RATE;
    public String account;
    public int transport;
    public int days;
    public BusinessTrip(int rate) {
        super();
        RATE = rate;
    }
    public BusinessTrip(int RATE, String account, int transport, int days) {
        super();
        this.RATE = RATE;
        this.account = account;
        this.transport = transport;
        this.days = days;
    }
    public String getAccount() {
        return this.account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getRATE() {
        return RATE;
    }

    public int getTotal () {
        return RATE * days + transport;
    }
    public void show() {
        System.out.println("rate = " + RATE +
                "\naccount = " + account +
                "\ntransport = " + transport +
                "\ndays = " + days +
                "\ntotal = " + getTotal());
    }
    public String toString() {
        return this.RATE + ";" + this.account + ';' + this.transport + ';' + this.days + ';' + getTotal();
    }
}
