package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private List<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addProduct(Product product, Integer quantity) {
		if (quantity == 0)
		{
		throw IllegalArgumentException();	
		}
		
		for (int i = 0; i < quantity; i++) {
			products.add(product);
		}
	}

	public BigDecimal getNetValue() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product : products) {
			sum = sum.add(product.getPrice());
		}
		return sum;
	}

	public BigDecimal getTax() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product : products) {
			sum = sum.add(product.getTaxPercent().multiply(product.getPrice()));
		}
		return sum;
	}

	public BigDecimal getGrossValue() {
		return getTax().add(getNetValue());
	}
}
