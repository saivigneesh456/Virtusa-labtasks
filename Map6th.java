package labtasks;

import java.util.*;
import java.util.Map.Entry;

public class Map6th {

	public static Map<Long, Student5th> addStudentsintoMap() {
		
		Student5th s1 = new Student5th(1, "sai", "vignesh","cse","abc@gmail.com");
		Student5th s2 = new Student5th(2, "abc", "ghhs","cse","abdsc@gmail.com");
		Student5th s3 = new Student5th(3, "sasi", "vignesh","cse","abcss@gmail.com");
		Student5th s4 = new Student5th(4, "rttrdd", "vignesh","cse","abssc@gmail.com");
		
		List<Student5th> slist = new ArrayList<Student5th>();
		slist.add(s2);
		slist.add(s1);
		slist.add(s3);
		slist.add(s4);
				
		Map<Long,Student5th> sMap = new HashMap<>();
		
		for(int i = 0; i<slist.size();i++) {
			sMap.put(slist.get(i).getId(), slist.get(i));
		}
		
		return sMap;
	}

	
	public static Student5th getStudentById(long id) {		
		Map<Long, Student5th> smap = addStudentsintoMap();		
		Student5th resultStudent = smap.get(id);
		return resultStudent;		
	}
	
	
	private static Student5th searchByNameAndEmail(String firstname,String email) {
		Map<Long, Student5th> sMap = addStudentsintoMap();
		
		
		for(Entry<Long,Student5th> entry : sMap.entrySet()) {
			if(entry.getValue().getFirstName() == firstname &&entry.getValue().getEmail() == email) {
				return entry.getValue();
			}
		}
		return null;
	}
	/*
	 * public static HashMap<Long, Student5th> sortbyname(HashMap<Long, Student5th>
	 * hm){ HashMap<Long, Student5th> hm1 = new HashMap<Long, Student5th>();
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		System.out.println(getStudentById(2));
		System.out.println(searchByNameAndEmail("sai", "abc@gmail.com"));
		
	}
}

