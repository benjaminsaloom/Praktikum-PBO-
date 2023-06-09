/**
 * Nama file : ArrayListTest.java
 * Penulis   : Benjamin Franklin Saloom Sipayung
 * NIM       : 24060121130047
 * Deskripsi : Program penggunaan objek ArrayList sebagai collection class
 * Tanggal   : 07-06-2023
 */
import java.util.ArrayList;
public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        strings.remove("praktikum"); 
        for(String s : strings){
            System.out.print(s+"");
        }
    }
}    