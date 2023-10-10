public class Mouse extends Product
    {
        private String sensor;

        public String getSensor()
            {
                return sensor;
            }

        public void setSensor(String sensor)
            {
                this.sensor = sensor;
            }

        public Mouse(String id, String description, int price)
            {
                super(id, description, price);
            }
    }
