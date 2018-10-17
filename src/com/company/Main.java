package com.company;
import java.util.*;
import java.io.*;
public class Main {
public static Double sueldobruto,tarifa,totalsueldosbrutoa=0.0,totalsueldosbrutob,totalsueldosbrutoc,totalsueldosbrutod,getTotalsueldosbrutototal=0.0;
public  static int totaltrabajadoresa,totaltrabajadoresb,totaltrabajadoresc,totaltrabajadoresd;
    public  static int totalhorastrabajadasa,totalhorastrabajadasb,totalhorastrabajadasc,totalhorastrabajadasd;


    public static void main(String[] args)throws IOException
    {  double ca;

        System.out.println("ingresar categoria");

        String cantidadcategoria;
        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        cantidadcategoria=bufer.readLine();
        System.out.println("ingresar horas a trabajar");
        BufferedReader bufert= new BufferedReader(new InputStreamReader(System.in));
        ca=Double.valueOf( bufert.readLine());
        fff(cantidadcategoria,ca);
}
    public   static String fff(String t,Double g){

        switch(t){

            case "a":
                System.out.println("ingresar horas a trabajar");
                cata(g);
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
        System.out.println("categoria"+t+"!!!!!"+"hirastrabajadas"+Double.toString(g)+"total"+totalsueldosbrutoa);



        return null;
    }
    public  static Double cata(Double a){
Double s = 0.0;

        tarifa = 45.0;

        sueldobruto=tarifa *a;
        totalsueldosbrutoa=sueldobruto+totalsueldosbrutoa;

return  s;
    }
}
