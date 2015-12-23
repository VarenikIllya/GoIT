package Module3.sub_2;

public class NotSuchPlaceException extends Exception {
    private Flower flower;
    public NotSuchPlaceException(Flower flower) {
        this.flower = flower;
    }

    public String getName(){
        return flower.getName();
    }
}
