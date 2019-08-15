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
    boolean c=false;
    int[] n = new int [5];
    
    public void init() {
        do{
            tmp=JOptionPane.showInputDialog("      Menu del Disco\n\n"
                                          + "1 - Ingresar datos\n"
                                          + "2 - Modificar datos\n"
                                          + "3 - Mostrar datos\n"
                                          + "4 - Eliminar datos\n"
                                          + "5 - Formatear disco\n"
                                          + "6 - Salir\n\n");
            op=Integer.parseInt(tmp);
            switch(op){
                case 1:
                    in();
                    JOptionPane.showMessageDialog(null,"El ingreso de datos a finalizado con exito\n\n");
                break;
                case 2:
                    if (!c){
                        JOptionPane.showMessageDialog(null,"Actualmente la base de datos\n"
                                                         + "esta vacia.");
                    }
                    else{
                        mo();
                        JOptionPane.showMessageDialog(null,"La modificacion de datos a finalizado exitosamente\n\n");
                    }
                break;
                case 3:
                    ms();
                break;
                case 4:
                    el();
                    JOptionPane.showMessageDialog(null,"La eliminacion de datos a finalizado exitosamente\n\n");
                break;
                case 5:
                    fo();
                    JOptionPane.showMessageDialog(null,"El formateo del disco a finalizado exitosamente\n\n");
                break;
                case 6:
                break;
                default:
                    non();
                break;
            }
        }while (op!=6);
        JOptionPane.showMessageDialog(null,"Gracias por visitarnos\n"
                                         + "Esperamos que vuelva pronto\n\n");
        System.exit(0);
    }
    
    public void in(){
        nn();
        for (i=0;i<5;i++){
            j=i+1;
            do{
                tmp=JOptionPane.showInputDialog("Ingrese la nota  "+j+"/5\n\n");
                n[i]=Integer.parseInt(tmp);
                if (n[i]<0 || n[i]>100){
                    JOptionPane.showMessageDialog(null,"La nota "+n[i]+" no es valida.\n"
                                                     + "Porfavor ingrese una nota\n"
                                                     + "entre 0 y 100");
                }
            }while (n[i]<0 || n[i]>100);
        }
        c=true;
    }
    
    public void mo(){
        do{
           tmp=JOptionPane.showInputDialog("Datos para editar:\n"
                                         + "0 - Nombre:"+nom+"\n"
                                         + "1 - Nota1: "+n[0]+"\n"
                                         + "2 - Nota2: "+n[1]+"\n"
                                         + "3 - Nota3: "+n[2]+"\n"
                                         + "4 - Nota4: "+n[3]+"\n"
                                         + "5 - Nota5: "+n[4]+"\n\n");
           j=Integer.parseInt(tmp);
           switch(j){
               case 0:
                   nn();
               break;
               case 1:
                   nv(0);
               break;
               case 2:
                   nv(1);
               break;
               case 3:
                   nv(2);
               break;
               case 4:
                   nv(3);
               break;
               case 5:
                   nv(4);
               break;
               default:
                   non();
               break;
           }
        }while(j<0 || j>5);
    }
    
    public void nn(){
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
    }
    
    public void nv(int h){
        do{
            i=h+1;
            tmp=JOptionPane.showInputDialog("Ingrese la nueva nota "+i+"");
            n[h]=Integer.parseInt(tmp);
            if (n[h]<0 || n[h]>100){
                JOptionPane.showMessageDialog(null,"La nota "+n[h]+" no es valida.\n"
                                                 + "Porfavor ingrese una nota\n"
                                                 + "entre 0 y 100");
            }
        }while(n[h]<0 || n[h]>100);
    }
    
    public void ms(){
        JOptionPane.showMessageDialog(null,"Datos del alumno:\n"
                                         + "    Nombre: "+nom+"\n"
                                         + "    Nota 1: "+n[0]+"\n"
                                         + "    Nota 2: "+n[1]+"\n"
                                         + "    Nota 3: "+n[2]+"\n"
                                         + "    Nota 4: "+n[3]+"\n"
                                         + "    Nota 5: "+n[4]+"\n");
    }
    
    public void el(){
        do{
           tmp=JOptionPane.showInputDialog("Datos para eliminar:\n"
                                         + "0 - Nombre:"+nom+"\n"
                                         + "1 - Nota1: "+n[0]+"\n"
                                         + "2 - Nota2: "+n[1]+"\n"
                                         + "3 - Nota3: "+n[2]+"\n"
                                         + "4 - Nota4: "+n[3]+"\n"
                                         + "5 - Nota5: "+n[4]+"\n\n");
           j=Integer.parseInt(tmp);
           switch(j){
               case 0:
                   nom="N/A";
               break;
               case 1:
                   n[0]=0;
               break;
               case 2:
                   n[1]=0;
               break;
               case 3:
                   n[2]=0;
               break;
               case 4:
                   n[3]=0;
               break;
               case 5:
                   n[4]=0;
               break;
               default:
                   non();
               break;
           }
        }while(j<0 || j>5);
    }
    
    public void fo(){
        do{
            tmp=JOptionPane.showInputDialog("¿Realmente esta seguro de que desea formatear\n"
                                          + "la informacion actual del disco?\n\n"
                                          + "       ¡TODOS LOS DATOS SE PERDERAN!\n\n"
                                          + "1 - Si, estoy segur@\n"
                                          + "2 - No, canselar operacion\n\n");
            j=Integer.parseInt(tmp);
            switch(j){
                case 1:
                    nom="N/A";
                    for (i=0;i<5;i++){
                        n[i]=0;
                    }
                    c=false;
                break;
                case 2:
                break;
                default:
                    non();
                break;
            }
        }while(j!=1 && j!=2);
    }
    
    public void non(){
        JOptionPane.showMessageDialog(null,"Opcion invalida.\n"
                                         + "Porfavor seleccione otra opcion\n\n");
    }
}
