package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "Basak";
		student.surname = "Ahlat";
		student.id = "58";
		student.email = "basakahlat@ogrenci.beykoz.edu.tr";
		student.password = "password";
		student.myCourses = "Java Geliþtirme Kursu";
		
		Instructor instructor = new Instructor();
		instructor.name = "Engin";
		instructor.surname = "Demiroð";
		instructor.id = "16";
		instructor.email = "engindemirog@deneme.com";
		instructor.password = "password";
		instructor.course = "Java Geliþtime Kursu";
		
		UserManager userManager = new UserManager();
		User[] users = {student, instructor};
		userManager.addMultiple(users);
		

		System.out.println("\n***************************");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Java Geliþtime Kursu");
		instructorManager.updateCourse("C# Geliþtime Kursu");
		instructorManager.deleteCourse("Python Geliþtime Kursu");
		
		System.out.println("\n***************************");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addMyCourses("Java Geliþtime Kursu");
		studentManager.deleteMyCourses("Java Geliþtime Kursu");

	}

}



//BaþakAHLAT



/*
 
 Kodlama.io projesini yazdýðýnýzý düþünelim.

User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)

UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonlarý tahminleyip modelleyiniz. (Class-Inheritance-Method)

Kural -- Sadece gördüðümüz konulardan yararlanmalýsýnýz.

Github adresinizi paylaþýnýz.
 
 
 */