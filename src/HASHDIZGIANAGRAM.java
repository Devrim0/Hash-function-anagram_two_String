
public class  HASHDIZGIANAGRAM{

public static int hashsize=4;
public static char tablo[]=new char[hashsize];;

public static int  Hash(char c){
    int ascii=c;
return ascii%hashsize;
}
static void ekle(char c){
int hash=Hash(c);
if(tablo[hash]==0){
tablo[Hash(c)]=c;

}
else if(tablo[hash]!=0){
hash++;
if(hash>=hashsize){
hash=0;
}
}
}

static boolean ara(char c){
int hash=Hash(c);
if(tablo[hash]==c){
return true;
}
    return false;
}

static void print()
{
for(int i = 0; i < hashsize; i++) System.out.println("["+tablo[i] + " ]");
}
 static boolean anagram_mi(String a,String b){
 
 for(int i=0;i<a.length();i++){
 ekle(a.charAt(i));
 
 }
 for(int i=0;i<b.length();i++){
 if(ara(a.charAt(i))==true && b.charAt(i)==tablo[i]){
 return true;
 }
 
 }
 return false;
 }
 static void yazdir(String s1,String s2){
     System.out.println(s1+" ve "+s2+"  ANAGRAM MI:"+anagram_mi(s1,s2));
 }

    public static void main(String[] args) {
        System.out.println("ascii deneme");
        char c='b';
         int ascii=c;
        System.out.println(ascii);
        System.out.println();
        
        
        yazdir("c4a","11c");
        System.out.println();
        print();
        
       
        
    }
}