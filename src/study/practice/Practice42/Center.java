package study.practice.Practice42;

import java.util.ArrayList;

public class Center {
	Room[]roomar;
	ArrayList<Employee>employeeList;
	Center(){
		roomar = new Room[3];
		roomar[0] = new Room("강의실","7층");
		roomar[1] = new Room("휴게실","8층");
		roomar[2] = new Room("사무실","7층");
		employeeList = new ArrayList<Employee>();
	}
}
