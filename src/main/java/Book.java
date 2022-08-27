public class Book extends Product {
    private String author;
    private int pages;
    private int publishedYear;

    public Book(int id, String name, int price, String author,int pages, int publishedYear) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }


    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getPublishedYear() {
        return publishedYear;
    }


    @Override
    public boolean isTooExpensive() {// метод это слишком дорого
        if (price > 10_000) {//если цена больше 10 т,то
            return true;//истина,это очень дорого
        } else {
            return false; // ложь,не дорого
        }

    }
    @Override
    public void use() {
       System.out.println("Читаем книгу " + name );
    }

}
