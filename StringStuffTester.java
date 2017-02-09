public class StringStuffTester {

  public static void main (String [] args) {
    test_containsVowel();
    test_isPalindrome();
  }


  static void test_containsVowel(){
    System.out.println( "   Contains vowel test :" );
    System.out.print( "   Test for A: " );
    try { System.out.println( StringStuff.containsVowel( "A" ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for a: " );
    try { System.out.println( StringStuff.containsVowel( "a" ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for rythms: " );
    try { System.out.println( StringStuff.containsVowel( "rythms" ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for Exception: " );
    try { System.out.println( StringStuff.containsVowel( "Exception" ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for cOsmos: " );
    try { System.out.println( StringStuff.containsVowel( "cOsmos" ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for twyndyllyngs : " );
    try { System.out.println( StringStuff.containsVowel( "twyndyllyngs " ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for 3.14 : " );
    try { System.out.println( StringStuff.containsVowel( "3.14 " ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.println( "  " );
  }

  static void test_isPalindrome(){

    System.out.println( "  Is palindrome test: " );

    System.out.print( "   Test for a : " );
    try { System.out.println( StringStuff.isPalindrome( "a" ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for abcdefg : " );
    try { System.out.println( StringStuff.isPalindrome( "abcdefg" ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for Radar : " );
    try { System.out.println( StringStuff.isPalindrome( "Radar " ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for radar : " );
    try { System.out.println( StringStuff.isPalindrome( "radar " ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for racecar : " );
    try { System.out.println( StringStuff.isPalindrome( "racecar " ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for Computer : " );
    try { System.out.println( StringStuff.isPalindrome( "Computer " ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false ); }

    System.out.print( "   Test for detartrated : " );
    try { System.out.println( StringStuff.isPalindrome( "detartrated " ) ? "true" : "false" ); }
    catch( Exception e ) { System.out.println ( false );
    }

    System.out.println( "  " );

    System.out.println( "  Only evens test: " );

    System.out.print( "   Test for detartrated : " );
    System.out.println( StringStuff.evensOnly( "detartrated " ));

    System.out.print( "   Test for Rehearsals : " );
    System.out.println( StringStuff.evensOnly( "Rehearsals " ));

    System.out.print( "   Test for Kea Braekman : " );
    System.out.println( StringStuff.evensOnly( "Kea Braekman " ));

    System.out.print( "   Test for ABCDEFGHIJKLMNOPQRSTUVWXYZ : " );
    System.out.println( StringStuff.evensOnly( "ABCDEFGHIJKLMNOPQRSTUVWXYZ " ));

    System.out.print( "   Test for abcdeghijklmnopqrstuvwxyz : " );
    System.out.println( StringStuff.evensOnly( "abcdeghijklmnopqrstuvwxyz " ));

    System.out.println( "  " );


    System.out.println(" Only odds test");

    System.out.print( "   Test for detartrated : " );
    System.out.println( StringStuff.oddsOnly( "detartrated " ));

    System.out.print( "   Test for Rehearsals : " );
    System.out.println( StringStuff.oddsOnly( "Rehearsals " ));

    System.out.print( "   Test for Kea Braekman : " );
    System.out.println( StringStuff.oddsOnly( "Kea Braekman " ));

    System.out.print( "   Test for ABCDEFGHIJKLMNOPQRSTUVWXYZ : " );
    System.out.println( StringStuff.oddsOnly( "ABCDEFGHIJKLMNOPQRSTUVWXYZ " ));

    System.out.print( "   Test for abcdeghijklmnopqrstuvwxyz : " );
    System.out.println( StringStuff.oddsOnly( "abcdeghijklmnopqrstuvwxyz " ));

    System.out.println( "  " );


    System.out.println(" Only evens no dupes test");

    System.out.print( "   Test for detartrated : " );
    System.out.println( StringStuff.evensOnlyNoDupes( "detartrated " ));

    System.out.print( "   Test for Rehearsals : " );
    System.out.println( StringStuff.evensOnlyNoDupes( "Rehearsals " ));

    System.out.print( "   Test for Kea Braekman : " );
    System.out.println( StringStuff.evensOnlyNoDupes( "Kea Braekman " ));

    System.out.print( "   Test for ABCDEFGHIJKLMNOPQRSTUVWXYZ : " );
    System.out.println( StringStuff.evensOnlyNoDupes( "ABCDEFGHIJKLMNOPQRSTUVWXYZ " ));

    System.out.print( "   Test for abcdeghijklmnopqrstuvwxyz : " );
    System.out.println( StringStuff.evensOnlyNoDupes( "abcdeghijklmnopqrstuvwxyz " ));

    System.out.println( "  " );


    System.out.println(" Only odds no dupes test");

    System.out.print( "   Test for detartrated : " );
    System.out.println( StringStuff.oddsOnlyNoDupes( "detartrated " ));

    System.out.print( "   Test for Rehearsals : " );
    System.out.println( StringStuff.oddsOnlyNoDupes( "Rehearsals " ));

    System.out.print( "   Test for Kea Braekman : " );
    System.out.println( StringStuff.oddsOnlyNoDupes( "Kea Braekman " ));

    System.out.print( "   Test for ABCDEFGHIJKLMNOPQRSTUVWXYZ : " );
    System.out.println( StringStuff.oddsOnlyNoDupes( "ABCDEFGHIJKLMNOPQRSTUVWXYZ " ));

    System.out.print( "   Test for abcdeghijklmnopqrstuvwxyz : " );
    System.out.println( StringStuff.oddsOnlyNoDupes( "abcdeghijklmnopqrstuvwxyz " ));

    System.out.println( "  " );


    System.out.println(" Reverse test");

    System.out.print( "   Test for detartrated : " );
    System.out.println( StringStuff.reverse( "detartrated " ));

    System.out.print( "   Test for Rehearsals : " );
    System.out.println( StringStuff.reverse( "Rehearsals " ));

    System.out.print( "   Test for Kea Braekman : " );
    System.out.println( StringStuff.reverse( "Kea Braekman " ));

    System.out.print( "   Test for ABCDEFGHIJKLMNOPQRSTUVWXYZ : " );
    System.out.println( StringStuff.reverse( "ABCDEFGHIJKLMNOPQRSTUVWXYZ " ));

    System.out.print( "   Test for abcdeghijklmnopqrstuvwxyz : " );
    System.out.println( StringStuff.reverse( "abcdeghijklmnopqrstuvwxyz " ));

    System.out.println( "  " );



  }




}
