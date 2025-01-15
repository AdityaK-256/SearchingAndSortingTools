import java.applet.AudioClip;
import java.applet.Applet;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.File;

class applet2 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        
        // Use the File class to create the URL
        File file = new File("/Users/adityakesarwani/Desktop/Thinking Out Loud.wav");
        URL aud = file.toURI().toURL();  // Convert the file path to a URL
        
        AudioClip clip = Applet.newAudioClip(aud);
        clip.play();
        
        // Keep the application running long enough to hear the audio
        Thread.sleep(5000);  // 5 seconds
    }
}
