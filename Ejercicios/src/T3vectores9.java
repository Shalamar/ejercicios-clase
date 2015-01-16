import java.util.Scanner;


public class T3vectores9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String pais[]=new String[5];
			int i=0;
			int j=0;
			
			
			for(i=0;i<5;i++){
				Scanner teclado=new Scanner(System.in);
				System.out.println("Introduce paises");
				pais[i]=teclado.next();
			}		
			
			for( j = 0;j<4;j++){
				
				for(i =0;i<4;i++){
					
					if(pais[i].compareTo(pais[i+1])>0){
						
						String aux=pais[i];
						pais[i]=pais[i+1];
						pais[i+1]=aux;
					}
					}
				}
			for (i=0;i<5;i++){
			System.out.println(pais[i]);
			}
	}

}
