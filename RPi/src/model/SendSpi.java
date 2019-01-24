import com.pi4j.io.spi.*;
import java.io.*;

//This class allow you to send a 3 byte message through the SPI channel of a Raspberry
//Note : the data inputs argument are short use as a byte

public class SendSpi {
	
	public static void Sending (SpiDevice spi, short da1, short da2, short da3) throws IOException, InterruptedException  {
        
        
        if (da1<0x10000 & da2<0x10000 & da3<0x10000) {    
        
        		
        short data[] = new short[] {da1,da2,da3};
        
        spi.write(data,0,1);
        spi.write(data,1,1);
        spi.write(data,2,1);
	}
	}
}
