package Module3.sub_1;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Random;

public class File{
    private String path;
    private String name;
    private byte[] fileBytes;

    File(final String path){
        this.path = path;
        this.name = path.substring(path.lastIndexOf("\\") + 1);
        fileBytes = new byte[new Random().nextInt(100000)];
        for(int i = 0; i < fileBytes.length; i ++){
            fileBytes[i] = (byte) new Random().nextInt(256);
        }
    }
    // Module6 subtask 1
    public byte[] getFileBytes(final int fromBytes, final int toBytes) throws EOFException{
        if (fromBytes > 0 && toBytes < fileBytes.length-1){
            return Arrays.copyOfRange(fileBytes, fromBytes, toBytes);
        } else{
            throw new IllegalArgumentException("Impossible read file bytes: from " + fromBytes + " to " + toBytes + ". Array length " + fileBytes.length);
        }
    }

    public String getName() {
        return name;
    }

    public boolean exists(){
        return new Random().nextBoolean();
    }
}
