package com.company;


import java.awt.Dimension;
        import java.awt.FlowLayout;
        import java.awt.Insets;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JTextField;

public class Form implements ActionListener{//implementando el listener de eventos

    JButton bt1;//creando variables globales de los botones
    JLabel jl1, jl2,jl3;//creando variables globales para las etiquetas
    JTextField jt1, jt2, jt3;//creando variables globales para los campos de texto
    JFrame jf = new JFrame("Formulario Basico Java");//creacion de ventana con el titulo
    public static Double sueldobruto,tarifa,totalsueldosbrutoa=0.0,totalsueldosbrutob,totalsueldosbrutoc,totalsueldosbrutod,getTotalsueldosbrutototal=0.0;
    public  static int totaltrabajadoresa,totaltrabajadoresb,totaltrabajadoresc,totaltrabajadoresd;
    public  static int totalhorastrabajadasa,totalhorastrabajadasb,totalhorastrabajadasc,totalhorastrabajadasd;


    public Form(){//constructor de la clase

        jf.setLayout(new FlowLayout());//Configurar como se dispondra el espacio del jframe
        Dimension d = new Dimension();//objeto para obtener el ancho de la pantalla

        //Instanciando etiquetas
        jl1 = new JLabel("Ingrese categoria");
        jl2 = new JLabel("ingrese horas trabajadas");
        jl3 = new JLabel(" sueldo bruto");
        //Instanciando cuadros de texto
        jt1 = new JTextField(2);
        jt2 = new JTextField(2);
        jt3 = new JTextField(2);


        //Instanciando boton con texto
        bt1 = new JButton("Calcular");

        //añadiendo objetos a la ventana
        jf.add(jl1); jf.add(jt1);  jf.add(jl2); jf.add(jt2);jf.add(bt1);
        jf.add(jl3);

        //margenes para texto en boton
        bt1.setMargin(new Insets(1, 5, 1, 5));

        //añadiendo el listener a los botones para manipular los eventos del click
        bt1.addActionListener(this);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        jf.setResizable(false);//para configurar si se redimensiona la ventana
        jf.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra la ventana (x, y)
        jf.setSize(600, 250);//configurando tamaño de la ventana (ancho, alto)
        jf.setVisible(true);//configurando visualización de la venta
    }

    public static void main(String[] args) {
        Form gj = new Form();//uso de constructor para la ventana
    }

    @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener

        int   nr;//variables que almacenaran los numeros de los campos de texto
String n1;
Double n2;
        if(e.getSource()==bt1){//podemos comparar por el contenido del boton

            //Los campos de texto son de tipo string, asi que tomamos la cadena con el metodo .getText()
            //y lo almacenamos en la variable.

            n1 = jt1.getText();
            n2 = Double.parseDouble(jt2.getText());

        fff(n1,n2);//realizamos la operacion

            //jt3.setText(""+nr);/*mostramos el valor mediante el metodo .setText() como muestra cadenas

        }
    }
    public    String fff(String t,Double g){

        switch(t){

            case "a":

                Double d=cata(g);
                jl3.setText("Sueldo bruto"+String.valueOf(d));
                System.out.println("categoria"+t+"!!!!!"+"hirastrabajadas"+Double.toString(g)+"total"+String.valueOf(d));

                break;


            case "b":
                tarifa = 42.5;
                sueldobruto=tarifa *g;
                totalsueldosbrutob=sueldobruto+totalsueldosbrutob;

                break;

            case "c":
                tarifa = 40.0;
                sueldobruto=tarifa *g;
                totalsueldosbrutoc=sueldobruto+totalsueldosbrutoc;

                break;

            case "d":
                tarifa = 37.5;
                sueldobruto=tarifa *g;
                totalsueldosbrutod=sueldobruto+totalsueldosbrutod;

                break;

            default:   System.out.println("categoria no existe");

        }



        return null;
    }

    public  static Double cata(Double a){


        tarifa = 45.0;

        sueldobruto=tarifa *a;
        totalsueldosbrutoa=sueldobruto+totalsueldosbrutoa;

        return  sueldobruto;
    }
}