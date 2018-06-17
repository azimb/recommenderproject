public class UserProfile{

	private String name;
	private int uniqueId;
	private int mobile;
	private Address address;
	private String[] interests;
	//private projectHistory
	
	public String getName(){ return this.name; }
	public int getUniqueId(){ return this.uniqueId; }
	public int getMobile(){ return this.mobile; }
	
	public String[] getAddress(){
		String [] addressArray = new String[5];
		addressArray[0] = address.houseOrApt;
		addressArray[1] = addres.street;
		addressArray[2] = address.city;
		addressArray[3] = address.province;
		addressArray[4] = address.country;
		addressArray[5] = address. zip;
		
		return addressArray;
		
	}
	
	public UserProfile( String name, int uniqueId, int mobile, Address address, String[] interests ){
		this.name = name;
		this.uniqueId = uniqueId;
		this.mobile = mobile;
		this.address = address;
		this.interests = interests;
	}

}
