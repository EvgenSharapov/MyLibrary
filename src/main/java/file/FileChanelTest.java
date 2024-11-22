package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChanelTest {
    public static void main(String[] args) throws IOException {
        try(FileChannel inputChannel=new FileInputStream("text.txt").getChannel()){
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        inputChannel.read(byteBuffer);
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()){
            System.out.print((char)byteBuffer.get());
        }
        }
    }
}
