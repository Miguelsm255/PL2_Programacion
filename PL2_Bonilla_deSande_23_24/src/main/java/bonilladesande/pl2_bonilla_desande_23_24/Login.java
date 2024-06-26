package bonilladesande.pl2_bonilla_desande_23_24;

import java.util.ArrayList;

public class Login {
    

    // POR DEFECTO ES -1, QUE SIGNIFICA QUE NO SE HA ENCONTRADO O NO EXISTE
    private static int tipoUsuario = -1;
    private static int posicionArrayList = -1;
    
    
    
    
    
    
    /** 
     * @param email
     * @param clave
     * @return UserLoged
     */
    // FUNCIÓN PRINCIPAL
    public static UserLoged login(String email, String clave){

        UserLoged user;
        if ("admin@javabnb.com".equals(email) && "admin".equals(clave)){
            user = new UserLoged(0,0);
        }
        else{
        // COMPROBAR SI EL EMAIL Y LA CONTRASEÑA ESTÁN BIEN (INCLUYE COMPROBAR LA EXISTENCIA DE LA CUENTA)
        comprobarUsuario(email, clave);
        
        // CREAR UN NUEVO OBJETO CON LOS DATOS NECESARIOS PARA OBTENER LA INFORMACIÓN DE LA SESIÓN
        user = new UserLoged(tipoUsuario, posicionArrayList);
        
        
        // SI ES UN CLIENTE
        if(tipoUsuario == 1){
            
            
            // AÑADIR LOS DATOS DEL CLIENTE
            Particular particular = BaseDatos.particulares.get(posicionArrayList);
            user.setDni(particular.getDni());
            user.setNombre(particular.getNombre());
            user.setTelefono(particular.getTelefono());
            user.setCorreo(particular.getCorreo());
            user.setClave(particular.getClave());
            user.setVip(particular.isVip());
            user.setTarjeta(particular.getTarjeta());
        }
        
        // SI ES UN ANFITRIÓN
        if(tipoUsuario == 2){
            
            // AÑADIR LOS DATOS DEL ANFITRIÓN
            Anfitrion anfitrion = BaseDatos.anfitriones.get(posicionArrayList);
            user.setDni(anfitrion.getDni());
            user.setNombre(anfitrion.getNombre());
            user.setTelefono(anfitrion.getTelefono());
            user.setCorreo(anfitrion.getCorreo());
            user.setClave(anfitrion.getClave());
        }
        
        // MOSTRAR POR TERMINAL LA INFORMACIÓN DE LA SESIÓN
        System.out.println(user.getTipo());
        System.out.println(user.getDni());
        System.out.println(user.getNombre());
        System.out.println(user.getCorreo());
        System.out.println(user.getClave());
        System.out.println(user.getTelefono());
        }
        // DEVOLVER EL OBJETO DEL USUARIO LOGEADO CON TODA SU INFORMACIÓN
        BaseDatos.user = user;
        return user;
        
    }
    
    
    
    
    
    /** 
     * @param email
     * @param clave
     * @return boolean
     */
    // COMPROBAR SI EXISTE EL USUARIO Y, EN ESE CASO, COMPROBAR QUE LA CONTRASEÑA ES CORRECTA
    public static boolean comprobarUsuario(String email, String clave){  
        
        // SE BUSCA SI EXISTE Y GUARDO LA INFORMACIÓN
        int resultadoBusqueda[] = busquedaUsuario(email);
        tipoUsuario = resultadoBusqueda[0];
        posicionArrayList = resultadoBusqueda[1];
        
        
        // SI HA ENCONTRADO AL USUARIO
        if (tipoUsuario != -1 && posicionArrayList != -1){
            
            // SI LA CLAVE ES CORRECTA
            if (claveCorrecta(tipoUsuario, posicionArrayList, clave)){
                
                // DEVOLVER VERDADERO
                return true;
            }
            
            // SI NO
            else{
                
                // DEVOLVER FALSO Y COLOCAR -1 EN LAS VARIABLES PARA INDICAR ERROR
                tipoUsuario = -1;
                posicionArrayList = -1;
                return false;
            }
        }
        
        // SI NO SE HA ENCONTRADO AL USUARIO
        else{
            
            // DEVOLVER FALSO
            return false;
        }
    }
    
    
    
    
    /** 
     * @param email
     * @return int[]
     */
    // BUSCA SI EXISTE EL USUARIO EN LA "BASE DE DATOS"
    public static int[] busquedaUsuario(String email){
        
        // SE INICIALIZAN VARIABLES LOCALES A -1 POR DEFECTO
        int tipoUsuario = -1;
        int posicionArrayList = -1;
        
        // PRIMERO BUSCA SI ES UN PARTICULAR, ITERANDO LA LISTA DE PARTICULARES
        for (int i = 0; i < BaseDatos.particulares.size(); i++){
            Particular particular = BaseDatos.particulares.get(i);
            
            // SI ES UN PARTICULAR:
            if (email.equals(particular.getCorreo())){
                
                // TIPO USUARIO ES 1 (TIPO PARTICULAR) Y GUARDA LA POSICIÓN EN EL ARRAYLIST DE ESE PARTICULAR
                tipoUsuario = 1;
                posicionArrayList = i;
                break;
            }
        }
        
        // SI NO ES PARTICULAR BUSCA SI ESTÁ EN LA LISTA DE ANFITIRONES
        for (int i = 0; i < BaseDatos.anfitriones.size(); i++){
            Anfitrion anfitrion = BaseDatos.anfitriones.get(i);
            
            // SI ES ANFITRIÓN:
            if (email.equals(anfitrion.getCorreo())){
                
                // TIPO DE USUARIO ES 2 (TIPO ANFITRIÓN) Y GUARDA LA POSICIÓN EN EL ARRAYLIST DE ESE ANFITRIÓN
                tipoUsuario = 2;
                posicionArrayList = i;
                break;
            }
        }
        
        // GUARDA EL RESULADO DE LA BÚSQUEDA EN UN ARRAY Y LO DEVUELVE PARA SER TRATADO DESPUÉS
        int resultado[] = {tipoUsuario, posicionArrayList};
        return resultado;
    }
    
    
    
    
    
    
    /** 
     * @param tipoUsuario
     * @param posicionArrayList
     * @param clave
     * @return boolean
     */
    // COMPROBAR SI LA CLAVE ES CORRECTA
    public static boolean claveCorrecta(int tipoUsuario, int posicionArrayList, String clave){
        
        // POR DEFECTO SE DA POR HECHO QUE NO ES CORRECTA
        boolean esCorrecta = false;
        
        // SI ES UN USUARIO BUSCAR EN EL ARRAYLIST DE USUARIOS
        if(tipoUsuario == 1){
            
            // CREAR UN OBJETO PARTICULAR TEMPORAL EN EL QUE GUARDAR LA INFO DE LA ITERACIÓN ACTUAL
            Particular particular = BaseDatos.particulares.get(posicionArrayList);
            
            // SI LA CLAVE INTRODUCIDA COINCIDE CON LA CLAVE GUARDADA
            if (clave.equals(particular.getClave())){
                
                // CAMBIAR ESCORRECTA A TRUE
                esCorrecta = true;
            }
        }
        
        // SI ES UN ANFITRIÓN BUSCAR EN EL ARRAYLIST DE ANFITRIONES
        if(tipoUsuario == 2){
            
            // CREAR UN OBJETO TEMPORAL EN EL QUE GUARDAR LA INFO DE LA ITERACIÓN ACTUAL
            Anfitrion anfitrion = BaseDatos.anfitriones.get(posicionArrayList);
            
            // SI LA CLAVE INTRODUCIDA COINCIDE CON LA CLAVE GUARDADA
            if (clave.equals(anfitrion.getClave())){
                
                // CAMBIAR ESCORRECTA A TRUE
                esCorrecta = true;
            }
        }
        
        // DEVOLVER EL RESULTADO
        return esCorrecta;
    }
}
