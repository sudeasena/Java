
public class Course {
	String courseName;
	String courseInstructor;
	String courseContinuity;

	public Course(String courseName, String courseInstructor, String courseContinuity) {
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.courseContinuity = courseContinuity;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public String getCourseContinuity() {
		return courseContinuity;
	}

	public void setCourseContinuity(String courseContinuity) {
		this.courseContinuity = courseContinuity;
	}

	
	
}
