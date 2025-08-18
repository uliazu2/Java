package domain;

public non-sealed class Salesman extends Employee {
    private double percentPerSold;
    private double soldAmount;

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public Salesman() {
    }

    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }
    public String getCode() {
        return "SL" + super.getCode();
    }
    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }

    @Override
    public double getFullSalary() {
        return salary += (this.percentPerSold + this.soldAmount)/100;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
