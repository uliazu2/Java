public final class HalfTicket extends TicketMovie{
    public HalfTicket(float value, String movie, boolean subtitled) {
        super(value, movie, subtitled);
    }

    public HalfTicket() {
    }

    @Override
    public String getTotalValue() {
        float value = getValue();
        value -= (value/50);
        return "Valor da meia entrada: " + value;
    }
}
