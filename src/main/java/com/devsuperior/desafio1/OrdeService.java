package com.devsuperior.desafio1;

import org.springframework.stereotype.Service;

@Service
public class OrdeService {
	
	ShippingService shipping = new ShippingService();
	
	public Double total(Order order) {
		double aux1;
		aux1 = order.getDiscount() / 100 * order.getBasic();
		
		return aux1 = order.getBasic() - aux1 + shipping.shipment(order); 
		
	}

}
