package Assigment2;

public class Coach extends Vehicle
    {
        private boolean isLongDistance;

        @Override
        public void serveFood()
            {
                if (isLongDistance)
                    {
                        System.err.println("yemek verildi");
                    }
                else
                    {
                        System.err.println("yemek verilmedi");
                    }
            }

        public Coach(int id, int capacity, int ticketPrice, boolean isLongDistance)
            {
                super(id, capacity, ticketPrice);
                this.isLongDistance = isLongDistance;
            }
    }
