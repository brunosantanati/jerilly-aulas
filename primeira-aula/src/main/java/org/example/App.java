package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(args[0]);
        System.out.println(args[1]);

        Casa minhaCasa = new Casa();
        minhaCasa.numeroDeComodos = 6;
        minhaCasa.cor = "azul";

        System.out.println(minhaCasa);

        Casa casaDaJerilly = new Casa();
        casaDaJerilly.numeroDeComodos = 4;
        casaDaJerilly.cor = "branca";

        System.out.println(casaDaJerilly);
    }
}
