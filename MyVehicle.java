package sectionBfees;

import java.awt.*;
import javax.swing.*;

class Vehicle{
	
	String color;
	int cc;
	int gears;
	

Vehicle(String color, int cc, int gears){
	this.color = color;
	this.cc = cc;
	this.gears = gears;
}

void drived() {
	System.out.println("Vehicle is Drived");
}
void pause() {
	System.out.println("Vehicle is paused");
}
 void resume() {
	System.out.println("Vehicle is resumed");
}

}


class EBicycle extends Vehicle{
	 
	EBicycle(String color, int cc, int gears){
		super(color, cc, gears);
	}
	
	void drived() {
		System.out.println("Ebicycle is drived");
	}
	void pause() {
		System.out.println("EBicycle is pausecd");
	}
	void resume() {
		System.out.println("EBicycle is resumed");
	}
	
}

 class myEBicycle extends Vehicle{
	 
	myEBicycle(String color, int cc, int gears){
		super(color, cc, gears);
	}
	
	public void drived() {
		System.out.println("myEBicycle is Drived");
	}
	void pause() {
		System.out.println("myEBicycle is pausecd");
	}
	void resume() {
		System.out.println("myEBicycle is resumed");
	}
	
}  

public class MyVehicle {
	public static void main (String args[]) {
		Vehicle car = new Vehicle("White", 800, 4 );
		car.drived();
		car.pause();
		car.resume();
		
		EBicycle myEBick = new EBicycle("red",100, 5);
		myEBick.drived();
		myEBick.pause();
		myEBick.resume();
		
		myEBicycle honkCar = new myEBicycle("blue", 250, 2);
		honkCar.drived();
		honkCar.pause();
		honkCar.resume();
	}

}
