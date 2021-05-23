
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course("Java","Engin Demiroð","%20");
		Course course2 = new Course("C#","Engin Demiroð","%65");
		
		Profile profile1 = new Profile();
		profile1.firstName="Sude";
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course2);
		
		System.out.println(profile1.getFirstName());
		System.out.println(course1.getCourseName());
		System.out.println(course2.getCourseInstructor());
		
		
		
		
		
		
		
		
		
		
		

	}

}
