package logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jonathan
 */
public class Cliente extends Persona {
    
    private int codigo;
    private float saldo;
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    String contenido = "";

    public void GuardarCliente(String datos) {
        Persona p = new Persona();

        p.escribirAlArchivoCliente(datos);
    }

    public String leerArchivoCliente(String fichero) {
        String leer = "";
        contenido = "";

        try {
            FileReader lector = new FileReader(fichero); //indicamos el archivo a leer
            //bufferedReader es una memoria temporal que está cuando corremos el programa y está en formato FiFo
            BufferedReader lectura = new BufferedReader(lector); //le pasamos el archivo a leer

            while ((leer = lectura.readLine()) != null) {
                contenido += leer + "\n";
            }

            lectura.close();

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return contenido;
    }
}
