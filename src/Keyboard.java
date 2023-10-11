public class Keyboard extends Product
    {
        private String type;
        private final int DISCOUNT;

        @Override
        public int buyProduct(Product p, Customer c)
            {
                if (p.getDescription()=="Corsair")
                    {
                        return super.buyProduct(p, c) + DISCOUNT;
                    }
                else
                    {
                        return super.buyProduct(p, c);
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
