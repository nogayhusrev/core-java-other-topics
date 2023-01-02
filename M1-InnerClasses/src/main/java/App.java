public class App {

    public static void main(String[] args) {


        ProductManager productManager = new ProductManager();
        Product product = new Product(12,"Added",1231241.00);

        productManager.add(product);

        System.out.println(ProductManager.ProductValidator.isValid(product));

        DataBaseHelper.Crud.Delete();

    }
}
