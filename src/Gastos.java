/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANTONIO
 */
public class Gastos {
    private  Integer gastosComida;
    private  Integer gastosHospedaje;
    private  Integer gastosTransporte;
    private Integer  gastosRopa;
    private Integer gastosTotales;

    public Gastos(Integer gastosComida, Integer gastosHospedaje, Integer gastosTransporte, Integer gastosRopa) {
        this.gastosComida = gastosComida;
        this.gastosHospedaje = gastosHospedaje;
        this.gastosTransporte = gastosTransporte;
        this.gastosRopa = gastosRopa;
        this.gastosTotales=gastosTotales();
    }

    public Integer getGastosComida() {
        return gastosComida;
    }

    public void setGastosComida(Integer gastosComida) {
        this.gastosComida = gastosComida;
    }

    public Integer getGastosHospedaje() {
        return gastosHospedaje;
    }

    public void setGastosHospedaje(Integer gastosHospedaje) {
        this.gastosHospedaje = gastosHospedaje;
    }

    public Integer getGastosTransporte() {
        return gastosTransporte;
    }

    public void setGastosTransporte(Integer gastosTransporte) {
        this.gastosTransporte = gastosTransporte;
    }

    public Integer getGastosRopa() {
        return gastosRopa;
    }

    public void setGastosRopa(Integer gastosRopa) {
        this.gastosRopa = gastosRopa;
    }
    
    public Integer gastosTotales(){
        Integer gastosTotales=0;
        gastosTotales=getGastosComida()+getGastosHospedaje()+getGastosRopa()+getGastosTransporte();
        return gastosTotales;
    }
    
    
    
                
    
}    
