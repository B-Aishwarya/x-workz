package com.xworkz.carshowroom;
import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;
/**
 * 
 * @author Aishwarya B
 *
 */
public class ShowRoomTester {
	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom();
	    carShowRoom.addManager("Aishwarya", 8147358167l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		
		 
		ManagerDTO dto=new ManagerDTO("anusha", 98);
		carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		carShowRoom.updateManager(9807654567l);
		carShowRoom.displayManager();
	}

}
