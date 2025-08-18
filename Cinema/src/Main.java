import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printTicketMovie(new HalfTicket());
        printTicketMovie(new TicketFamily());
    }
    public static void printTicketMovie(TicketMovie ticketMovie) {
        switch (ticketMovie){
            case HalfTicket halfTicket -> {
                HalfTicket hp = new HalfTicket(150, "Los Bacanos", false);
                System.out.println(hp.getTotalValue());
            }
            case TicketFamily ticketFamily -> {
                TicketFamily tf = new TicketFamily(150, "Los Bacanos", false, 5);
                System.out.println(tf.getTotalValue());
            }
        }
    }
}