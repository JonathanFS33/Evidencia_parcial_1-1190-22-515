/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Jonathan
 */
public class Empleado extends Persona {

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
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    private int codigo;
    private String puesto;
    private float salario;
    
    public void Guardar(String datos){
        Persona p = new Persona();
        
        p.escribirAlArchivoPersona(datos);
    }
    
    public void consultarPersona(){
        Persona p = new Persona();
        
        p.leerArchivoPersona("archivoCliente.txt");
    }
}
