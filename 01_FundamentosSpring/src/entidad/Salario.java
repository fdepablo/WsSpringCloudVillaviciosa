package entidad;

public class Salario {
	private double base;
	private String tipo;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Salario [base=" + base + ", tipo=" + tipo + "]";
	}
	
	
}
