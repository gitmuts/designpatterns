package com.designpatterns.Factory;

public class Main {

	public static void main(String[] args) {		
		VehicleFactory vehicleFactory = new VehicleFactory<>();
		Saloon saloon = new Saloon();
		HatchBack hatchBack = new HatchBack();		
		System.out.println("==================");
		vehicleFactory.carDraw(saloon);
		vehicleFactory.carDraw(hatchBack);
		vehicleFactory.carDraw(new Suv());
		System.out.println("==================");

		VehicleFactory vehicleFactory2 = new VehicleFactory<>();
		System.out.println("=========carDraw2=========");
		vehicleFactory2.set(new Saloon());
		vehicleFactory2.carDraw2();
		vehicleFactory2.set(new HatchBack());
		vehicleFactory2.carDraw2();
		System.out.println("=========carDraw2=========");

	}

}
