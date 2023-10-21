package newProducts;

public class Main {
	public static void main (String[] args) {
		
		Product product1 = new Product("Ball", 10, 0);
		Product product2 = new Product("Car", 66, 1);
		Product product3 = new Product("Orange", 7, 2);
		Product product4 = new Product("Pean", 90, 3);
		
		Order order = new Order();
		
		order.addProduct(product1);
		order.addProduct(product2);
		order.addProduct(product3);
		order.addProduct(product4);
		
		System.out.println(order);
		
		try {
			Product product5 = order.searchProductById(2);
			System.out.println(product5);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		System.out.println(order.removeProductById(3));
		
		System.out.println(order);
		
	}

}
