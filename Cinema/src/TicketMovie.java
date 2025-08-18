public sealed abstract class TicketMovie permits HalfTicket, TicketFamily {
    private float value;
    private String movie;
    private boolean subtitled;

    public TicketMovie(float value, String movie, boolean subtitled) {
        this.value = value;
        this.movie = movie;
        this.subtitled = subtitled;
    }

    public TicketMovie() {
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public boolean isSubtitled() {
        return subtitled;
    }

    public void setSubtitled(boolean subtitled) {
        this.subtitled = subtitled;
    }
    public abstract String getTotalValue();
}
