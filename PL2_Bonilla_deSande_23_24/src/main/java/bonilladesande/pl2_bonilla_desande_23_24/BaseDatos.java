package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class BaseDatos {

        // "BASE DE DATOS" DE LOS CLIENTES Y INMUEBLES DISPONIBLES
    public static ArrayList<Particular> particulares;
    public static ArrayList<Anfitrion> anfitriones;
    public static ArrayList<Inmueble> inmuebles;
    public static ArrayList<Reserva> reservas;
    
    public static UserLoged user;
    public static Inmueble inmuebleSeleccionado;
    public static String verObjetos;

    
    
    /** 
     * @param listaInmuebles
     */
    // GUARDAR Y CARGAR DATOS
    public static void guardarDatosInmuebles(ArrayList<Inmueble> listaInmuebles) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/main/java/DataBase_Serializada/Inmuebles.dat"))) {
            oos.writeObject(listaInmuebles);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosInmuebles() {
        ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/java/DataBase_Serializada/Inmuebles.dat"))) {
            listaInmuebles = (ArrayList<Inmueble>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        inmuebles = listaInmuebles;
    }
    
    /** 
     * @param listaInmuebles
     */
    public static void guardarDatosParticulares(ArrayList<Particular> listaParticulares) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/main/java/DataBase_Serializada/Particulares.dat"))) {
            oos.writeObject(listaParticulares);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosParticulares() {
        ArrayList<Particular> listaParticulares = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/java/DataBase_Serializada/Particulares.dat"))) {
            listaParticulares = (ArrayList<Particular>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        particulares = listaParticulares;
    }
    
    /** 
     * @param listaAnfitriones
     */
    public static void guardarDatosAnfitriones(ArrayList<Anfitrion> listaAnfitriones) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/main/java/DataBase_Serializada/Anfitriones.dat"))) {
            oos.writeObject(listaAnfitriones);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosAnfitriones() {
        ArrayList<Anfitrion> listaAnfitriones = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/java/DataBase_Serializada/Anfitriones.dat"))) {
            listaAnfitriones = (ArrayList<Anfitrion>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        anfitriones = listaAnfitriones;
    }
    
    /** 
     * @param listaReservas
     */
    public static void guardarDatosReservas(ArrayList<Reserva> listaReservas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/main/java/DataBase_Serializada/Reservas.dat"))) {
            oos.writeObject(listaReservas);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosReservas() {
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/java/DataBase_Serializada/Reservas.dat"))) {
            listaReservas = (ArrayList<Reserva>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        reservas = listaReservas;
    }
    
    
    
    /** 
     * @param casa
     * @param precioMax
     * @param precioMin
     * @param calificacionMin
     * @param huespedesMin
     * @param habitacionesMin
     * @param camasMin
     * @param banosMin
     * @param titulo
     * @param ciudad
     * @return ArrayList<Inmueble>
     */
    public static ArrayList<Inmueble> filtroAlojamientos(boolean casa, double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad ){
        
        ArrayList<Inmueble> listaFiltrada = new ArrayList<>();
        
        listaFiltrada = filtroAlojamientos(precioMax, precioMin, calificacionMin, huespedesMin, habitacionesMin, camasMin, banosMin, titulo, ciudad);

        int tamano = listaFiltrada.size();
        for (int i = 0; i < tamano; i++){
            if (listaFiltrada.get(i).esCasa() != casa){
                listaFiltrada.remove(i);
            }
        }
        
        return listaFiltrada;
    }
    
    
    /** 
     * @param precioMax
     * @param precioMin
     * @param calificacionMin
     * @param huespedesMin
     * @param habitacionesMin
     * @param camasMin
     * @param banosMin
     * @param titulo
     * @param ciudad
     * @return ArrayList<Inmueble>
     */
    //FILTRAR ALOJAMIENTOS COMPARANDO SUS PRECIOS, CALIFICACIONES, HUÉSPEDES, CAMAS, BAÑOS, Y/O DIRECCIONES.
    
    public static ArrayList<Inmueble> filtroAlojamientos(double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad ){
        
        ArrayList<Inmueble> listaFiltrada = new ArrayList<>();
        
        int tamano = inmuebles.size();
        
        for (int i = 0; i < tamano; i++){
            
            Inmueble inmueble = inmuebles.get(i);
            if (inmueble.getPrecioNoche() >= precioMin && 
                inmueble.getPrecioNoche() <= precioMax && 
                calificacionMin < inmueble.getCalificacion() &&
                huespedesMin < inmueble.getDatos().getHuespedes() &&
                habitacionesMin < inmueble.getDatos().getHabitaciones() &&
                camasMin < inmueble.getDatos().getCamas() &&
                banosMin < inmueble.getDatos().getBaños() &&
                inmueble.getDireccion().getCiudad().contains(ciudad)){
                
                    if (!"".equals(ciudad) || !"".equals(titulo)){
                        
                        boolean ciudadFiltro = true;
                        boolean tituloFiltro = true;
                        
                        if (!"".equals(ciudad)){
                            ciudadFiltro = false;
                            if (inmueble.getDireccion().getCiudad().contains(ciudad)){
                                ciudadFiltro = true;
                            }
                        }
                        
                        if (!"".equals(titulo)){
                            tituloFiltro = false;
                            if (inmueble.getTitulo().contains(ciudad)){
                                tituloFiltro = true;
                            }
                        }
                        
                        
                        if (ciudadFiltro && tituloFiltro){
                            Inmueble valido = inmuebles.get(i);
                            listaFiltrada.add(valido);
                        }
                    }
                    else{
                        Inmueble valido = inmuebles.get(i);
                        listaFiltrada.add(valido);
                    }  
            }
        }
        return listaFiltrada;
    }
    
    
    /** 
     * @param ciudad
     * @param fechaEntrada
     * @param fechaSalida
     * @return ArrayList<Inmueble>
     */
    public static ArrayList<Inmueble> filtroAlojamientos(String ciudad, LocalDate fechaEntrada, LocalDate fechaSalida){
        ArrayList<Inmueble> listaFiltrada = new ArrayList<>();
        
        for(int i = 0; i < BaseDatos.inmuebles.size(); i++){
            if (Reserva.ComprobarReserva(BaseDatos.inmuebles.get(i), fechaEntrada, fechaSalida) && BaseDatos.inmuebles.get(i).getDireccion().getCiudad().equals(ciudad)){
                listaFiltrada.add(BaseDatos.inmuebles.get(i));
            }
        }
        
        return listaFiltrada;
    }
    
    /*ESTE APARTADO FUE HECHO PRINCIPALMENTE PARA REALIZAR LAS PRUEBAS NECESARIAS, PERO SU PRINCIPAL FUNCIÓN ES 
    VACIAR LOS ARRAYLIST PARA ASEGURARNOS DE QUE SE SUBEN LOS DATOS..*/
   
    public static void BorrarListaAnfitriones() {
        anfitriones.clear();  
    }
    public static void BorrarListaParticulares() {
        particulares.clear();  
    }
    public static void BorrarListaInmuebles() {
        inmuebles.clear();  
    }
    public static void BorrarListaReservas() {
        reservas.clear();  
    }
}
