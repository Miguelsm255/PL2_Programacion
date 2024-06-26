/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.File;
import javax.swing.filechooser.FileFilter;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FiltraImagenes extends FileFilter {
    //ESTABLECE LOS ÚNICOS TIPOS DE ARCHIVOS CON LOS QUE SE PUEDEN MANEJAR LAS IMÁGENES EN LA APLICACIÓN.
    public final static String JPEG = "jpeg";
    public final static String JPG = "jpg";
    public final static String GIF = "gif";
    public final static String TIFF = "tiff";
    public final static String TIF = "tif";
    public final static String PNG = "png";

    
    /** 
     * @param f
     * @return boolean
     */
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        
        String extension = getExtension(f);
        if (extension != null) {
            if (extension.equals(TIFF)
                    || extension.equals(TIF)
                    || extension.equals(GIF)
                    || extension.equals(JPEG)
                    || extension.equals(JPG)
                    || extension.equals(PNG)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    
    /** 
     * @return String
     */
    //AL BUSCAR, TE APARECE EL TEXTO "Seleccione la foto.".
    @Override
    public String getDescription() {
        return "Seleccione la foto.";
    }

    
    /** 
     * @param f
     * @return String
     */
    String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        
        //BUSCA EL ÚLTIMO PUNTO DEL ARCHIVO
        int i = s.lastIndexOf('.');
        
        //COGE LO QUE VA DESPUÉS DEL PUNTO EN EL ARCHIVO SELECCIONADO Y LO CONVIERTE A MINÚSCULAS, PARA DETECTAR LA EXTENSIÓN DEL ARCHIVO.
        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }
}
