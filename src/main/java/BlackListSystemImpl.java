import java.util.HashSet;
import java.util.Set;


public class BlackListSystemImpl implements BlackListSystem {

	private static Set<String> blackList = new HashSet<>();
	
	@Override
	public void registrarPersona(String nombre, String apellido, String dni) {
		System.out.println("Se registro al dni " + dni +" en la blacklist, ya no podra entrar al boliche");
		blackList.add(dni);
	}

}
