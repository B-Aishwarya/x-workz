package com.xworkz.typeCasting.sports.awards;

public class Ceremony {
	private String name;
	private String[] foods;
	
	
	public Ceremony(String name) {
		this.name=name;
		System.out.println("init Ceremony");
	}
	
	public void distributeAwards(String personName,String awardName) {
		System.out.println("arg1 "+personName);
		System.out.println("arg2 "+awardName);
		
	}
	
	public void displayFoods()
	{
		System.out.println("init displayFoods");
		System.out.println(this.foods);
		if(this.foods!=null) {
			for(int i=0;i<this.foods.length;i++)
			{
				String food=this.foods[i];
				System.out.println(food);
			}
			
		}
	}
	public void displayCeremonyNameAndFood() {
		System.out.println(this.name);
		this.displayFoods();
	}
	public void accessParentMembers()
	{
		int hCode=super.hashCode();
		System.out.println(hCode);
		String string=super.toString();
		System.out.println(string);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getFoods() {
		return foods;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}
	
	

}
