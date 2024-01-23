import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class K105eA04 {
      public static void main ( String[] args ) 
  {
    DataInputStream  instr;
    DataOutputStream outstr;
    if ( args.length != 3 || !args[1].toUpperCase().equals("TO") )
    {
      System.out.println("java CopyBytes source to destination");
      return;
    }

    try
    {
      instr = 
        new DataInputStream(
          new BufferedInputStream(
            new FileInputStream( args[0] )));
      outstr = 
        new DataOutputStream(
          new BufferedOutputStream(
            new FileOutputStream( args[2] )));

      try
      {
        int data;
        while ( true )
        {
          data = instr.readUnsignedByte() ;
          outstr.writeByte( data ) ;
        }
      }
      catch ( EOFException  eof )
      {
        outstr.close();
        instr.close();
        return;
      }
    }

    catch ( FileNotFoundException nfx )
    {
      System.out.println("Problem opening files" );
    }
    catch ( IOException iox )
    {
      System.out.println("I/O Problems" );
    }

  }
}
