package study.practice.Practice41;

import java.util.ArrayList;

public class Kitchen {
	ArrayList<TrashBox>trashboxList;
	ArrayList<Cup>cupList;
	double area;
	String wallpaper;
	double height;
	Kitchen(double area,String wallpaper,double height){
		trashboxList = new ArrayList<TrashBox>();
		cupList = new ArrayList<Cup>();
		this.area=area;
		this.wallpaper=wallpaper;
		this.height=height;
	}
}
