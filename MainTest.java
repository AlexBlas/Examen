import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {


	@Test
	public void testNova_lletra() {
		
		Main.p ="hola"; //Seleccionar la paraula "hola";
		
		assertEquals(true,Main.nova_lletra('h')); //Comproba si en la paraula "hola" te la lletra 'h', com es cert retorna true.
		assertEquals(false,Main.nova_lletra('p')); //Comproba si en la paraula "hola" te la lletra 'p' com es fals retorna false.
	}

}
