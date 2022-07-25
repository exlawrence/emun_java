package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1025, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println(os1);
		//Conversão de String para enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os2);
		
		
	}

}
