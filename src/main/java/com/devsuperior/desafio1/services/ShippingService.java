package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double aux;
		if(order.getBasic() < 100 ) {
			aux = 20.0;
		}else if(order.getBasic() < 200) {
			aux = 12.0;
		}
		else {
			aux = 0.0;
		}
			
		return aux; 
	}

}
