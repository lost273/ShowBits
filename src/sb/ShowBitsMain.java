
package sb;


public class ShowBitsMain {
    public static void main(String[] args){
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);
        
        System.out.println("123 in binary representation");
        b.show(123);
        
        System.out.println("\n87987 in binary representation");
        i.show(87987);
        
        System.out.println("\n237658768 in binary representation");
        li.show(237658768);
    }
}
