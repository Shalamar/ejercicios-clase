import java.util.Scanner;


public class T3vectores8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]=new int[5];
		for(int i=0;i<5;i++){
			
			Scanner teclado=new Scanner(System.in);
			System.out.println("Introduce un valor");
			v[i]=teclado.nextInt();
			
			
		}
	
		for(int i = 0;i<5;i++){
		
		for(int j =0;j<4;j++){
			
			if(v[j]>v[j+1]){
				
				int aux=v[j];
				v[j]=v[j+1];
				v[j+1]=aux;
			}
		}
				
			}
		for(int i = 0;i<5;i++){
			System.out.println("Valores ordenados: " + v[i]);
		}
	
	}

}
