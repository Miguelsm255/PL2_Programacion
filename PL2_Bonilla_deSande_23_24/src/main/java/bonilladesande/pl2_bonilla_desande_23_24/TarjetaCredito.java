package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class TarjetaCredito {
    
    // ATRIBUTOS
    
    private String titular;
    private int numero;
    private LocalDate caducidad;
    private int cvv;

    
    
    // GETTER Y SETTER
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    
    // CONSTRUCTOR
    
    public TarjetaCredito(String titular, int numero, LocalDate caducidad, int cvv) {
        this.titular = titular;
        this.numero = numero;
        this.caducidad = caducidad;
        this.cvv = cvv;
    }
    
}