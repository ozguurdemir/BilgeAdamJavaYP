public abstract class Product
    {
        private String id;
        private String description;
        private int price;

        public int buyProduct(Product p, Customer c)
            {
                if (c.getMoney()>p.price)
                    {
                        c.setMoney(c.getMoney()-p.price);
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
