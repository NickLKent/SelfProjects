package Office;
public class OfficeTest {
    public static void main(String[] args) {
        Office office1 = new Office(1600.5, "Blake's Office");  //Creates a new office object.
        System.out.println(office1.getSize());
       
        office1.setSize(900.0);
        System.out.println(office1.getSize());


    }
}
