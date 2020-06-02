import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Come As You Are" , "Take your time, hurry up, Choice is yours, don't be late");
        trackList.put("Smells Like Teen Spirit" , "Oh yeah, I guess it makes me smile I found it hard, it's hard to find");
        trackList.put("Heart-Shaped Box" , "I've been locked inside your Heart-Shaped box for weeks");
        trackList.put("Lithium" , "I'm so happy, 'cause today I've found my friends");
        
        Set<String> Lyrics = trackList.keySet();
        for(String Track : Lyrics) {
            System.out.println("Track: " + Track);
            System.out.println("Lyrics: " + trackList.get(Track));
        }
    }
}