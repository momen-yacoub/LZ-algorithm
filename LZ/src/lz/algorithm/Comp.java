
package lz.algorithm;

public final class Comp {
    
    String Data;
    int next;
    public Comp(String data){
        this.Data = data;
        next = 0;
    }
    
    Tag Best(int indx){
       int l = this.Data.length();
       Tag mm = new Tag();
       mm .pointer = 0;
       mm.length = 0;
       next = indx + 1;
       mm.newchar = this.Data.charAt(indx);
       for(int i = 0; i < indx ; i++){
          int max = 0;
          for(int j = i , k = indx; k < l && this.Data.charAt(j) == this.Data.charAt(k); j++ , k++ , max++){}
          if(mm.length < max){
              mm.length = max;
              mm .pointer = indx - i;
              next = indx + mm.length + 1;
              if(mm.length + indx < l)
                  mm.newchar = this.Data.charAt(mm.length + indx);
              else mm.newchar = '/';
          }
       }
       return mm;
    }
    
    public Tag[] procces(){
        Tag tags[] = new Tag[0];
        int len = 0;
        do{
           Tag b[] = new Tag[len + 1];
           System.arraycopy(tags, 0, b, 0, len);
           b[len] = Best(next);
           tags = b;
           len++;
       }while(next < this.Data.length());
        return tags;
    }
   
}
