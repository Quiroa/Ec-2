/*
Grupo 2
Integrantes:
    Sofia Campos
    Arodi Sandobal
    Benjamin Samagoa
    Benjamin
    José Quiroa
 */
package poo.pkg3;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class DD extends Applet {
    
    String tmp,nom="N/A";
    int op,i,j;
    int[] n = new int [5];
    
    public void init() {
        do{
            tmp=JOptionPane.showInputDialog("      Menu del Disco\n\n"
                                          + "1 - Ingresar datos\n"
                                          + "2 - Modificar datos\n"
                                          + "3 - Eliminar datos\n"
                                          + "4 - Formatear disco\n"
                                          + "5 - Salir\n\n");
            op=Integer.parseInt(tmp);
            switch(op){
                case 1:
                    in();
                break;
                case 2:
                    if (nom=="N/A"){
                        JOptionPane.showMessageDialog(null,"Actualmente la base de datos\n"
                                                         + "esta vacia.");
                    }
                    else{
                        mo();
                    }
                break;
                case 3:
                    el();
                break;
                case 4:
                    fo();
                break;
                case 5:
                break;
                default:
                    non();
                break;
            }
        }while (op!=5);
        JOptionPane.showMessageDialog(null,"Gracias por visitarnos\n"
                                         + "Esperamos que vuelva pronto\n\n");
        System.exit(0);
    }
    
    public void in(){
        do{
            nom=JOptionPane.showInputDialog("Ingrese el nombre del alumno\n\n");
            do{
                tmp=JOptionPane.showInputDialog("¿Esta realmente segur@ de que desea gravar\n"
                                              + "el nombre del estudiante como \""+nom+"\"?\n\n"
                                              + "1 - Si, estoy segur@\n"
                                              + "2 - No, deseo cambiarlo\n\n");
                j=Integer.parseInt(tmp);
                switch(j){
                    case 1:
                    break;
                    case 2:
                    break;
                    default:
                        non();
                    break;
                }
            }while(j<1 || j>2);
        }while(j!=1);
        for (i=0;i<5;i++){
            j=i+1;
            do{
                tmp=JOptionPane.showInputDialog("Ingrese la nota  "+j+"/5\n\n");
                n[i]=Integer.parseInt(tmp);
                if (n[i]<0){
                    JOptionPane.showMessageDialog(null,"La nota ingresada no es valida.\n"
                                                     + "Porfavor ingrese una nota positiva.\n\n");
                }
            }while (n[i]<0);
        }
        
    }
    
    public void mo(){
        
    }
    
    public void el(){
        
    }
    
    public void fo(){
        
    }
    
    public void non(){
        JOptionPane.showMessageDialog(null,"Opcion invalida.\n"
                                         + "Porfavor seleccione otra opcion\n\n");
    }
}
