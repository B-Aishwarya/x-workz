public class IPhoneTester
{
public static void main(String[] args)
{
System.out.println("JVM invokoed by main");
boolean callConnect=IPhone.call();
System.out.println("return value is :"+callConnect);


String msgConnect=IPhone.message();
System.out.println("return values is "+msgConnect);


byte chargevalue=IPhone.charging(45);
System.out.println("return value is "+chargevalue);

System.out.println("EXIT main");



}
}
