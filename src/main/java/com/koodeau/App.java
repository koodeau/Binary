package com.koodeau;

import org.joda.time.*;

/**
 * Binary!
 *
 */
public class App extends Validate{

    public static LocalTime currentTime = new LocalTime();
    public static void main( String[] args )
    {
        
//        Show.main(args);
//        Library.main(args);
        Validate.Input(); System.out.println("[INFO] "+currentTime + ": Input() void from class 'Validate' started! {App main(args)}");
        Validate.main(args); System.out.println("[INFO] "+currentTime + ": main(args) void from class 'Validate' started! {App main(args)}");


    }
}
