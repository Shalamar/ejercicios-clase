package Clases;

public class NIF {

	//atributos
	int num;
	String letra;
	
	
	
//constructores
	
	public NIF(){
		num=0;
		letra="";
	}
	public NIF(int x){
	num=x;
	letra=letra();
		
	}
//metodos
	public String accederDNI(){
		return Integer.toString(num);
	}
	
	
	public String accederNIF(){
		String nif=Integer.toString(num)+"-"+letra;
		return nif;
	}
	public void leer(){
		
		System.out.println("La letra del DNI "+num+" es "+letra);
		
	}
	private String letra(){
		String calc = "";
		int resto=(num%23);
		switch(resto){
		case 0:
			calc="T";
			break;
			
		case 1:
			calc="R";
			break;
		case 2:
			calc="W";
			break;
		case 3:
			calc="A";
			break;
		case 4:
			calc="G";
			break;
		case 5:
			calc="M";
			break;
		case 6:
			calc="Y";
			break;
		case 7:
			calc="F";
			break;
		case 8:
			calc="P";
			break;
		case 9:
			calc="D";
			break;
		case 10:
			calc="X";
			break;
		case 11:
			calc="B";
			break;
		case 12:
			calc="N";
			break;
		case 13:
			calc="J";
			break;
		case 14:
			calc="Z";
			break;
		case 15:
			calc="S";
			break;
		case 16:
			calc="Q";
			break;
		case 17:
			calc="V";
			break;
		case 18:
			calc="H";
			break;
		case 19:
			calc="L";
			break;
		case 20:
			calc="C";
			break;
		case 21:
			calc="K";
			break;
		case 22:
			calc="E";
			break;
		}
		return calc;
	}
	
	public void mostrar(){
		System.out.println("Su DNI es: "+num+"-" +letra);
	}
	
}
