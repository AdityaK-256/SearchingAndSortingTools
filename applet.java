import java.applet.AudioClip;
import java.applet.Applet;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.File;

class applet{
    public static void main(String [] args) throws MalformedURLException, InterruptedException{
        
        URL aud = new URL("file:///Users/adityakesarwani/Desktop/Thinking Out Loud.wav");
        AudioClip clip = Applet.newAudioClip(aud);
        clip.play();
        
    }
}