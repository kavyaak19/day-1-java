package Day6;
public class StringEx {
public static void main(String arg[]){
String s1="Hello";
s1=s1.concat("World");
//System.out.println(s1);
StringBuilder sb=new StringBuilder("Java");
sb.append("Programming");
System.out.println(sb.charAt(6));
System.out.println(sb.reverse());
String a="Hello";
String b=new String("Hello");
System.out.println(a==b);
System.out.println(a.equals(b));
//accessing characters in string
for(int i=0;i<s1.length();i++){
    System.out.print(s1.charAt(i)); 
}
}
    

