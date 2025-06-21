import java.util.Arrays;
import java.util.*;
class Product {
        int productId;
        String productName, category;
        Product(int productId, String productName, String category){
            this.productId=productId;
            this.productName=productName;
            this.category=category;
        }
}
public class Search {
    public static void main(String args[]) {
        Product[] products = {
                new Product(2, "sunscreen", "makeup"),
                new Product(1, "Laptop", "electronic"),
                new Product(8, "watch", "accessories"),
                new Product(5, "book", "education"),
                new Product(10, "shoes", "footwear")
        };
        int id = 8;
        System.out.println("Linear search");
        linearSearch(products, id);
        Arrays.sort(products, (a, b) -> Integer.compare(a.productId, b.productId));
        System.out.println("Binary search");
        binarySearch(products, id);

    }

    public static void linearSearch(Product products[], int k) {
        int n = products.length;
        for (int i = 0; i < n; i++) {
            if (products[i].productId == k) {
                System.out.println("Product id "+k + " is found at location " + (i + 1));
                return;
            }
        }
        System.out.println("product id "+k + " not found in products array ");
    }

    public static void binarySearch(Product products[], int k) {
        int n = products.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == k) {
                System.out.println("product id "+k + " is found at location " + (mid + 1));
                return;
            } else if (products[mid].productId > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("product id "+k+"is not found in products array");
    }
}

