package Reto02;

public class Stock {
    protected static int stock = 0;

    public static void addArticles(int articles) {
        stock += articles;
    }

    public static void removeArticles(int articles) {
        stock--;
    }

    public static String getStock() {
        return "Stock disponible: " + stock;
    }
}
