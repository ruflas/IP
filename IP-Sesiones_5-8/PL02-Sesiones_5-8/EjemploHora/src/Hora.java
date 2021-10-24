
public class Hora {
	private int hora,minutos,segundos;

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public double segundosDesdeMedianoche() {
		return ((getHora()*60)*60)+(getMinutos()*60)+getSegundos();
	}
}
