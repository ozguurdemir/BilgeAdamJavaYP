package Assigment1;

public class Keyboard extends Product
    {
        private String type;
        private final int DISCOUNT;

        @Override
        public int buyProduct(Customer c)
            {
                if (this.getDescription().equalsIgnoreCase("Corsair"))
                    {
                        this.setPrice(this.getPrice()-DISCOUNT);
                        return super.buyProduct(c);
                    }
                else
                    {
                        return super.buyProduct(c);
                    }

            }

        public Keyboard(String id, String description, int price,int discount)
            {
                super(id, description, price);
                this.DISCOUNT=discount;
            }
        public String getType()
            {
                return type;
            }

        public void setType(String type)
            {
                this.type = type;
            }
    }
