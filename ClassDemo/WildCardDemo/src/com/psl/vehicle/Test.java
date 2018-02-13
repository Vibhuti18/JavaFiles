package com.psl.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Vehicle> vList = new ArrayList<Vehicle>();
		List<FourWheeler> fList = new ArrayList<FourWheeler>();
		List<TwoWheeler> tList = new ArrayList<TwoWheeler>();
		List<AudiQ7> aList = new ArrayList<AudiQ7>();
		List<Employee> eList = new ArrayList<Employee>();

		vList.add(new Vehicle());
		fList.add(new FourWheeler());
		tList.add(new TwoWheeler());
		aList.add(new AudiQ7());
		eList.add(new Employee());

		showVehicle(vList);
		showVehicle(fList);
		showVehicle(tList);
		showVehicle(aList);
		showVehicle(eList);
	}

	/*
	 * private static void showVehicle(List<? > vList) { //can accept all typ of
	 * objects // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * private static void showVehicle(List<? extends Vehicle > vList) { //can
	 * take obj of Vehicles and alll classes that are derived from vehicle //
	 * TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * private static void showVehicle(List<? super FourWheeler > vList) { //can
	 * take fourwheeler and the immediate supe i.e Vehicle // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	private static void showVehicle(List<?> vList) {
		// TODO Auto-generated method stub

	}

}
