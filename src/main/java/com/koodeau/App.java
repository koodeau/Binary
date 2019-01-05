package com.koodeau;
import com.koodeau.Library;
import com.koodeau.Validate;
import com.koodeau.Show;

/**
 * Hello world!
 *
 */
public class App extends Validate
{
    public static void main( String[] args )
    {
        Show.main(args);
        Library.main(args);
        Validate.Input();
        Validate.main(args);
    }
}
