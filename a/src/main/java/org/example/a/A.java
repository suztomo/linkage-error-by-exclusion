package org.example.a;

import org.example.b.B;

public class A
{
    public static void main( String[] args )
    {
        System.out.println( "Hello from A" );
        B.main(args);
    }
}
