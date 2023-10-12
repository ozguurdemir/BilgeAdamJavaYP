package Assigment2.Services.Concrete;

import Assigment2.Services.Abstract.Ticket;

public class Obilet implements Ticket
    {

        @Override
        public void sellTicket()
            {
                System.err.println("Obilet ile bilet satıldı");
            }
    }
