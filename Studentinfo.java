public class Studentinfo extends ExtendedStud{
    public void display(String name, String USN, String Branch, String Department ){
        System.out.println("The Student deatils");
        System.out.println("Student Name: " +name);
        System.out.println("Student USN : " +USN);
        System.out.println("Student Branch : " +Branch);
        System.out.println("Student Department : " + Department);
    }
public static void main(String[] args){
    Studentinfo s1=new Studentinfo();
    s1.display("vijay","01FE22BCA207","BCA","ComputerApplication");
    ExtendedStud s2=new ExtendedStud();
    s2.coursedetails();

}
}