package com.designpatterns.Factory;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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

		List mylist = new ArrayList();
		mylist.add("hello world!");
		mylist.add(34);
		String mylistItemString = (String) mylist.get(0);		
		//will result in a runtime error... integer cannot be cast to string
		//String mylistItemString = (String) mylist.get(1);
		System.out.println(mylistItemString);

		List<String> mylistGen = new ArrayList<String>();
		mylistGen.add("hello world generic!");		
		//will result in a compile time error
		//mylistGen.add(12);		
		System.out.println(mylistGen.get(0));

	}

}
