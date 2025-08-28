import java.io.*;
public class learnbreakandcontinue{
public static void main(String args[])
{
for(int i=1;i<=5;i++){
if(i==3){
break;
}
System.out.println(i);
}
System.out.println("___________________________________________");
for(int i=1;i<=10;i++){
if(i==7){
continue;
}
System.out.println(i);
}
}
}