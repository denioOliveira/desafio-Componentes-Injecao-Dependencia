package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrdeService {
	
	private ShippingService shipping;
	
	public OrdeService(ShippingService shipping) {
		this.shipping = shipping;
	}


	public Double total(Order order) {
		double aux1;
		aux1 = order.getDiscount() / 100 * order.getBasic();
		
		return aux1 = order.getBasic() - aux1 + shipping.shipment(order); 
		
	}

}
