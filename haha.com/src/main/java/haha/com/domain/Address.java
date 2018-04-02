package haha.com.domain;

public class Address {
	
	private int id;
	private AddressCategory addressCategory;
	private String street;
	private String city;
	private String country;
	private String state;
	private String zipCode;
	
	public Address(int id, AddressCategory addressCategory, String street, String city, String country, String state,
			String zipCode) {
		super();
		this.id = id;
		this.addressCategory = addressCategory;
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AddressCategory getAddressCategory() {
		return addressCategory;
	}

	public void setAddressCategory(AddressCategory addressCategory) {
		this.addressCategory = addressCategory;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	

}
