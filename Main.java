package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "Basak";
		student.surname = "Ahlat";
		student.id = "58";
		student.email = "basakahlat@ogrenci.beykoz.edu.tr";
		student.password = "password";
		student.myCourses = "Java Geliştirme Kursu";
		
		Instructor instructor = new Instructor();
		instructor.name = "Engin";
		instructor.surname = "Demiroğ";
		instructor.id = "16";
		instructor.email = "engindemirog@deneme.com";
		instructor.password = "password";
		instructor.course = "Java Geliştime Kursu";
		
		UserManager userManager = new UserManager();
		User[] users = {student, instructor};
		userManager.addMultiple(users);
		

		System.out.println("\n***************************");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Java Geliştime Kursu");
		instructorManager.updateCourse("C# Geliştime Kursu");
		instructorManager.deleteCourse("Python Geliştime Kursu");
		
		System.out.println("\n***************************");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addMyCourses("Java Geliştime Kursu");
		studentManager.deleteMyCourses("Java Geliştime Kursu");

	}

}



//BaşakAHLAT



/*
 
 Kodlama.io projesini yazdığınızı düşünelim.

User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)

UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)

Kural -- Sadece gördüğümüz konulardan yararlanmalısınız.

Github adresinizi paylaşınız.
 
 
 */