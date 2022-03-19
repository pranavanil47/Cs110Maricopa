package Chapter_7;

public class test {
    public static void main(String[] args){
        String [] a = {"a","b", "c"};
        int i ;
        a = a.removeAt();

        for( i= 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    
}
