package Module3.sub_1;

import java.io.IOException;
import java.io.File;

/**
 * Created by i on 21.12.15.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        File[] files = new File[]{new ImageFile("~\\Documents\\GoIT\\a.png"), new AudioFile("~\\Documents\\GoIT\\a.mp3"), new TextFile("~\\Documents\\GoIT\\a.txt")};

        File dir = new Directory("~\\Documents\\GoIT\\");
        if (dir.exists()) {
            for(File f : files){
                if (f.exists()) {
                    System.out.println(f.getName());
                } else{
                    System.out.println("File is not exists " + f.getName());
                }
            }
        } else {
            System.out.println("Directory is not exists " + dir.getName());
        }

    }
}
