package Module3.sub_1;

import java.io.File;
import java.util.List;
import java.util.logging.StreamHandler;

/**
 * Created by i on 21.12.15.
 */
public class Directory extends File{
    private String path;
    private List<File> files;

    Directory(String path){
        super(path);
        this.path = path;
    }

    Directory(String path, List<File> files){
        super(path);
        this.path = path;
        this.files = files;
    }

    public List<File> getFiles(){
        return files;
    }

    public int getFilesCount(){
        return files.size();
    }

    protected void putFile(File f){
        files.add(f);
    }
}
