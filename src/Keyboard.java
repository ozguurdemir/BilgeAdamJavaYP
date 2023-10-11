public class Keyboard extends Product
    {
        private String type;

        public String getType()
            {
                return type;
            }

        public void setType(String type)
            {
                this.type = type;
            }

        @Override
        public int buyProduct(Product p, Customer c)
            {
                if (p.getDescription()=="Corsair")
                    {
                        return super.buyProduct(p, c) + 20;
                    }
                else
                    {
                        return super.buyProduct(p, c);
                    }

            }

        public Keyboard(String id, String description, int price)
            {
                super(id, description, price);
            }
    }
