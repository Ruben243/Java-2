import java.io.* ;

class fibonacci{
	
	public static int fibonacci(int numero){
		
		if (numero==1){
		return 1;
		
		
		}else{
			if (numero==2){
				return 1;
				
			}else{
				
				return fibonacci(numero-1)+fibonacci(numero-2);
				
			}
		
			
		}
		
		
	}
	
	public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cuantos=0;
		int numero=0;
		
		do
		{
			System.out.print("Numero de terminos de la serie: ");
			cuantos=Integer.parseInt(br.readLine());
		} while (cuantos<=0);
		for (numero=1; numero<=cuantos;numero++){
			
			System.out.print(fibonacci(numero)+ "");
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
