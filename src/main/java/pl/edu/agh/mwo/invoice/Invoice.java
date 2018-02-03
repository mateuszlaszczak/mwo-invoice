package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Map;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Map<Product, Integer> products;

	public void addProduct(Product product) {
		products.put(product, 0);
	}

	public void addProduct(Product product, Integer quantity) {
		products.put(product, quantity);
	}

	public BigDecimal getNetValue() {
		return null;
	}

	public BigDecimal getTax() {
		return null;
	}

	public BigDecimal getTotal() {
		return null;
	}
}
