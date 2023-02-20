package Office;

public class Office {
    private Double size;  //instance variables
    private String name;

    public Office(Double s, String n){  //This is the constructor!!! it has to be the same as the class name
        this.size = Math.abs(s);
        this.name = n;  //if you name them the same thing as the 
        //instance variables then you have to write "this.", but even if you dont make them
        //the same name you can still write "this." before the name
    }

    public void setSize(Double newSize){
        this.size = newSize;
    }
    public Double getSize(){
        return this.size;
    }
}
