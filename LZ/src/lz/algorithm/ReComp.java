
package lz.algorithm;

public class ReComp {
    Tag Data[];

    public ReComp(Tag[] data) {
        Data = data;
    }
    public String Re(){
        String data = "";
        int indx = 0;
        
        for(int i = 0 ; i < Data.length ; i++){
            
            for(int j =  indx - Data[i].pointer; j <  indx - Data[i].pointer + Data[i].length ; j++){
                data += data.charAt(j);
            }
            if(Data[i].newchar != '/'){
                data += Data[i].newchar;
            }
            indx +=  Data[i].length + 1;
        }
        
        return data;
    }
}
