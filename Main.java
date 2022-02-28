import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		lector lector=new lector();
		Scanner teclado= new Scanner(System.in);
		CompareInt comp= new CompareInt();
		Sort<Integer> sort= new Sort<Integer>(comp);
		GeneradorNum generador= new GeneradorNum();
		lector.Escribir("prueba");
		
		System.out.println("Ingrese cuanto snumeros aleatorios desea crear"
				);
		int op=teclado.nextInt();
		teclado.nextLine();
		String numeros=generador.Generar(op);
		lector.Escribir(numeros);
		Integer[] lista= generador.listarNum(numeros, op);
		
		System.out.println("Menu \n"
				+ "1.BubleSort\n"
				+ "2. QuickSort \n"
				+ "3. GnomSort \n"
				+ "4.MergeSort\n"
				+ "5. insertionSort \n"
				+ "marque numero de su ocpion"
				);
		int op1=teclado.nextInt();
		
		System.out.println(lista[1]);
		if(op1==1) {
			sort.BubbleSort(lista);
		}
		if(op1==2) {
			sort.quickSort(lista, 0, lista.length-1);
		}
		if(op1==3)
		{
			sort.gnomeSort(lista);
		}
		if(op1==4) {
			sort.mergeSort(lista, 0, lista.length-1);
		}
		if(op1==5) {
			sort.insertionSort(lista);
		}
		System.out.println(lista[1]);
	}
}
