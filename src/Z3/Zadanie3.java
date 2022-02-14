package Z3;
import java.io.File;
import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args){
        String path = "C:/Users/Karolina/Desktop";
        File[] files = fileList(path);
        for(File s: files){
            System.out.println(s.getName());
        }
    }
    public static File[] fileList(String path){
        File file = new File(path);
        return file.listFiles((dir,name) -> dir.isDirectory());
    }
}
