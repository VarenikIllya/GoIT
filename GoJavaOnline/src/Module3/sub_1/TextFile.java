package Module3.sub_1;

import java.io.IOException;

public class TextFile extends File{
    private String s;
    private String title;

    TextFile(String path) throws IOException{
        super(path);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    public String getTitle(){
        return title;
    }


    protected void setTitle(String title){
        this.title = title;
    }
}
