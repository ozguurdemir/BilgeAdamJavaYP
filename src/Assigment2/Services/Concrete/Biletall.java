package Assigment2.Services.Concrete;

import Assigment2.Services.Abstract.Ticket;

public class Biletall implements Ticket
    {
        @Override
        public void sellTicket()
            {
                System.err.println("Biletall ile bilet satıldı");
            }
    }
