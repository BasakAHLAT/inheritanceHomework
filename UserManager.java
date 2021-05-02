package inheritanceHomework;

public class UserManager{

	public void addUser(User user) {
		System.out.println("User eklendi : " + user.getEmail());
	}
	
	public void updateUser(User user) {
		System.out.println("Kullanıcı güncellendi");
	}
	
	public void deleteUser(User user) {
		System.out.println("Kullanıcı silindi");
	}
	
	public void addMultiple(User[] users)
	{
		for(User user : users)
		{
			addUser(user);
		}
	}
}



//BaşakAHLAT
