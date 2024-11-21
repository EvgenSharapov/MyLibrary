package other.audio.timeaudio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class TimeAudioFile {
    public static void main(String[] args) {
        try{
            AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(
                    YourAudioFile.class.getResourceAsStream("your_audio_file.wav"));
            AudioFormat format=audioInputStream.getFormat();
            long frames=audioInputStream.getFrameLength();
            double durationInSecond=(frames +0.0)/format.getFrameRate();
            int minutes=(int)(durationInSecond/60);
            int seconds=(int)(durationInSecond%60);
            System.out.println("Duration: "+minutes+" minutes, "+seconds+" seconds");
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
