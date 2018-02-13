package com.psl.question2;

public class TechnicalManager {

	int NoOfEmployeeReporting;
	String WorkPlace;
	int promotionsTillDate;
	int NoOfProjects;

	public TechnicalManager() {
		// TODO Auto-generated constructor stub
		NoOfEmployeeReporting = 5;
		WorkPlace = null;
		promotionsTillDate = 2;
		NoOfProjects = 2;
	}

	public TechnicalManager(int NoOfEmployeeReporting, String WorkPlace,
			int promotionsTillDate, int NoOfProjects) throws MyCustomException {
		this.NoOfEmployeeReporting = NoOfEmployeeReporting;
		this.WorkPlace = WorkPlace;
		
		
		if(promotionsTillDate==0 ||NoOfProjects==0) 
           throw new MyCustomException();
			
		else
			this.promotionsTillDate = promotionsTillDate;
		this.NoOfProjects = NoOfProjects;
		
		
	}

	public int getNoOfEmployeeReporting() {
		return NoOfEmployeeReporting;
	}

	public void setNoOfEmployeeReporting(int noOfEmployeeReporting) {
		NoOfEmployeeReporting = noOfEmployeeReporting;
	}

	public String getWorkPlace() {
		return WorkPlace;
	}

	public void setWorkPlace(String workPlace) {
		WorkPlace = workPlace;
	}

	public int getPromotionsTillDate() {
		return promotionsTillDate;
	}

	public void setPromotionsTillDate(int promotionsTillDate) {
		this.promotionsTillDate = promotionsTillDate;
	}

	public int getNoOfProjects() {
		return NoOfProjects;
	}

	public void setNoOfProjects(int noOfProjects) {
		NoOfProjects = noOfProjects;
	}

}
