package labtasks;
import java.util.*;

public class Studnetlist5th {
		
	public static void main(String [] args) {
	List<Student5th> slist = addStudents();
	System.out.println(slist);
	String firstname = "sai";
	String lastname= "vignesh";
	searchByFirstNameAndLastName(slist, firstname, lastname);
}

	private static void searchByFirstNameAndLastName(List<Student5th> slist, String firstname, String lastname) {
		for(int i = 0; i<slist.size(); i++) {
			if(slist.get(i).getFirstName() == firstname && slist.get(i).getLastName() == lastname) {
				System.out.println(slist.get(i));
				
			}
			else {
				System.out.println("Student Not Found");
			}
		}
	}

	public static List<Student5th> addStudents() {
		Student5th s = new Student5th("sai","vignesh","cse");
		Student5th s1 = new Student5th("tammana","manideep","cse");
		List<Student5th> slist = new ArrayList<Student5th>();
		slist.add(s);
		slist.add(s1);
		return slist;
	}
}
