package com.xworkz.milkshop.dto;

public class MilkShopDTO {
	private Integer id;
	private String name;
	private String ownerName;
	private String type;
	private String ambassador;

	public MilkShopDTO() {
		System.out.println("DTO is created");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MilkShopDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", type=" + type
				+ ", ambassador=" + ambassador + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmbassador() {
		return ambassador;
	}

	public void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}

	public MilkShopDTO(Integer id, String name, String ownerName, String type, String ambassador) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.ambassador = ambassador;
	}



	
}