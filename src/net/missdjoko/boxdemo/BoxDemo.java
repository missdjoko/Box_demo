package net.missdjoko.boxdemo;
import java.awt.*;
import java.io.*;

/**
 * Created by Miss_ on 08.10.2015.
 */
public  class BoxDemo {
    public static void main(String [] args) throws IOException {


        BoxWeight mybox1= new BoxWeight(10,15,5,30.5);
       // BoxWeight mybox2= new BoxWeight(5,45,95,0.004);
        Box bx = new Box();
        double vol;

      vol=mybox1.volume();
      System.out.println("mybox1 ob'em  = " + vol);
      System.out.println("mybox1 ves  = " + mybox1.weight);

      System.out.println();

      /*vol=mybox2.volume();

      System.out.println("mybox2 ob'em = "+ vol);
      System.out.println("mybox2 ves = " + mybox2.weight);
*/
        bx=mybox1;
        vol=bx.volume();
        System.out.println("bx ob'em  = " + vol);



        


    }


}
