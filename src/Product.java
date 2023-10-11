public abstract class Product
    {
        private String id;
        private String description;
        private int price;

        public void setPrice(int price)
            {
                this.price = price;
            }

        public int buyProduct(Customer c)
            {
                if (c.getMoney()>price)
                    {
                        c.setMoney(c.getMoney()-price);
                        System.out.println("Ürün satıldı");
                    }
                else
                    {
                        System.out.println("Bakiye yetersiz");
                    }
                return c.getMoney();
            }

        public Product(String id, String description, int price)
            {
                this.id = id;
                this.description = description;
                this.price = price;
            }

        public String getId()
            {
                return "xxx";
            }

        public String getDescription()
            {
                return description;
            }

        public int getPrice()
            {
                return price;
            }


    }
