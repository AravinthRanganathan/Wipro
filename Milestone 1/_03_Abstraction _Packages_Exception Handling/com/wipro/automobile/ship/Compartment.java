package com.wipro.automobile.ship;

public abstract class Compartment {
	abstract int shipcompartment1(int height);
	abstract int shipcompartment2(int width);
	abstract int shipcompartment3(int breath);
}
class ShipCompartment extends Compartment{

	@Override
	int shipcompartment1(int height) {
		return this.shipcompartment1(height);
	}

	@Override
	int shipcompartment2(int width) {
		
		return this.shipcompartment2(width);
	}

	@Override
	int shipcompartment3(int breath) {
		
		return this.shipcompartment3(breath);
	}
	public static void main(String[] args) {
		ShipCompartment obj=new ShipCompartment();
		obj.shipcompartment1(56);
		obj.shipcompartment2(89);
		obj.shipcompartment3(23);
	}
}