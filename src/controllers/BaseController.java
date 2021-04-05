package controllers;

import models.Room;

public class BaseController {
	private static boolean menu = true;
	private static int roomNo = 0;
	private static Room[] rooms = null;

	protected BaseController() {
		super();
	}

	protected static boolean isMenu() {
		return menu;
	}

	protected static void setMenu(boolean menu) {
		BaseController.menu = menu;
	}

	protected static int getRoomNo() {
		return roomNo;
	}

	protected static void setRoomNo(int roomNo) {
		BaseController.roomNo = roomNo;
	}

	protected static Room[] getRooms() {
		return rooms;
	}

	protected static void setRooms(Room[] rooms) {
		BaseController.rooms = rooms;
	}

	@Override
	public String toString() {
		return "BaseController [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
