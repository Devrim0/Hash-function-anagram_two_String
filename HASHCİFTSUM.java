
public class HASHCİFTSUM {
    public static int hashsize=8;
static int hashtablo[]=new int[hashsize];
public static int Hash(int key){
return key%hashsize;
}

public static void ekle(int eleman){
int hash=Hash(eleman);
if(hashtablo[hash]==0){
hashtablo[Hash(eleman)] = eleman;}
else if(hashtablo[hash] != 0) { 
   hash++;   
if(hash >= hashsize)
    hash = 0; 
}
}
static boolean  ara(int key){
int hash=Hash(key);
   if(hashtablo[hash]==key){
      return true;
      }
        return false;
}

public static void ciftleribul(int d[],int sum,int n){
for(int i=0;i<n;i++){
int a=sum-d[i];
if(a>=0){
if(ara(a)==true){
    System.out.println("bulundu:"+a+","+d[i]);
}
else if(ara(a)==false) {
ekle(d[i]);
 
}
else {
  System.out.println("toplam yok");
}
}
}
}


public static void main(String[] args) {        

    int []a = {2,3,4,6,1,9,0,7};
        
         
         int n=a.length;
        ciftleribul(a,9,n);
        

}






}