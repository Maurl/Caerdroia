import java.util.Random;

public class Accesorio extends Equipo{
/*
	public Accesorio(String nombre, int fuerza, int magia, int resistencia, int inteligencia){
		super(nombre, fuerza, magia, resistencia, inteligencia);
	}
*/
	public Accesorio(boolean starter){
		super(starter);
		if(starter){
			setAttributes(0);
		} else {
			setAttributes(random.nextInt()); // número de armas que hay
		}
	}

	protected void setAttributes(int tipo){
		
	}

}