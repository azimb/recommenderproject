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
	
	
	
	public UserProfile( String name, int uniqueId, int mobile, Address address, String[] interests ){
		this.name = name;
		this.uniqueId = uniqueId;
		this.mobile = mobile;
		this.address = address;
		this.interests = interests;
	}

}
