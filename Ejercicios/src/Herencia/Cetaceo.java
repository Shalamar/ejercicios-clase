package Herencia;

public class Cetaceo extends Mamifero{
public Cetaceo (String h){
super(h);
}
public Cetaceo(){
this("acuático");
}
public String tipo(){
return super.tipo()+ " (cetáceo)";
}
}