package Assigment2;

public class Ship extends Vehicle implements Ticket
    {
        private String destination;
        public Ship(int id, int capacity, int ticketPrice, String destination)
            {
                super(id, capacity, ticketPrice);
                this.destination = destination;
            }


        @Override
        public void sellTicket()
            {
                System.err.println("bilet satıldı");
            }
    }
