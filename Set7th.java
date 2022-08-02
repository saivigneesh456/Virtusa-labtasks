package labtasks;

import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set7th {
	public static void main(String args[]) {

		try {
			Student5th s = new Student5th("sai", "vignesh", "cse");
			Student5th s1 = new Student5th("tammana", "manideep", "cse");
			Set<Student5th> sm = new HashSet<Student5th>();
			sm.add(s);
			sm.add(s1);
			TreeSet ts = new TreeSet(sm);

			FileOutputStream fos = new FileOutputStream(new File("set.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ts);
			oos.close();

			System.out.println("The elements of a Set saved to a File Sucessfully");
		} catch (Exception e) {
			System.out.println("Error Occurred : " + e);
		}
	}
}
