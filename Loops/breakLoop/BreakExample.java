package breakexample;

public class BreakExample {

    public static void main(String[] args) {
        //using for loop
        for(int i=1;i<=10;i++){
            if(i==7){
                //breaking the loop
                break;
            }
            System.out.println(i);
        }
        
    }
    
}
