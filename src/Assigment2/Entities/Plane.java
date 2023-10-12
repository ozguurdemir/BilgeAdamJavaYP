package Assigment2.Entities;

public class Plane extends Vehicle
    {
        private String flightCode;
        private String destination;
        private boolean isBusiness;

        @Override
        public void serveFood()
            {
                if (isBusiness)
                    {
                        super.serveFood();
                    }
                else
                    {
                        System.err.println("yemek verilmedi");
                    }

            }

        public Plane(int id, int capacity, int ticketPrice, String flightCode, String destination, boolean isBusiness)
            {
                super(id, capacity, ticketPrice);
                this.flightCode = flightCode;
                this.destination = destination;
                this.isBusiness = isBusiness;
            }

        public String getFlightCode()
            {
                return flightCode;
            }

        public void setFlightCode(String flightCode)
            {
                this.flightCode = flightCode;
            }

        public String getDestination()
            {
                return destination;
            }

        public void setDestination(String destination)
            {
                this.destination = destination;
            }
    }
