package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> songs = new ArrayList<String>();
		//2. Add five Strings to your list
		songs.add("Yellow Hearts"); 
		songs.add("Roxanne");
		songs.add("Candy");
		songs.add("Love Me Less");
		songs.add("No Guidance");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<songs.size(); i++) {
			String s = songs.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for (String song : songs) {
			System.out.println(song);
		}
		//5. Print only the even numbered elements in the list.
		for(int en = 0; en<songs.size();en+=2) {
			String ene = songs.get(en);
			System.out.println(ene);
		}
		//6. Print all the Strings in reverse order.
		for(int r = songs.size()-1; r>=0; r--) {
			String ro = songs.get(r);
			System.out.println(ro);
		}
		System.out.println("------");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int e = 0; e<songs.size(); e++) {
			String se = songs.get(e);
			if(se.contains("e")) {
				System.out.println(se);
			}
		}
	}
}
