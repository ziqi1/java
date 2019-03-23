package ziqi.first;

public class Hello{
    public static void main(String[] args){
	   System.out.println("Hello, the World!");
	   for(int i=args.length-1; i>-1; i--) {
	   System.out.println(i + ":" + args[i]);
	   }
    }
}
