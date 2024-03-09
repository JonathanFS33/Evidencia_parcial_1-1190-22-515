/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class Persona {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    //public ArrayList<Datos> reportes = new ArrayList<>();
    //CREAMOS LA VARIABLE PARA MANEJAR NUESTRO ARCHIVO DE TEXTO
    File archivo;
    
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    
    
    public void crearArchivoPersona() {
        archivo = new File("archivoPersona.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con éxito");
            } else {
                System.out.println("Error al crear el archivo");
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void eliminarArchivoPersona() {
        archivo = new File("archivoPersona.txt");
        if (archivo.delete()) {
            System.out.println("Archivo eliminado con éxito");
        } else {
            System.out.println("Error al eliminar el archivo");
        }
    }
    
     public void escribirAlArchivoPersona(String datos){
        try{
            FileWriter escritura = new FileWriter("archivoPersona.txt", true); //colocando true evitamos que se borre el contenido que ya estaba
            escritura.write(datos);
            escritura.close(); //es necesario el close para escribir
            
            System.out.println("Texto añadido con éxito");
            
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    
     public void crearArchivoCliente() {
        archivo = new File("archivoCliente.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con éxito");
            } else {
                System.out.println("Error al crear el archivo");
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void eliminarArchivoCliente() {
        archivo = new File("archivoCliente.txt");
        if (archivo.delete()) {
            System.out.println("Archivo eliminado con éxito");
        } else {
            System.out.println("Error al eliminar el archivo");
        }
    }
    
     public void escribirAlArchivoCliente(String datos){
        try{
            FileWriter escritura = new FileWriter("archivoCliente.txt", true); //colocando true evitamos que se borre el contenido que ya estaba
            escritura.write(datos);
            escritura.close(); //es necesario el close para escribir
            
            System.out.println("Texto añadido con éxito");
            
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    
     public String leerArchivoPersona(String fichero){
        String leer = "";
        String contenido = "";
        
        try{
            FileReader lector = new FileReader(fichero); //indicamos el archivo a leer
            //bufferedReader es una memoria temporal que está cuando corremos el programa y está en formato FiFo
            BufferedReader lectura = new BufferedReader(lector); //le pasamos el archivo a leer
            
            while((leer = lectura.readLine()) != null){
               contenido += leer + "\n";
            }
            
            lectura.close();
            
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
        return contenido;
    }
}
