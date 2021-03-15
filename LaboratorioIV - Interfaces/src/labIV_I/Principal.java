package labIV_I;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cantante can = new Cantante("Alonso","Huarcaya",true);
		can.cantar();
		
		Pajaro pa = new Pajaro(3);
		pa.cantar();
		
		//No se puede hacer un instancia de una interfaz porque tiene metodos no definidos
		//Ademas que la intefaz es abstracta 
		//ICantar x = new ICantar();
		
		//Pero si se puede hacer esto
		ICantar c = new Cantante();
		ICantar x = new Pajaro();
	}

}
