public class Main {

    public static void main(String[] args) {
        Product book = new Book(
                1,
                "Моя весна",
                200,
                "Александр Шубкин",
                100,
                1947

        ); //создаем объект класса Book и передаем все данные.
        book.setPrice(12_000);
        System.out.println(book.isTooExpensive());

        Product tShirt = new TShirt(
                2,
                "Спорт",
                800,
                "Зеленый"
        ) ;
        book.use();
        tShirt.use();

    }
}
