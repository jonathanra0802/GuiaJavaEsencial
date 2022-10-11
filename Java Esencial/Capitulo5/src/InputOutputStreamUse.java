import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
//Un stream es un flujo continuo de datos y en particular un input stream es un flujo continuo de datos de entrada. OutputStream es un flujo continuo de datos de salida.

//EL INPUT STREAM TRAE ELEMENTOS EXTERNOS Y LOS LEE
//POR OTRO LADO EL OUTPUT STREAM CREA ELEMENTOS DESDE EL SISTEMA Y LOS CREA PARA USO EXTERNO

public class InputOutputStreamUse {
    public static void main(String[] args) {
        //Vamos a decirle al ordenador que traiga al elemento que queremos leer en el IDE
        Path inputPath = Paths.get("C:\\Users\\john_\\Desktop\\StreamJRA.txt");
        //InputStream representa un flujo de datos desde el origen
        InputStream input;
        //Abrimos el archivo en un nuwvo input y vamos a tener el formato en modo lectura
        try {
            input = Files.newInputStream(inputPath, StandardOpenOption.READ);
            int i;
            while((i =input.read()) != -1){
                System.out.println((char) i);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
