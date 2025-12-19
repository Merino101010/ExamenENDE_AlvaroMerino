package Examen;

public class Vehiculo {
	
	public String matricula;
	public String marca;
	public String modelo;
	
	public double preciohora;
	
	public Vehiculo( String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreciohora() {
		return preciohora;
	}

	public void setPreciohora(double preciohora) {
		this.preciohora = preciohora;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", preciohora="
				+ preciohora + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
