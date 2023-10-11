public class Main
    {
        public static void main(String[] args)
            {
                System.out.println("Hello world!");
                Customer customer1 = new Customer("1","Özgür",1000);
                Book book = new Book("1","Roman",60);
                book.setIsbn("A2S45DW78");
                book.setPageNumber(390);
                Keyboard keyboard = new Keyboard("2", "Corsair", 1200, 100);
                keyboard.setType("Mechanical");
                Mouse mouse = new Mouse("3","Logitech", 900);
                mouse.setSensor("Optic");
                int result = book.buyProduct(book, customer1);
                System.err.println(result);
                System.err.println(customer1.getId());
            }
    }