import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Book Code: ");
        String code = keyboard.nextLine();

        ProductService psrv = new ProductService();
        psrv.displayAll(code);

    }
}
