/*
 */
package conjuntostotal;
import javax.swing.*;
/**
 
 */
public class ConjuntosTotal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
       ConjuntosVector CVa, Universal;
       
       int Tamanio, numcod; 
       String Dato ;
       Tamanio = 27;
       Universal = new ConjuntosVector(Tamanio);
       for(int i = 0;i < 26;i++){
               
            numcod=97+i;
            String Posicion = "";
            Universal.Almacenar(Posicion, (char)numcod);
               
       }  
       Universal.MostrarVector();
       
       Tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector"));
       CVa = new ConjuntosVector(Tamanio);
        
       String menu="*MENU* \n PARA CONJUNTOS EN VECTOR \n 1. Mostrar\n 2. Insertar al Final \n 3. Cantidad Elementos (Longitud Vector)"
               + "\n 4. Buscar char de Lista en Vector \n 5. \n 6. "
               + "\n 7.  \n PARA  \n 8.  \n 9. I"
               + "\n 10. r \n 11.  \n 12. Salir"
               + "  Digite Una Opción";
       int opcion;
       char d,r;
       
       do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu)); 
        switch(opcion)
        {
            case 1: CVa.MostrarVector(); 
            break;
            
            case 2: String Posicion = "";
                    
                    //Posicion = JOptionPane.showInputDialog("Si desea ingrese una posicion");
                    
                    Dato = JOptionPane.showInputDialog("Ingrese el dato por favor");
                    CVa.Almacenar(Posicion, Dato.charAt(0));
            break;
            
            case 3: JOptionPane.showMessageDialog(null,"Longitud del vector es "+CVa.Longitud());
            break;
            
            case 4: //CVa.RepeticionesChar(CLa); 
            break;
            
            case 5: 
                    
            break;  
            
            case 6: 
            break;  
            
            case 7: 
            break;
            
            case 8: 
            break;
            
            case 9: 
            break;
            
            case 10: 
            break;
            
            case 11: 
            break;  
                    
                  
                    
            case 12: System.exit(0); 
            break;
            
            default:JOptionPane.showMessageDialog(null,"Opción no válida");
                  
        }//Fin Switch
        
       }while(opcion!=12);//Fin Do while
        
    }
    
}
