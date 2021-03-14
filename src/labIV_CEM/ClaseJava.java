package labIV_CEM;

	public class ClaseJava {
		
		// Atributos
		
		//Encapsulamiento: es para que otra clase no pueda cambiar los valores
		//de esta clase sin querer pero si lo puede hacer por medio de los getters
		// and setters (por eso se pone private)
		private int id;
		private String nombre;
		static int cont = 0; //Maneja los ID automaticamente
		
		//Constructor que no recibe nada
		public ClaseJava() {
			cont++;
			id = cont;
			nombre = "Sin nombre";
		}
		//Constructor que recibe un parametro
		public ClaseJava(String _nombre) { //Borre el int id Mira Video 2
			cont++;
			id = cont;
			nombre = _nombre;
		}
		
		// Getters
		public int getId() {
			return id;
		}
		public String getNombre() {
		 return nombre;
		}
		
		//Setters
		public void setId(int _id) {
			id = _id;
		}
		public void setNombre(String _nombre) {
			nombre = _nombre;
		}
		@Override
		public String toString() {
			return "ClaseJava [id = " + id + ", nombre = " + nombre + "]";
		}
		
		//Devuelve el proximo ID que se va a generar
		public static int proxID() { //Con static ya no tengo que crear un objeto
			return cont+1; //Para el return cont++ no funciona pero si cont+1
		}
		
		
		//Me parece que en este caso no hace falta el this porque los valores
		//recibidos tienen un nombre distinto al valor que se va a cambiar (this.id)
	
 }

