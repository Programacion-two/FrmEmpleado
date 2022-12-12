package logica;

public class Empleado	{
	
	//atributos
	private String nombre;
	private String apellido;
	private double salario;
	
	//constructor por defecto
	public Empleado() {
		salario=50000;
		
	}
	
	//constructor específico
	public Empleado(String nom, String ape, double sal) {
		nombre=nom;
		apellido=ape;
		salario=sal;
	}
	
	//métodos getter
	public  String getNombre() {
		return nombre;
	}
	
	public  String getApellido() {
		return apellido;
	}
	
	public  double getSalario() {
		return salario;
	}
	
	//métodos setter
	public void setNombre(String nombre1) {
		nombre=nombre1;
	}
	
	public void setApellido(String apellido1) {
		apellido=apellido1;
	}
	
	public void setSalario(double salario1) {
		salario=salario1;
	}
	
	//metodos especificos
	public double sueldoAnual() {
		return salario*12;
	}
	
	public double presentismo() {
		return salario=salario + salario*0.10;
	}
	
	
	@Override
	public String toString() {
		return "[" + "Nombre: " + nombre + "] " + "[" + "Apellido: " + apellido + "] " + "[" + "Salario: " + salario + "] " + "[" + "Sueldo anual es: " + this.sueldoAnual() + "]";
	}
	
	
}
