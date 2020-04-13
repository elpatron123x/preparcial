
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANTONIO
 */
public class ControlGastos {

    public Gastos gastos[];

    public ControlGastos() {

        gastos = new Gastos[Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño"))];
        
    }

    public Gastos[] getGastos() {
        return gastos;
    }

    public void setGastos(Gastos[] gastos) {
        this.gastos = gastos;
    }

    
    public void llenar(){
    for (int i = 0; i < gastos.length; i++) {
            gastos[i]=new Gastos(ThreadLocalRandom.current().nextInt(10000, 20000),ThreadLocalRandom.current().nextInt(10000, 20000),ThreadLocalRandom.current().nextInt(10000, 20000),ThreadLocalRandom.current().nextInt(10000, 20000));
            
        }
    
    }
    public Integer gastosComida() {

        Integer gastosdComida = 0;
        for (int i = 0; i < gastos.length; i++) {

            gastosdComida = gastos[i].getGastosComida() + gastosdComida;

        }
        return gastosdComida;

    }

    public void gastoMasCostoso() {
        ArrayList<Integer> gastosCompras=new ArrayList();
        Integer gastosdComida = gastosComida();
        Integer gastosHospedaje = 0;
        Integer gastosTransporte = 0;
        Integer gastosRopa = 0;
        
            
        
        for (int i = 0; i < gastos.length; i++) {
          
            gastosHospedaje = gastos[i].getGastosHospedaje()+gastosHospedaje;
            gastosTransporte = gastos[i].getGastosTransporte() + gastosTransporte;
            gastosRopa = gastos[i].getGastosRopa() + gastosRopa;

        }
     gastosCompras.add(gastosdComida); 
      gastosCompras.add(gastosHospedaje); 
       gastosCompras.add(gastosTransporte); 
        gastosCompras.add(gastosRopa); 
     
      Integer gastoMayor=0;
        for (int i = 0; i < gastosCompras.size(); i++) {
            if (gastoMayor<gastosCompras.get(i)) {
                gastoMayor=gastosCompras.get(i);
                
                
                
            }
         }
        if(gastoMayor==gastosdComida){
            System.out.println("El gasto mayor es de comida");
        
        } else if (gastoMayor==gastosHospedaje) {
            System.out.println("El gasto mayor es de hospedaje");
            
        } else if (gastoMayor==gastosTransporte) {
            System.out.println("El gasto mayor es de transporte");
        } else System.out.println("El gasto mayor es de ropa");
  }
    public static void main(String[] args) {
        ControlGastos c=new ControlGastos();
        c.llenar();
        System.out.println("El gasto en comida fue : "+c.gastosComida());
        c.gastoMasCostoso();
    }
}
