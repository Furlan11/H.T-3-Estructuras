
public class GeneradorNum {
	/**
	 *metodo generar numeros enteros
	 * @param cant la cantidad de numeros radnom que se desean
	 * @return num un string con todos los numeros generados
	 *  
	 */
	public String Generar(int cant) {
		String num = "";
		int numero=0;
		for (int j=0 ; j <cant; j++) {
			 numero = (int)(Math.random()*(cant)+1);
			 num= num+" "+String. valueOf(numero);
			
		}
		 num= num+" ";
		
		
		return num;
	}
	/**
	 *metodo genera una lista 
	 * @param op es un String que tiene los enteros que se quieren listar
	 * @param num es la cantidad de nuemrios en la lisa
	 * @return lis una lista de enteros desordenada
	 *  
	 */
	public Integer[] listarNum(String op,int num) {
		
		Integer[] lis= new Integer[num];
		String muestra= "1 ";
		char espacio= muestra.charAt(1);
		int cont=0;
		for( int i=0 ; i <op.length(); i++) {
			
			char ope= op.charAt(i);
			String valor=String.valueOf(ope);
			if(ope!=espacio) {
				
				boolean llave= false;
				int contador2=i;
				if(i<op.length()-1) {
				llave= true;}
				while (llave==true) {
					contador2= contador2+1;
					if(op.charAt(contador2)!=espacio) {
						 valor=valor+String.valueOf(op.charAt(contador2));
						 
					}
					else {llave=false;}
					i=contador2;
				}
					
				lis[cont]=Integer.valueOf(valor);
				cont=cont+1;
		
	}

}
		return lis;
	}
	
}
