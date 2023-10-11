package Assigment2;

public class Booking
    {
        Ticket _ticket;

        public Booking(Ticket _ticket)
            {
                this._ticket = _ticket;
            }
        public void book(Customer1 customer, Vehicle vehicle){
            if (customer.money>vehicle.getTicketPrice()){
                _ticket.sellTicket();
            }
            else {
                System.err.println("yetersiz bakiye");
            }
        }

    }
