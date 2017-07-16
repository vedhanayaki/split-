package player;
import java.util.Scanner;
public class set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String");
Scanner s=new Scanner(System.in);
int i,j;
String a,b[];
a=s.next();
b=a.split("");
int l=a.length();
for(i=0;i<l;i++){
	for(j=i+1;j<l;j++){
		if(b[i].equals(b[j])){
			System.out.println(b[i]);
		}
	}
}
s.close();
	}

}
