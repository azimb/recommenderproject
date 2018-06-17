public class Address {

	private int houseOrApartment;
	public int getHouseOrApartment(){ return this.houseOrApartment; }
	
	private String street;
	public String getStreet(){ return this.street; }
	
	private String city;
	public String getCity(){ return this.city; }
	
	private String province;
	public String getProvince(){ return this.province; }
	
	private String country;
	public String getCountry(){ return this.country; }
	
	private int zip;
	public int getZip(){ return this.zip; }
	
	public Address( int houseOrApartment, String street, String city, String province, String country, int zip ){
		this.houseOrApartment = houseOrApartment;
		this.street = street;
		this.city = city;
		this.province = province;
		this.country = country;
		this.zip = zip;
	}

}
