package net.missdjoko.boxdemo;
import java.awt.*;
import java.io.*;

/**
 * Created by Miss_ on 08.10.2015.
 */
public  class BoxDemo {
    public static void main(String [] args) throws IOException {
      /*  int i, j, k;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("vvedite shiriny:");

        i = Integer.parseInt(reader.readLine());
        System.out.println("Prinyato \n Vvedite dliny:");
        j =Integer.parseInt(reader.readLine());
        System.out.println("Prinyato \n Vvedite vjsoty:");
        k =Integer.parseInt(reader.readLine());
        System.out.println("Prinyato");
        Box mybox1 = new Box(i, j, k);
        System.out.println("volume mybox1 = " + mybox1.volume() );

        System.out.println("vvedite shiriny: ");
        i =Integer.parseInt(reader.readLine());
        System.out.println("Prinyato \n Vvedite dliny:");
        j =Integer.parseInt(reader.readLine());
        System.out.println("Prinyato \n Vvedite vjsoty:");
        k =Integer.parseInt(reader.readLine());
        System.out.println("Prinyato");
        Box mybox2 = new Box(i, j, k);

        System.out.println(" volume mybox2 = " + mybox2.volume());*/

        Box mybox1= new Box(10,15,5);
        Box mybox2= new Box();
        Box mycube = new Box(10.2);

        System.out.println("mybox1 volume = " + mybox1.volume());
        System.out.println("mybox2 volume = " + mybox2.volume());
        System.out.println("mycube volume = " + mycube.volume());

        


    }


}
