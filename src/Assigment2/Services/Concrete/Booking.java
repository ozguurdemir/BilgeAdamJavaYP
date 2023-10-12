package Assigment2.Services.Concrete;

import Assigment2.Entities.Customer1;
import Assigment2.Entities.Vehicle;
import Assigment2.Services.Abstract.Ticket;

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
