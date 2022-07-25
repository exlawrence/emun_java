package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1025, new Date(), OrderStatus.DEVILERED);
		
		System.out.println(order);
		
	}

}
