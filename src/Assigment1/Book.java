package Assigment1;

public class Book extends Product
    {
        private int pageNumber;
        private String isbn;

        public Book(String id, String description, int price)
            {
                super(id, description, price);
            }

        public int getPageNumber()
            {
                return pageNumber;
            }

        public void setPageNumber(int pageNumber)
            {
                this.pageNumber = pageNumber;
            }

        public String getIsbn()
            {
                return isbn;
            }

        public void setIsbn(String isbn)
            {
                this.isbn = isbn;
            }
    }
