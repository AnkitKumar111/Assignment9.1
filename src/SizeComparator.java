import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class having an ArrayList and add 3 objects of HDTV
class SizeComparator implements Comparator<HDTV> {
	public int compare(HDTV tv1, HDTV tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		//creating object
		HDTV tv1 = new HDTV("Airtel",55);
		HDTV tv2 = new HDTV("Sony",40);
		HDTV tv3 = new HDTV("TataSky",42);

		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
		/*Displaying HDTV objects in sorted order of
		  size (Use Comparator) */
		Collections.sort(al, new SizeComparator());
		for (HDTV a : al) {
			System.out.println(a.getBrandname());
		}
	}
}
	