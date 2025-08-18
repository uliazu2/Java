public final class TicketFamily extends TicketMovie {
    private int familyMembers;

    public TicketFamily() {
    }

    public TicketFamily(float value, String movie, boolean subtitled, int familyMembers) {
        super(value, movie, subtitled);
        this.familyMembers = familyMembers;
    }

    @Override
    public String getTotalValue() {
        float value;
        if(familyMembers > 3) {
            value = getValue() * familyMembers;
            value -= value * 0.05f;
            return ("O valor do ingresso família vai ser: " + value);
        }
        value = getValue() * familyMembers;
        return "Valor ingresso familia:" + value;
    }
}
