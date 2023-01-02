public class ProductManager {

    public static class ProductValidator {
        public static boolean isValid(Product product){
            if(product.price > 0 && !product.name.isEmpty()){
                return true;
            }else {
                return false;
            }
        }

    }


    public void add(Product product){

        if (ProductValidator.isValid(product))
            System.out.println("Added");
        else
            System.out.println("Not valid");

    }
}
