public class ExtendedStud {
    public void coursedetails(){
    String[] courses = {"Mathematics", "Physics", "Computer Programming"};
    int[] marks = {70, 35, 45};
    System.out.println("Courses with Marks less than 40:");
    for (int i = 0; i < courses.length; i++) {
        if (marks[i] < 40) {
            System.out.println("Course: " + courses[i]);
            System.out.println("Marks: " + marks[i]);
        }
    }
    }
}
