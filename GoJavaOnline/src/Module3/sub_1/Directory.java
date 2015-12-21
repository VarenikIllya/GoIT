package Module3.sub_1;

import java.io.File;

/**
 * Created by i on 21.12.15.
 */
public class Directory extends File{
    private String path;

    Directory(String path){
        super(path);
        this.path = path;
    }
}
