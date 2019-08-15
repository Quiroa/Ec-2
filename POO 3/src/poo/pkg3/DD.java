/*
Grupo 2
Integrantes:
    Sofia Campos
    Arodi Sandobal
    Benjamin Samayoa
    Benjamin
    José Quiroa
 */
package poo.pkg3;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class DD extends Applet { //Clase: DD
    //Objeto: Disco duro
    /*
    Atributos:
        Disco duro:
            informacion de alumno:
                notas del alumno n1,n2,n3,n4,n5
                nombre del alumno
    
    Metodos:
        Disco duro:
            Ingresar informacion
            Modificar informacion
            Mostrar informacion
            Eliminar informacion (en espesifico)
            Eliminar informacion / formatear (en general)
    */
    
    String tmp,nom="N/A"; //Instanciacion del atributo "nom = (Nombre del alumno)"
    int op,i,j;
    boolean c=false;
    int[] n = new int [5]; //Instanciacion del atributo "n[] = (notas del alumno)"
    
    public void init() { //Funcion principal; Tipo de encapsulamiento del metodo "Public"
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
                    in(); //Llamado al metodo in
                    JOptionPane.showMessageDialog(null,"El ingreso de datos a finalizado con exito\n\n");
                break;
                case 2:
                    if (!c){
                        JOptionPane.showMessageDialog(null,"Actualmente la base de datos\n"
                                                         + "esta vacia.");
                    }
                    else{
                        mo(); //Llamado al metodo mo
                        JOptionPane.showMessageDialog(null,"La modificacion de datos a finalizado exitosamente\n\n");
                    }
                break;
                case 3:
                    ms(); //Llamado al metodo ms
                break;
                case 4:
                    el(); //Llamado al metodo el
                    JOptionPane.showMessageDialog(null,"La eliminacion de datos a finalizado exitosamente\n\n");
                break;
                case 5:
                    fo(); //Llamado al metodo fo
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
    
    public void in(){ //Metodo in; Tipo de encapsulamiento del metodo "Public"
        nn(); //Llamado al metodo nn
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
    
    public void mo(){ //Metodo mo; Tipo de encapsulamiento del metodo "Public"
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
                   nn(); //Llamado al sub-metodo nn
               break;
               case 1:
                   nv(0); //Llamado al sub-metodo nv
               break;
               case 2:
                   nv(1); //Llamado al sub-metodo nv
               break;
               case 3:
                   nv(2); //Llamado al sub-metodo nv
               break;
               case 4:
                   nv(3); //Llamado al sub-metodo nv
               break;
               case 5:
                   nv(4); //Llamado al sub-metodo nv
               break;
               default:
                   non();
               break;
           }
        }while(j<0 || j>5);
    }
    
    public void nn(){ //Sub-Metodo nn; Tipo de encapsulamiento del sub-metodo "Public"
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
    
    public void nv(int h){ //Sub-Metodo nv; Tipo de encapsulamiento del sub-metodo "Public"
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
    
    public void ms(){ //Metodo ms; Tipo de encapsulamiento del metodo "Public"
        JOptionPane.showMessageDialog(null,"Datos del alumno:\n"
                                         + "    Nombre: "+nom+"\n"
                                         + "    Nota 1: "+n[0]+"\n"
                                         + "    Nota 2: "+n[1]+"\n"
                                         + "    Nota 3: "+n[2]+"\n"
                                         + "    Nota 4: "+n[3]+"\n"
                                         + "    Nota 5: "+n[4]+"\n");
    }
    
    public void el(){ //Metodo el; Tipo de encapsulamiento del metodo "Public"
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
    
    public void fo(){ //Metodo fo; Tipo de encapsulamiento del metodo "Public"
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
