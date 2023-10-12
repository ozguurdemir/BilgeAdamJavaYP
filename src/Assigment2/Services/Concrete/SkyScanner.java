package Assigment2.Services.Concrete;

import Assigment2.Services.Abstract.Ticket;

public class SkyScanner implements Ticket
    {
        @Override
        public void sellTicket()
            {
                System.err.println("SkyScanner ile bilet satıldı");
            }
    }
