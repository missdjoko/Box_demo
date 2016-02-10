package net.missdjoko.boxdemo;

/**
 * Created by Miss_ on 08.10.2015.
 */
public class Box {
   private double width;
    private double lenght;
    private double height;

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

class BoxWeight extends Box{
    double weight;

    // конструктор
    BoxWeight(double w,double h,double l, double m){
       super (w,h,l); // инициализация переменных в конструкторе от суперкласса без их объявления
        weight=m;     // без проблем инициализирует поля private

    }

    BoxWeight(BoxWeight ob){
        super(ob);
        weight= ob.weight;
    }

}
