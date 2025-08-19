public non-sealed class Salesman extends Employee {
    private int soldAmount;

    public int getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(int soldAmount) {
        this.soldAmount = soldAmount;
    }
    public String realizeSale(int soldAmount){
        return "Sale realized";
    }
    public boolean isAdmin() {
        return false;
    }
}
