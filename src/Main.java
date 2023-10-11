import Assigment2.*;

public class Main
    {
        public static void main(String[] args)
            {
//                Customer customer1 = new Customer("1","Özgür",2400);
//                Book book = new Book("1","Roman",60);
//                book.setIsbn("A2S45DW78");
//                book.setPageNumber(390);
//                Keyboard keyboard = new Keyboard("2", "Corsair", 1000, 400);
//                keyboard.setType("Mechanical");
//                Mouse mouse = new Mouse("3","Logitech", 900);
//                mouse.setSensor("Optic");
//                int result = keyboard.buyProduct(customer1);
//                //result = mouse.buyProduct(customer1);
//                //result = keyboard.buyProduct(customer1);
//                //visitor design pattern
//                //customer1.setMoney(result);
//                System.err.println(customer1.getMoney());
//                System.err.println(customer1.getId());

                Customer1 customer = new Customer1(5000,"Özgür");
                Plane plane = new Plane(1,300,1600,"TK166","İstanbul",true);
                Coach coach = new Coach(2,47,350,false);
                Ship ship = new Ship(3,1300,2000,"Sydney");
                Booking booking = new Booking(new SkyScanner());
                booking.book(customer,plane);
                plane.serveFood();
            }
    }