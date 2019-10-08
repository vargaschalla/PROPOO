package wagnerpoo;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class WagnerPOO {
    
    public static void problema01(){
        System.out.println("[---------------------------TRABAJO DE WAGNER VARGAS CHALLA--------------------------]");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("1.	Un alumno tiene 5 notas, realizar el promedio de las 4 máximas notas.");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");
        double n1,n2,n3,n4,n5,suma,me=0,prome,pe;
        Scanner l=new Scanner(System.in);
        System.out.print("NOTA 1:");
        n1=l.nextDouble();
        System.out.print("NOTA 2:");
        n2=l.nextDouble();
        System.out.print("NOTA 3:");
        n3=l.nextDouble();
        System.out.print("NOTA 4:");
        n4=l.nextDouble();
        System.out.print("NOTA 5:");
        n5=l.nextDouble();
        
        
        if(n1<n2 && n1<n3 && n1<n4){
            me=n1;
        }else if(n2<n1 && n2<n3 && n2<n4){
            me=n2;
        }else if(n3<n1 && n3<n2 && n3<n4){
            me=n3;
        }else if(n4<n1 && n4<n2 && n4<n3){
            me=n4;
        }else{
            me=n5;
        }
        suma=n1+n2+n3+n4+n5;
        pe=(suma-me);
        prome=pe/4;
        System.out.println("");
        System.out.println("promedio de los cuatro máximas notas:"+prome);
    }
    
    public static void problema02(){
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("2.	Desarrolle un algoritmo que lea 3 números distintos y a continuación imprima el mayor de  ");
        System.out.println("\t"+"los tres números introducidos y también el menor de ellos.");
        System.out.println("----------------------------------------------------------------------------------------------------");
        int n1,n2,n3;
        int ma,me;
        Scanner l=new Scanner(System.in);
        System.out.print("NÚMERO 1:");
        n1=l.nextInt();
        System.out.print("NÚMERO 2:");
        n2=l.nextInt();
        System.out.print("NÚMERO 3:");
        n3=l.nextInt();
        
        if(n1>n2 && n1>n3){
            ma=n1;
        }else if(n2>n1 && n2>n3){
            ma=n2;
        }else{
            ma=n3;
        }
        
        if(n1<n2 && n1<n3){
            me=n1;
        }else if(n2<n1 && n2<n3){
            me=n2;
        }else{
            me=n3;
        }
        System.out.println("");
        System.out.println("Mayor=="+ma);
        System.out.println("Menor=="+me);
    }
    
    public static void problema03(){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("3.	Hallar la hipotenusa de un triángulo rectángulo conocidas las longitudes ");
        System.out.println("\t"+"de su cateto adyacente y cateto opuesto.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("");
        double Ca,Co,H,sumCa;
        Scanner l=new Scanner(System.in);
        System.out.print("Cateto adyacente:");
        Ca=l.nextDouble();
        System.out.print("Cateto opuesto:");
        Co=l.nextDouble();
        
        sumCa=(Math.pow((double)Ca, 2))+(Math.pow((double)Co, 2));
        
        H=Math.pow((double)sumCa, 1.0/2.0);
        
        System.out.println("");
        System.out.println("HIPOTENUSA:"+H);
    }
    public static void Problema4(){
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("4.	La tienda “El Vecino” atiende a sus clientes de domingo a sábado, realizar un algoritmo que ");
        System.out.println("\t"+"permita registrar “n” ventas por día y al final presentar un reporte de cuanto se vendió por día.");
        System.out.println("\t"+"Validar que los importes sean positivos.");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        int ven = 0,tov=0,i=0;
        double pr = 0,cantpr = 0;
        String producto = "" , pro="",p="";
        System.out.println("OPCIÓN 1: CARACTERÍSTICAS DEL PRODUCTO");
        System.out.println("OPCIÓN 2: MOSTRAR EL RESULTADO DE LA OPCION 1");
        Scanner l=new Scanner(System.in);
        int opcion=0;
        
        System.out.print("Ingrese la opcion:");
        opcion=l.nextInt();
        while(opcion!=0){
            
        switch (opcion){
            case 1:
                i++;
                System.out.println("");
                System.out.println("[-----------DIA  "+i+"----------]");
                System.out.println("");
                System.out.print("NOMBRE DEL PRODUCTO:");
                producto=l.next();
                System.out.print("PRECIO:");
                pr=l.nextDouble();
                System.out.print("CANTIDAD DE PRODUCTO:");
                cantpr=l.nextDouble();
                System.out.println("");
                
                ven=(int) (pr*cantpr);
                tov=ven+tov;
                
                p="DIA "+i+"    "+producto+"                "+cantpr+"                  "+"S/."+pr+"               "+"S/."+ven+"\n";
                pro=pro+p;
                
                ;break;
                
            case 2:
                System.out.println("");
                System.out.println("---------------------RESULTADO DEL CASO 1:------------------------");
                System.out.println("");
                System.out.println("DIAS"+"   "+"PRODUCTO"+"       "+"CANTIDAD DE PRODUCTO"+"       "+"PRECIO"+"       "+"TOTAL DE VENTA POR DÍA");
                System.out.println(pro);
                System.out.println("");
                System.out.println("TOTAL DE VENTAS:"+"S/."+tov);
                ;break;
                
        default: System.out.println("Opción Inválida!!");break;
            }  
        
            System.out.print("Ingrese la opción :");            
            opcion =l.nextInt();
        }
        
    }
    public static void Problema05(){
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("5.	Registrar el producto “Leche Gloria” (nombre, precio y fecha de caducidad) Realizar un  ");
        System.out.println("\t"+"algoritmo que me diga si dicho producto esta vencido o no.");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("");
        int yyyy = 0, dd,MM;
        String r;
        System.out.println("EJEMPLO fecha:  =>  11/2/2019");
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL DÍA:");
        dd=sc.nextInt();
        System.out.println("INGRESE EL MES:");
        MM=sc.nextInt();
        System.out.println("INGRESE EL AÑO:");
        yyyy=sc.nextInt();
        System.out.println("fecha: "+dd+"/"+MM+"/"+yyyy);
        
        if(yyyy<2019){
            r="FECHA VENCIDA";
        }else if(MM<10){
            r="FECHA VENCIDA";
        }else if(dd<7){
            r="FECHA VENCIDA";
        }else {
            r="NO VENCIDA";
        }
        System.out.println("leche gloria:"+r);
        
       
    }
    public static void Problema6(){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("6.	Una tienda de préstamos requiere un sistema que le permita registrar los “n” prestamos ");
        System.out.println("\t"+"por día y saber cuánto se prestó por día. validar que los importes sean positivos.");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
        int i=0,cantprestamo;
        double psoles = 0,pres = 0,totprestamo = 0;
        String re="",r1="";
        System.out.println("OPCIÓN 1: CARACTERÍSTICAS DE PRÉSTAMO");
        System.out.println("OPCIÓN 2: MOSTRAR EL RESULTADO DE LA OPCION 1");
        Scanner l=new Scanner(System.in);
        int opcion=0;
        
        System.out.print("Ingrese la opcion:");
        opcion=l.nextInt();
        while(opcion!=0){
            
        switch (opcion){
            case 1:
                i++;
                System.out.println("");
                System.out.println("[-----------DIA  "+i+"----------]");
                System.out.println("");
                System.out.print("CANTIDAD DE PRÉSTAMO:");
                cantprestamo=l.nextInt();
                System.out.print("PRÉSTAMOS QUE HIZO EN S/."+"=:");
                psoles=l.nextDouble();
                System.out.println("");
                
                pres=psoles*cantprestamo;
                totprestamo=pres+totprestamo;
                
                r1="DIA "+i+"\t"+"  "+"\t"+cantprestamo+"\t"+"\t"+"   "+"S/."+psoles+"\t"+"\t"+"\t"+"S/."+pres+"\n";
                re=re+r1;
                
                ;break;
                
            case 2:
                System.out.println("");
                System.out.println("---------------------RESULTADO DE LA OPCIÓN 1:------------------------");
                System.out.println("");
                System.out.println("DIAS"+"\t"+"CANTIDAD DE PRES."+"\t"+"PRESTAMO EN S/."+"\t"+"\t"+"TOTAL DE PRESTAMO POR DIA");
                System.out.println(re);
                System.out.println("");
                System.out.println("TOTAL DE PRÉSTAMO:"+"S/."+totprestamo);
                ;break;
                
        default: System.out.println("Opción Inválida!!");break;
            }  
        
            System.out.print("Ingrese la opción :");            
            opcion =l.nextInt();
        }
        
    }

    public static void problema07(){
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("7.	Registrar las edades de 12 alumnos y determinar quién es el mayor y quien es el menor,  ");
        System.out.println("\t"+"determinar el promedio de las edades.");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("");
        int  j,inc=1;
        double aux;
        double[] edades=new double [12];
        Scanner leer=new Scanner(System.in);
                for (int i = 0; i <edades.length; i++) {
                    System.out.print("EDAD "+"["+i+"]=>");
                    edades[i]=leer.nextDouble();
                    aux = (double) edades[i];
                    j = i;
                    while (j > 0 && aux < edades[j - 1]) {
                        edades[j] = edades[j - 1];
                        j--;
                    }
                    edades[j] = aux;
                }
                int i = 0;
                System.out.println("");
                System.out.println("EL ORDEN DE LAS EDADES:");
                for (double edade : edades) {
                    System.out.println(+edade);
                }
                
                System.out.println("\n");
                System.out.println("MAYOR:"+edades[11]);
                System.out.println("MENOR:"+edades[0]);
    }
    

    public static void main(String[] args) {
        WagnerPOO E=new WagnerPOO();
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: E.problema01(); break;
            case 2: E.problema02(); break;
            case 3: E.problema03(); break;
            case 4: E.Problema4(); break;
            case 5: E.Problema05(); break;
            case 6: E.Problema6(); break;
            case 7: E.problema07(); break;
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }
    
}

