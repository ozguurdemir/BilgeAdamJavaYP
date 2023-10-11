public class Main
    {
        public static void main(String[] args)
            {

                Customer customer1 = new Customer("1","Özgür",2400);
                Book book = new Book("1","Roman",60);
                book.setIsbn("A2S45DW78");
                book.setPageNumber(390);
                Keyboard keyboard = new Keyboard("2", "Corsair", 1000, 400);
                keyboard.setType("Mechanical");
                Mouse mouse = new Mouse("3","Logitech", 900);
                mouse.setSensor("Optic");
                int result = keyboard.buyProduct(customer1);
                //result = mouse.buyProduct(customer1);
                //result = keyboard.buyProduct(customer1);

                //customer1.setMoney(result);
                System.err.println(customer1.getMoney());
                System.err.println(customer1.getId());
            }
    }