
package lz.algorithm;
import java.util.Scanner;


public class LZAlgorithm {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String Data = in.next();
        Comp NewData = new Comp(Data);
        Tag tags[] = NewData.procces();
        for(int i = 0 ; i < tags.length ; i++){
            System.out.println(tags[i].pointer + "     " + tags[i].length + "    " + tags[i].newchar);
        }
        ReComp ReData = new ReComp(tags);
        String Re = ReData.Re();
        System.out.println(Re);
    }
}
