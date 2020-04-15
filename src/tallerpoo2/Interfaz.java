/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo2;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.scene.layout.Border;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;

public class Interfaz  extends JFrame implements ActionListener {
    int cot1=0 ,cot2=0 ,cot3=0,cot4=0,cot5=0,cot6=0,cot7=0,cot8=0,cot9=0,cot0=0;
     int co1=30 ,co2=50 ,co3=70,co4=20,co5=10,co6=30,co7=50,co8=10,co9=50,co0=70;
     JPanel p1,p2,p3;
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b,bv,bt;
     JTextField t1;
     JLabel l,l1,l2;
     public  Interfaz(){
         setTitle("PELIS");
           setBounds(500, 200, 2000, 370);
           setLocationRelativeTo(null);
            setLayout(new BorderLayout());
               p1=new JPanel();
               l=new JLabel("click para ver sus datos");
               p1.setLayout(new GridLayout(3,3,8,8));
               p1.setBackground(Color.white);
               b1=new JButton("1.Bad Boys ");
               b2=new JButton("2.Roma");
               b3=new JButton("3.Inquebrantable");
               b4=new JButton("4.El triunfo del espíritu");
               b5=new JButton("5.Siempre a tu lado");
               b6=new JButton("6.kill bill ");
               b7=new JButton("7.REC");
               b8=new JButton("8.John Wick");
               b9=new JButton("9.Deadpool 2");
               b0=new JButton("10.Bastardos sin gloria");
           
               p1.add(l);
               p1.add(b1);
               p1.add(b2);
               p1.add(b3); 
               p1.add(b4);
               p1.add(b5);
               p1.add(b6);
               p1.add(b7);
               p1.add(b8);
               p1.add(b9);
               p1.add(b0);
                add(p1,BorderLayout.NORTH);
               p2=new JPanel();
               p2.setLayout(new FlowLayout());
               l1=new JLabel("escoja la opcion de pelicula del 1 al 10 para ver la cantidad de etiquetas vendidas");
               t1=new JTextField(40);
               b=new JButton("Comprar entradas");
               p2.add(l1);
               p2.add(t1);
               p2.add(b);
               p2.setBackground(Color.CYAN);
                 add(p2,BorderLayout.AFTER_LINE_ENDS);
                p3=new JPanel();
              l2=new JLabel();
              ImageIcon img=new ImageIcon("detallez.jpg");
              l2.setIcon(new ImageIcon(img.getImage().getScaledInstance(100, 200,50)));
                bv=new JButton("ver entrada disponibles ");
                bt=new JButton("total de entradas vendidas");
                p3.add(bv);
                p3.add(bt);
                p3.add(l2);
                  p3.setBackground(Color.blue);
                add(p3);
                     b1.addActionListener(this);
                     b2.addActionListener(this);
                     b3.addActionListener(this);
                      b4.addActionListener(this);
                     b5.addActionListener(this);
                     b6.addActionListener(this);
                      b7.addActionListener(this);
                     b8.addActionListener(this);
                     b9.addActionListener(this);
                      b0.addActionListener(this);
                      b.addActionListener(this);
                     bv.addActionListener(this);
                      bt.addActionListener(this);
                   setVisible(true);
    
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String > listaaut=new ArrayList<>();
         ArrayList<String > nom=new ArrayList<>();
        ArrayList<Integer> listan=new ArrayList<>();
         ArrayList<Integer> lista=new ArrayList<>();
         listaaut.add("Ian Lewis");              listan.add(1987);        nom.add("Bad Boys ");                                 lista.add(0);
         listaaut.add("Alfonso Cuarón");         listan.add(2018);         nom.add("Roma ");                                    lista.add(0);
         listaaut.add("Laura Hillenbrand");      listan.add(2014);         nom.add("Inquebrantable ");                           lista.add(0);
         listaaut.add("Stephen Hopkins");        listan.add(2016);           nom.add("El triunfo del espíritu ");                 lista.add(0);
         listaaut.add("Lasse Hallstrom");        listan.add(2009);           nom.add("Siempre a tu lado ");                      lista.add(0);
         listaaut.add("EL Quentin Tarantino");   listan.add(2003);           nom.add("kill bill ");                               lista.add(0);
         listaaut.add("Jaume Balaguero");              listan.add(2007);    nom.add("REC ");                                      lista.add(0);
         listaaut.add("Davud Leicth y Chad Stahelski"); listan.add(2014);    nom.add(" John Wick");                                 lista.add(0);
         listaaut.add("Davud Leicth");              listan.add(2018);          nom.add("Deadpool 2");                              lista.add(0);
         listaaut.add("EL Quentin Tarantino");               listan.add(2009);  nom.add("Bastardos sin gloria ");                   lista.add(0);
        
        if(e.getActionCommand().equals("2.Roma")){
            String autor=listaaut.get(1);
            int an=listan.get(1);
             JOptionPane.showMessageDialog(null, 
            "eel directo es :"+autor+ " y el año de emision es:"+an+
          "En la colonia Roma, de Ciudad de México, dos empleadas domésticas ayudan a una madre a criar a sus cuatro hijos durante las largas ausencias de su esposo.\n" +
" Una de las jóvenes, Cleo, se hace cargo de los niños como si fueran propios, a pesar de estar atravesando un momento difícil.");
     }else if(e.getActionCommand().equals("1.Bad Boys ")){
           String autor=listaaut.get(0);
            int an=listan.get(0);
            JOptionPane.showMessageDialog(null,
                      "el director es:"+autor+ "\n y el año de emision es:"+an+"\n"+
          "  Los policías de la vieja escuela Mike Lowery y Marcus Burnett vuelven a patrullar juntos para derrotar al líder vicioso de un cartel de drogas de Miami.\n" +
" El recién creado equipo de élite AMMO del departamento de policía de Miami junto con Mike y Marcus se enfrentan al despiadado Armando Armas."
             );
     }else if(e.getActionCommand().equals("3.Inquebrantable")){
          String autor=listaaut.get(2);
            int an=listan.get(2);
         JOptionPane.showMessageDialog(null,
                 "la directora es:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "Durante la Segunda Guerra Mundial, "
                 + "el olímpico y héroe de guerra Louis Zamperini sobrevive 47 días en el mar en una balsa,\n"
                 + " solo para ser capturado por la armada japonesa y ser enviado a un campo de prisioneros.");
     }else if(e.getActionCommand().equals("4.El triunfo del espíritu")){
           String autor=listaaut.get(3);
            int an=listan.get(3);
         JOptionPane.showMessageDialog(null,
                "el director es:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "Historia del atleta James Cleveland \"Jesse\" Owens, el coloso de la velocidad que saltó a la fama en los Juegos Olímpicos de Berlín de 1936,\n"
                         + " en pleno régimen nazista. Corrían los tiempos de la Gran Depresión americana y Jesse, además de estudiar y entrenar,\n"
                         + " lidiaba con el peso de las expectativas familiares,\n"
                         + " la tensión racial que se respiraba en la Universidad Estatal de Ohio y su propia competitividad.");
     }else if(e.getActionCommand().equals("5.Siempre a tu lado")){
          String autor=listaaut.get(4);
            int an=listan.get(4);
         JOptionPane.showMessageDialog(null,
        "el director es:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "Un perro fiel llamado Hachiko acompaña cada mañana a su amo a la estación de tren y regresa cada tarde para darle la bienvenida después del trabajo.\n"
                         + " Sin embargo, esta rutina se ve rota por una desgracia."
                       );
     }else if(e.getActionCommand().equals("6.kill bill ")){
            String autor=listaaut.get(5);
            int an=listan.get(5);
         JOptionPane.showMessageDialog(null,
       "el director es:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "Una asesina despierta de un coma y,\n"
                         + " tras descubrir que el hijo que llevaba en el vientre ya no está,\n"
                         + " decide salir a buscar a los criminales que la traicionaron."
                        
                       );
     }else if(e.getActionCommand().equals("7.REC")){
            String autor=listaaut.get(6);
            int an=listan.get(6);
         JOptionPane.showMessageDialog(null,
        "el director es:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "Una reportera y su camarógrafo graban la terrible epidemia de una enfermedad que transforma\n"
                         + " a los humanos en caníbales en un edificio de vecinos."
                   
                       );
     }else if(e.getActionCommand().equals("8.John Wick")){
           String autor=listaaut.get(7);
            int an=listan.get(7);
         JOptionPane.showMessageDialog(null,
             "los  directores son:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "John Wick es una franquicia estadounidense de thriller de acción creada por Derek Kolstad y propiedad de Summit Entertainment\n"
                         + ". Keanu Reeves interpreta a John Wick,\n"
                         + " un asesino a sueldo retirado que busca venganza\n"
                         + " por el asesinato del perro que le dio su esposa recientemente fallecida."
                       );
     }else if(e.getActionCommand().equals("9.Deadpool 2")){
             String autor=listaaut.get(8);
            int an=listan.get(8);
         JOptionPane.showMessageDialog(null,
       "el director es:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "Deadpool debe proteger a Russell, un adolescente mutante, de Cable\n"
                         + ", un soldado del futuro genéticamente modificado.\n"
                         + " Deadpool se alía con otros superhéroes para poder derrotar al poderoso Cable.\n"
                         
                       );
     }else if(e.getActionCommand().equals("10.Bastardos sin gloria")){
            String autor=listaaut.get(9);
            int an=listan.get(9);
         JOptionPane.showMessageDialog(null,
         "el director es:"+autor+ "\n y el año de emision es:"+an+"\n"+
                 "Es el primer año de la ocupación alemana de Francia. El oficial aliado,\n"
                         + " teniente Aldo Raine, ensambla un equipo de soldados judíos para cometer actos violentos en contra de los nazis\n"
                         + ", incluyendo la toma de cabelleras.\n"
                         + " Él y sus hombres unen fuerzas con Bridget von Hammersmark,\n"
                         + " una actriz alemana y agente encubierto, para derrocar a los líderes del Tercer Reich.\n"
                         + " Sus destinos convergen con la dueña de teatro Shosanna Dreyfus,\n"
                         + " quien busca vengar la ejecución de su familia."
                         
                       );
     }else if(e.getActionCommand().equals("Comprar entradas")){
     int dato=Integer.parseInt(t1.getText());
     
     if(dato==1){
     int cuan1=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
         cot1=cuan1+cot1;
        
    } else if(dato==2){
          int cuan2=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
         
         cot2=cot2+cuan2;
        
    } else if(dato==3){
          int cuan3=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
         
         cot3=cot3+cuan3;
         
    }else if(dato==4){
          int cuan4=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
          
         cot4=+cot4+cuan4;
      
           
    }else if(dato==5){
          int cuan5=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
       
         cot5=cot5+cuan5;
         
           
    }else
    if(dato==6){
          int cuan6=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
    
         cot6=cot6+cuan6;
         
    }else if(dato==7){
          int cuan7=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
          
         cot7=cot7+cuan7;
         
    }else if(dato==8){
          int cuan8=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
          
         cot8=cot8+cuan8;
       
    }else if(dato==9){
          int cuan9=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
      
         cot9=cot9+cuan9;
        
          
    }else
    if(dato==10){
          int cuan0=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de voletos que desea cimprar"));
         
         cot0=cot0+cuan0;
        
    } 

     } else if(e.getActionCommand().equals("total de entradas vendidas")){
            
          JOptionPane.showMessageDialog(null,nom.get(0)  +" ha vendido en total "+cot1+" etiquetas\n"+
            nom.get(1)  +" ha vendido en total "+cot2+" etiquetas\n"+
            nom.get(2)  +" ha vendido en total "+cot3+" etiquetas\n"+
           nom.get(3)  +" ha vendido en total "+cot4+" etiquetas\n" +
           nom.get(4)  +" ha vendido en total "+cot5+" etiquetas\n"+ 
           nom.get(5)  +" ha vendido en total "+cot6+" etiquetas\n" 
            +nom.get(6)  +" ha vendido en total "+cot7+" etiquetas\n"
           +nom.get(7)  +" ha vendido en total "+cot8+" etiquetas\n"
           +nom.get(8)  +" ha vendido en total "+cot9+" etiquetas\n"
            +nom.get(9)  +" ha vendido en total "+cot0+" etiquetas"
               );
            
     } else if(e.getActionCommand().equals("ver entrada disponibles ")){
         co1=co1-cot1;
         co2=co2-cot2;
         co3=co3-cot3;
         co4=co4-cot4;
         co5=co5-cot5;
         co6=co6-cot6;
         co6=co6-cot6;
         co7=co7-cot7;
         co8=co8-cot8;
         co9=co9-cot9;
         co0=co0-cot0;
         JOptionPane.showMessageDialog(null,nom.get(0)  +" ha vendido en total "+co1+" etiquetas\n"+
            nom.get(1)  +" hay estas entradas en total "+co2+" etiquetas\n"+
            nom.get(2)  +" hay estas entradas en total  "+co3+" etiquetas\n"+
           nom.get(3)  +" hay estas entradas en total  "+co4+" etiquetas\n" +
           nom.get(4)  +" hay estas entradas en total "+co5+" etiquetas\n"+ 
           nom.get(5)  +" hay estas entradas en total  "+co6+" etiquetas\n" 
            +nom.get(6)  +" hay estas entradas en total  "+co7+" etiquetas\n"
           +nom.get(7)  +"hay estas entradas en total "+co8+" etiquetas\n"
           +nom.get(8)  +" hay estas entradas en total "+co9+" etiquetas\n"
            +nom.get(9)  +"hay estas entradas en total  "+co0+" etiquetas"
               );
     }
     
      
    }




    
}
