package com.xworkz.carshowroom;

import com.xworkz.carshowroom.showroom.CarShowRoom;

public class TempTester {

	public static void main(String[] args) {

		CarShowRoom room = new CarShowRoom("TOYOTA", "Whitefield");

		room.displayManager();

		room = new CarShowRoom("Adhvaith Hyndai", "MG");

		CarShowRoom room2 = new CarShowRoom("Bazaz motors", "Laxmeshwar");
		room = room2;
		CarShowRoom room3 = room;
		CarShowRoom room4 = room2;

	}

}
