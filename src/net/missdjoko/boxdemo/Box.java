package net.missdjoko.boxdemo;

/**
 * Created by Miss_ on 08.10.2015.
 */
public class Box {
    double width;
    double lenght;
    double height;

   double volume(){

       return width*lenght*height;
   }

    Box( double i, double j, double k){
        System.out.println(" Constructor is complete ");
        width = i;
        lenght = j;
        height = k;

    }

    // перегрузка конструктора
    Box(){
        width=-1;
        height=-1;
        lenght=-1;
    }

    Box(double len){
        width = lenght= height = len;
    }


    // передача объекта в качестве параметра метода
    Box(Box ob){
        width=ob.width;
        lenght=ob.lenght;
        height=ob.height;
    }

}
