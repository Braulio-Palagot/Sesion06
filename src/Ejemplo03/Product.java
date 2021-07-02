package Ejemplo03;

public class Product {
    public static int stock = 20;

    public static void removeArticle() {
        stock--;
        System.out.println("Articulo eliminado.\nNuevo Stock: "
                + stock);
    }
}
