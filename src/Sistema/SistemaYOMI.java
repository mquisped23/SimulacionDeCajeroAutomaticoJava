
package Sistema;

import javax.swing.JOptionPane;


public class SistemaYOMI  implements Runnable{
    //--VARIABLES INICIALES--//
    public static  double saldoActual;
    //------------------------//
    
    
    //Constructor
    public SistemaYOMI(){
        saldoActual= 10000;
    }
    
    //Metodos
    public synchronized void  depositar(double deposito){
        saldoActual += deposito; 
        
    }
    
    
    public synchronized   void retirar(double retiro){
        if(saldoActual >= retiro){
            saldoActual -= retiro;
        }else{
            JOptionPane.showMessageDialog(null, "[Error] -Saldo Insuficiente");
        }
    }
    
    public synchronized double obtenerSaldo(){
        return saldoActual;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
