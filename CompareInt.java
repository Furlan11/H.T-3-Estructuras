import java.util.Comparator;

public class CompareInt implements Comparator {

	public int compare(Object _object1, Object _object2) {
		int n1 = (Integer.parseInt(_object1.toString()));
		int n2 = (Integer.parseInt(_object2.toString()));
		if(n1>n2) {
			return 1;
		}
		else if (n1<n2) {
			return -1;
		}
		
		else
			return 0;
		
	}


	
}
