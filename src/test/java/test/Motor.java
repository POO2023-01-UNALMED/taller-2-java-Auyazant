package tjava;

public class Motor {
	
	int numeroCilindros;
	int registro;
	String tipo;
	
	
void cambiarRegistro(int registro) {
	
	this.registro = registro;
	
}

void asignarTipo(String tipo) {
	if (tipo.equals("gasolina")||tipo.equals("electrico")) {
		this.tipo = tipo;
	}
	
}

}
