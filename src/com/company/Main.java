package com.company;
import java.util.*;
import java.io.*;
public class Main {
public static Double tarifa;
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
                 tarifa = 45.0;
                System.out.println("ingresar horas a trabajar");


                break;


            case "b":


                break;


            default:   System.out.println("categoria no existe");

        }
        System.out.println("categoria"+t+"!!!!!"+"hirastrabajadas"+Double.toString(g));



        return null;
    }
}
