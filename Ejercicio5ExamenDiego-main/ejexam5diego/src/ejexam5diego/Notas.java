package ejexam5diego;

public class Notas {
	private static String NP;
	private static Double NT;
	public static String getNP() {
		return NP;
	}
	public static Double getNT() {
		return NT;
	}
	public void setNP(String valor) {
		NP=valor;
	}
	public void setNT(Double valor) {
		NT=valor;
	}
	
	public static String Nota(String string, Double double1) {
		if(getNP()=="Mal") {
			if(getNT()<5) {
				return "Suspenso";
			}
			else if(getNT()>=5 && getNT()<7) {
				return "Suspenso";
			}
			else if(getNT()>=7 && getNT()<8.5) {
				return "Suspenso";
			}
			else {
				return "Compensable";
			}
		}
		else if(getNP()=="Regular") {
			if(getNT()<5) {
				return "Suspenso";
			}
			else if(getNT()>=5 && getNT()<7) {
				return "Aprobado";
			}
			else if(getNT()>=7 && getNT()<8.5) {
				return "Notable";
			}
			else {
				return "Sobresaliente";
			}
		}
		else{
			if(getNT()<5) {
				return "Compensable";
			}
			else if(getNT()>=5 && getNT()<7) {
				return "Notable";
			}
			else if(getNT()>=7 && getNT()<8.5) {
				return "Sobresaliente";
			}
			else {
				return "Matricula de Honor";
			}
		}
	}

}
