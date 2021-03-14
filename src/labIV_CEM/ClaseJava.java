package labIV_CEM;

	public class ClaseJava {
		
		// Atributos
		
		//Encapsulamiento: es para que otra clase no pueda cambiar los valores
		//de esta clase sin querer pero si lo puede hacer por medio de los getters
		// and setters (por eso se pone private)
		private int id;
		private String nombre;
		
		//Constructor que no recibe nada
		public ClaseJava() {
			id = 0;
			nombre = "Sin nombre";
		}
		//Constructor que recibe un parametro
		public ClaseJava(String _nombre,int _id) {
			id = _id;
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
		
		
		//Me parece que en este caso no hace falta el this porque los valores
		//recibidos tienen un nombre distinto al valor que se va a cambiar (this.id)
	
 }

