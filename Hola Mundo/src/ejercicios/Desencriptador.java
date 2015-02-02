package ejercicios;

public class Desencriptador {

	public static void main(String[] args) {
		String textoEncriptado="CURSROLRSL PIJEIUEENS RAEOREOOL ACOMLQSDAO ETAJBEÑLI";
		String columnas[];
		char matrizDesencriptado[][]=new char[5][10];
		int clave[]={0,3,1,4,2};
		
		//Dividimos el texto encriptado en un sus columnas
		columnas=textoEncriptado.split(" ");
		
		//REllenamos la matrizDesencriptadora
		for(int i=0;i<matrizDesencriptado.length;i++)
		{
			for(int j=0;j<matrizDesencriptado[0].length;j++)
			{
				if(j<columnas[clave[i]].length())
					matrizDesencriptado[i][j]=columnas[clave[i]].charAt(j);
				else
					matrizDesencriptado[i][j]=' ';
			}
		}
		
		//Presentamos por pantalla
			for(int j=0;j<matrizDesencriptado[0].length;j++)
			{
				for(int i=0;i<matrizDesencriptado.length;i++)
				{
					System.out.print(matrizDesencriptado[i][j]);
				}
				System.out.println();
			}
				
	}

}