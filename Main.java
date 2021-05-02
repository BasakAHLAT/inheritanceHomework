package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "Basak";
		student.surname = "Ahlat";
		student.id = "58";
		student.email = "basakahlat@ogrenci.beykoz.edu.tr";
		student.password = "password";
		student.myCourses = "Java Geli�tirme Kursu";
		
		Instructor instructor = new Instructor();
		instructor.name = "Engin";
		instructor.surname = "Demiro�";
		instructor.id = "16";
		instructor.email = "engindemirog@deneme.com";
		instructor.password = "password";
		instructor.course = "Java Geli�time Kursu";
		
		UserManager userManager = new UserManager();
		User[] users = {student, instructor};
		userManager.addMultiple(users);
		

		System.out.println("\n***************************");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Java Geli�time Kursu");
		instructorManager.updateCourse("C# Geli�time Kursu");
		instructorManager.deleteCourse("Python Geli�time Kursu");
		
		System.out.println("\n***************************");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addMyCourses("Java Geli�time Kursu");
		studentManager.deleteMyCourses("Java Geli�time Kursu");

	}

}



//Ba�akAHLAT



/*
 
 Kodlama.io projesini yazd���n�z� d���nelim.

User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)

UserManager, InstructorManager, StudentManager i�in sistemde olabilecek operasyonlar� tahminleyip modelleyiniz. (Class-Inheritance-Method)

Kural -- Sadece g�rd���m�z konulardan yararlanmal�s�n�z.

Github adresinizi payla��n�z.
 
 
 */