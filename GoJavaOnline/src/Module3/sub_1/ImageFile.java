package Module3.sub_1;

import java.io.IOException;
import java.util.Random;

public class ImageFile extends File{
    private String s;
    private int r, g, b;

    ImageFile(String path) throws IOException{
        super(path);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    public int getColorRate(){
        return (768 - new Random().nextInt(512)) * 1024;
    }

    protected void setColorRate(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
