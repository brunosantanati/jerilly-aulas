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
        minhaCasa.setNumeroDeComodos(6);
        minhaCasa.setCor("azul");

        System.out.println(minhaCasa);
        System.out.println("numero de comodos: " + minhaCasa.getNumeroDeComodos());
        System.out.println("cor da casa: " + minhaCasa.getCor());

        Casa casaDaJerilly = new Casa();
        casaDaJerilly.setNumeroDeComodos(4);
        casaDaJerilly.setCor("branca");

        System.out.println(casaDaJerilly);
    }
}
