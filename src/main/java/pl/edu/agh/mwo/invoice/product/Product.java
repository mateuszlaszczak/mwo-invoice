package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
		this.name = name;
		this.price = price;
		this.taxPercent = tax;
		
		if (name == null || name == ""){
			throw new IllegalArgumentException("product name cannot be null nor empty!"); 
			}
		if (this.price == null|| price.compareTo(BigDecimal.ZERO)<0) 
			{
			throw new IllegalArgumentException("product price cannot be null nor less than 0!"); 
			}
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getTaxPercent() {
		return taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		return price.add(price.multiply(taxPercent));
	}
}
