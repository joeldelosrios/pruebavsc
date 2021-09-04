/*

 */
package conjuntostotal;
import javax.swing.*;
/**

 */
public class ConjuntosVector {
    
  int Tamanio;
  char VectorCadena[];
    
    public ConjuntosVector(int Longitud){  
        this.Tamanio = Longitud;
        this.VectorCadena = new char[Tamanio];
        this.VectorCadena[0] = '\n';
    }
    
    //public char getDato (String Posicion)
    
    public void Almacenar(String Posicion, char Dato){
        
        if(Posicion.equals("")){
            //Hiteramos el El array para verificar si tiene espacios disponibles
            for(int i = 0;i < this.Tamanio;i++){
                if(i < Tamanio + 1){
                    if(this.VectorCadena[i] == '\n'){
                        this.VectorCadena[i] = Dato;
                        this.VectorCadena[i+1] = '\n';
                        break;   
                    }
                }
                else {
                    JOptionPane.showConfirmDialog(null, "El vector ya se encuentra lleno");
                }
            }
        }
        else{
            
            if(Integer.parseInt(Posicion) > this.Tamanio){
        
                JOptionPane.showMessageDialog(null, "La posicion ingresada es mayor al tamaño del vector");
            }
            else if(Integer.parseInt(Posicion) < 0){
                JOptionPane.showMessageDialog(null, "La posicion ingresada no puede ser negativa");
            }
            else{
                
                if(Integer.parseInt(Posicion) < this.Tamanio - 1){
                    
                    if(this.VectorCadena[Integer.parseInt(Posicion)] == '\n'){
                        
                        this.VectorCadena[Integer.parseInt(Posicion)] = Dato;
                        this.VectorCadena[Integer.parseInt(Posicion)+1] = '\n';
                        
                        //Verificamos donde poner el tope
                        /*int ContadorTope = 0;
                        
                        for(int i = 0; i < this.Tamanio; i++){
                            if(this.VectorCadena[i] != '\n'){
                                ContadorTope++;
                            }
                            
                            if(ContadorTope <= this.Tamanio - 1){
                                this.VectorCadena[ContadorTope] = '\n';
                            }
                        }
                        */
                    }
                    else{
                        
                        //Consultamos el top
                        int Tope = 0;
                        
                        for(int i = 0;i < this.Tamanio;i++){
                            if(this.VectorCadena[i] == '\n'){
                                Tope = i;
                            }
                        }
                        
                        for(int i = Tope;i >= Integer.parseInt(Posicion);i--){
                            this.VectorCadena[i+1] = this.VectorCadena[i];
                        }
                        
                        this.VectorCadena[Integer.parseInt(Posicion)] = Dato;
                        
                        //Verificamos donde poner el tope
                        int ContadorTope = 0;
                        
                        for(int i = 0; i < this.Tamanio; i++){
                            if(this.VectorCadena[i] != '\n'){
                                ContadorTope = i + 1;
                            }
                            
                            if(ContadorTope <= this.Tamanio - 1){
                                this.VectorCadena[ContadorTope] = '\n';
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void MostrarVector(){
        

        String Resultado = "";
        
        //Verificamos donde poner el tope
       int ContadorTope = 0;

       for(int i = 0; i < this.Tamanio; i++){
           if(this.VectorCadena[i] != '\n'){
               ContadorTope = i + 1;
           }

           /*if(ContadorTope <= this.Tamanio - 1){
               this.VectorCadena[ContadorTope] = '\n';
           }*/
       }
       
        /*if(ContadorTope <= 0){
            JOptionPane.showMessageDialog(null, "El array se encuentra vacio");
        }
        else{*/
        if(this.VectorCadena[0]=='\n')
                    JOptionPane.showMessageDialog(null, "Vector Vacío");
        else
            for(int i = 0;i < this.Tamanio;i++){
                //Resultado = Resultado+this.VectorCadena[i];
                if(this.VectorCadena[i]!='\n')
                        JOptionPane.showMessageDialog(null, this.VectorCadena[i]);
                    else
                        break;
            }
            
            //JOptionPane.showMessageDialog(null, Resultado);
        //}
        
        
    }
    
    public int Longitud() {
        int longi=0;
        for(int i = 0;i < this.Tamanio;i++){
                //Resultado = Resultado+this.VectorCadena[i];
                if(this.VectorCadena[i]!='\n')
                    longi++;
                else
                    break;
        }  
        return longi;       
    }
    
    
    /*public void RepeticionesChar(ListaCad A){
        
        NodoCad P = A.getCabeza();
        
        if(P==null)
            JOptionPane.showMessageDialog(null, "La lista no tiene datos para buscar");
        else
            if(this.Longitud()==0)
                JOptionPane.showMessageDialog(null, "El Vector no tiene datos");
            else
                while(P!=null){
                    int ContadorRepeticiones=0;
                    for(int i = 0;i < this.Longitud();i++){
                        if(P.getDato()==this.VectorCadena[i])
                            ContadorRepeticiones++;
                    } 
                JOptionPane.showMessageDialog(null, "El caracter "+P.getDato()+" se repite "+ContadorRepeticiones+" veces");
                P=P.getLiga();
                }
        
    }  */
    
    
}
