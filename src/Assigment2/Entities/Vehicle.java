package Assigment2.Entities;

public abstract class Vehicle
    {
        private int id;
        private int capacity;
        private int ticketPrice;

        public Vehicle(int id, int capacity, int ticketPrice)
            {
                this.id = id;
                this.capacity = capacity;
                this.ticketPrice = ticketPrice;
            }
        public void serveFood()
            {
                System.err.println("Yemek verildi");
            }

        public int getTicketPrice()
            {
                return ticketPrice;
            }

        public void setTicketPrice(int ticketPrice)
            {
                this.ticketPrice = ticketPrice;
            }

        public int getId()
            {
                return id;
            }

        public void setId(int id)
            {
                this.id = id;
            }

        public int getCapacity()
            {
                return capacity;
            }

        public void setCapacity(int capacity)
            {
                this.capacity = capacity;
            }
    }
