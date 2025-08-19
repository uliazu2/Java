public non-sealed class Atendente extends Employee {
    private float boxValue;

    public float getBoxValue() {
        return boxValue;
    }

    public void setBoxValue(float boxValue) {
        this.boxValue = boxValue;
    }
    public String receivePayment(float boxValue){
        return "";
    }
    public String closeBox(){
        return "";
    }

    public boolean isAdmin() {
        return false;
    }
}
