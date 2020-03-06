package com.hussain.exception;
public class BuildingCost{
	String material_standard;
	float area;
	boolean is_automated_home;
	BuildingCost(String material_standard,float area,boolean is_automated_home){
		this.material_standard =material_standard;
		this.area=area;
		this.is_automated_home=is_automated_home;
	}
	public int getConstructionCost() {
		if(material_standard=="standard") {
			return (int)(1200*area);
		}else if(material_standard=="above standard") {
			return (int)(1500*area);
		}else if(material_standard=="high standard") {
			if(is_automated_home==true) {
				return (int)(2500*area);
			}
			return (int)(1800*area);
		}
		return 0;
	}
	
}