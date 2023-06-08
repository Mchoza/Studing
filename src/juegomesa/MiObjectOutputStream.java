package juegomesa;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {

	public MiObjectOutputStream(OutputStream out) throws IOException {
		super(out);
		
		
	}
//Esto es porque no queremos que añada nada en la cabecera
	public void writeStreamHeader() {
		
	}
}
