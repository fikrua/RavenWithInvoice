package com.company;

public class Invoice {
    private String fullName;
    private String stAddress ;
    private String city;
    private String stat;
    private int zipCod;
    private double pricesession;
    private double pricofqu;
    private int numberOfqu;
    private int numberSession;
    private double totalPrice;

    public Invoice() {
    }

    public Invoice(String fullName, String stAddress, String city, String stat, int zipCod) {
        this.fullName = fullName;
        this.stAddress = stAddress;
        this.city = city;
        this.stat = stat;
        this.zipCod = zipCod;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public int getZipCod() {
        return zipCod;
    }

    public void setZipCod(int zipCod) {
        this.zipCod = zipCod;
    }
    public double priceOfSession(int numberSession){
        this.numberSession = numberSession;
        this.pricesession = 100.00*numberSession;
        return  this.pricesession;


    }
    public double priceofQu(int numberOfqu){
        this.numberOfqu = numberOfqu;
        this.pricofqu = .35*numberOfqu;
        return this.pricofqu;
    }
    public double totalPirece(){
        this.totalPrice = pricesession + pricofqu;
        return this.totalPrice;

    }

    public void toStrings() {
        System.out.printf("Raven's Invoice\nTo:\n%s\n%s\n%s, %s %d\n\n",fullName,stAddress,city,stat,zipCod);

        System.out.printf("Items:\n%-10s%-15s%-10s%-10s\n","Quantity", "Description", "Price", "Total");
        System.out.printf("%-10s %-10s %-10s %-10s\n",numberSession,"Session","$100.00",pricesession);
        System.out.printf("%-10s%-15s%-10s$%-10.2f\n\n",numberOfqu,"Questions","$.35",pricofqu);
        System.out.println("Total due: $" + totalPrice );

    }
}
