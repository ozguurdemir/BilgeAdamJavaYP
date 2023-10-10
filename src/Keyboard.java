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

        public Keyboard(String id, String description, int price)
            {
                super(id, description, price);
            }
    }
