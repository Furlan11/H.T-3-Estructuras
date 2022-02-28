import java.util.Comparator;

public class Sort<T> {
public Comparator myCompare;
	
	/**
	 * Constructor of Sort Class, a Icomparator object is necessary to create 
	 * a object of this class
	 * @param _Compare a class that implements IComparator interface necessary
	 * to know how compare the elements of generic arrays. 
	 */
	public Sort(Comparator _Compare) {
		myCompare = _Compare;
	}
	
	public void gnomeSort(Integer[] nums)
	  {
		  int i=1;
		  int j=2;
		 
		  while(i < nums.length) {
		    if ( nums[i-1] <= nums[i] ) 
			{
		      i = j; j++;
		    } else {
		      int tmp = nums[i-1];
		      nums[i-1] = nums[i];
		      nums[i--] = tmp;
		      i = (i==0) ? j++ : i;
		    }
		  }
	  }
	  /***
		 * Sorts the specified array of objects using the insertion
		 * sort algorithm.
		 * @param myArray List of elements need to be sorted
		 */
	   public void insertionSort (T[] myArray)
	   {
	      for (int index = 1; index < myArray.length; index++)
	      {
	         T key = myArray[index];
	         int position = index;

	         //  Shift larger values to the right
	         while (position > 0 && (myCompare.compare(key, myArray[position-1]) < 0) )
	         {
	        	 myArray[position] = myArray[position-1];
	            position--;
	         }
	            
	         myArray[position] = key;
	      }
	   }
	
	/***
	 * Sorts the specified array of objects using the bubble
	 * sort algorithm.
	 * @param myArray List of elements need to be sorted
	 */
	public void BubbleSort(T[] myArray) {
		for (int i = 0; i < myArray.length - 1; i++) {					// n
			for (int j = i + 1; j < myArray.length; j++) {				// n
				if (myCompare.compare(myArray[i], myArray[j]) > 0) {    // 1
					T temp = myArray[i];								// 1
					myArray[i] = myArray[j];							// 1
					myArray[j] = temp;									// 1
				}
			}
		}
	}
	public static void merge(Integer A[],int izq, int m, int der){
		   int i, j, k;
		   int [] B = new int[A.length]; //array auxiliar
		   for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar                                       
		        B[i]=A[i];

		   i=izq; j=m+1; k=izq;
		     
		   while (i<=m && j<=der) //copia el siguiente elemento más grande                                      
		          if (B[i]<=B[j])
		              A[k++]=B[i++];
		          else
		              A[k++]=B[j++];
		        
		   while (i<=m)         //copia los elementos que quedan de la
		         A[k++]=B[i++]; //primera mitad (si los hay)
		}
	public static void mergeSort(Integer A[],int izq, int der){
	    if (izq < der){
	            int m=(izq+der)/2;
	            mergeSort(A,izq, m);
	            mergeSort(A,m+1, der);                                                                                
	            merge(A,izq, m, der);                                                                                 
	    }
	}
	 public void quickSort(T[] myArray, int inf, int sup) {
		   int i = inf - 1;
		   int j = sup;
		   boolean flag = true;
		   T temp;
		   
		   
		   if (inf >= sup) {
			   return;
		   }
		   
		   T elem_div = myArray[sup];
		   
		   
		   while (flag) {
			   while(myCompare.compare(myArray[++i], elem_div) < 0); //Move the index i until it finds an element bigger than elem_div
			   while((myCompare.compare(myArray[--j], elem_div) > 0)  && (j > inf)); //Move the index j until it finds element smaller than elem_div
			   
			   if (i < j) {
				   temp = myArray[i];
				   myArray[i] = myArray[j];
				   myArray[j] = temp;
			   } else {
				   flag = false;
			   }
		   }
		   
		   temp = myArray[i];
		   myArray[i] = myArray[sup];
		   myArray[sup] = temp;
		   quickSort(myArray, inf, i - 1);
		   quickSort(myArray, i + 1, sup);
	   }
	 
	 
}
