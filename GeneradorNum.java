
public class GeneradorNum {
	
	public String Generar(int cant) {
		String num = "";
		int numero=0;
		for (int j=0 ; j <cant; j++) {
			 numero = (int)(Math.random()*(cant)+1);
			 num= num+" "+String. valueOf(numero);
			
		}
		
		
		
		return num;
	}
	public Integer[] listarNum(String op,int num) {
		
		Integer[] lis= new Integer[num];
		String muestra= "1 ";
		char espacio= muestra.charAt(1);
		int cont=0;
		for( int i=0 ; i <op.length(); i++) {
			
			char ope= op.charAt(i);
			
			if(ope!=espacio) {
				lis[cont]=Character.getNumericValue(ope);
				cont=cont+1;
		
	}

}
		return lis;
	}
	
}
