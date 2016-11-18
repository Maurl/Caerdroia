import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Ventana extends JFrame{
	private int x, y, t, l, b, r;
	private MatteBorder border;
	private JPanel botones, mapa, datos, info;
	private JButton up, down, left, right;
	private JLabel nombre, vida, fuerza, magia, resistencia, inteligencia, iniciativa, experiencia, nivel, bolsa, informacion;

	public Ventana(Mapa mapa){
		x = mapa.getPosicionX();
		y = mapa.getPosicionY();
		setTitle("Caerdroia");
		setSize(2000,2000);
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}

	public void initComponents(){
		mapa = new JPanel();
		mapa.setLayout(new GridLayout(5,5));
		drawMap(mapa);
		add(mapa);
		datos = new JPanel();
		datos.setLayout(new GridLayout(10,1));
		nombre = new JLabel("Nombre");
		vida = new JLabel("Vida");
		fuerza = new JLabel("Fuerza");
		magia = new JLabel("Magia");
		resistencia = new JLabel("Resistencia");
		inteligencia = new JLabel("Inteligencia");
		iniciativa = new JLabel("Iniciativa");
		experiencia = new JLabel("Experiencia");		
		nivel = new JLabel("Nivel");
		bolsa = new JLabel("Bolsa");
		datos.add(nombre);
		datos.add(vida);
		datos.add(fuerza);
		datos.add(magia);
		datos.add(resistencia);
		datos.add(inteligencia);
		datos.add(iniciativa);
		datos.add(experiencia);
		datos.add(nivel);
		datos.add(bolsa);
		add(datos);
		botones = new JPanel();
		botones.setLayout(new GridLayout(2,2));
		up = new JButton("Up");
		down = new JButton("Down");
		left = new JButton("Left");
		right = new JButton("Right");
		botones.add(up);
		botones.add(down);
		botones.add(left);
		botones.add(right);
		add(botones);
		info = new JPanel();
		informacion = new JLabel("Caerdroia © 2016");
		info.add(informacion);
		add(info);
	}

	public void drawMap(JPanel mapa){
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				JLabel celda = new JLabel();
				celda.setHorizontalAlignment(JLabel.CENTER);
				if(i==x && y==j){
					celda.setText("12345");
				}else{
					celda.setText("Camara");
				}
				t =	mapa.getCamara(i,j).getUp();
				l =	mapa.getCamara(i,j).getLeft();
				b =	mapa.getCamara(i,j).getDown();
				r =	mapa.getCamara(i,j).getRight();
				border = BorderFactory.createMatteBorder(t,l,b,r, new Color(165,42,42));			
				celda.setBorder(borde);
				mapa.add(celda);
			}
		}
	}

}