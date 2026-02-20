// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int sum=0;
        int n=0;
        
        while (n<20){
            n++;
            if(n==10 ||  n==11)
            continue;
            sum+=n;
            
        }
        System.out.println("the sum is "+ sum);
    }
}
//output _ 189
