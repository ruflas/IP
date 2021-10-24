package ejexam11diego;

public class LineaTlf{
	private string nombre;
	private long numero;
	private Tiempo duracion;
	private int llamadas;
	
	public LineaTlf(string nombre,long numero){
		this.setNombre(nombre);
		this.setNumero(numero);
		Tiempo t = new Tiempo(0,0,0);
	}
	public void Llamada(Tiempo t){
		this.setDuracion(this.getDuracion().incrementaTiempo(t));
		numerollamadas++;
	}
	public void setDuracion(Tiempo t){
		this.duracion=t;
	}
	@Override
	public string toString(){
		String s=String.format("Nombre %s",this.getNombre());
		s+=String.format("\tNumero %d",this.getNumero());
		s+=String.format("\tLlamadas %d",this.getLlamadas());
		s+=String.formar("\tDuracion %d:%d:%d",this.getHoras(),this.getMinutos(),this.getSegundos());
		return s;
	}
}
