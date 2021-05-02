package inheritanceHomework;

public class UserManager{

	public void addUser(User user) {
		System.out.println("User eklendi : " + user.getEmail());
	}
	
	public void updateUser(User user) {
		System.out.println("Kullanýcý güncellendi");
	}
	
	public void deleteUser(User user) {
		System.out.println("Kullanýcý silindi");
	}
	
	public void addMultiple(User[] users)
	{
		for(User user : users)
		{
			addUser(user);
		}
	}
}



//BaþakAHLAT
