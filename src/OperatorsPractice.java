public class OperatorsPractice {
    public static void main(String[] args) {
        //Arithmetic Operator
        //+
        int num1=20,num2=30;
        int result=num1+num2;
        System.out.println(result);
        //-
        result=num1-num2;
        System.out.println(result);
        //*
        result=num1*num2;
        System.out.println(result);
        //(/)
        double result1=num1/num2;
        System.out.println(result1);
        // %
        num1=5;
        num2=2;
        result=num1%num2;
        System.out.println("division is " +(num1/num2));
        System.out.println(result);
        System.out.println(num1!=num2);
        System.out.println(9<=10);
        num1=10;
        num2=6;
        result=1;
        boolean isCitizen = true;
        System.out.println(isCitizen && num1==10 && num2>5 && result>0);
        int a=20;
        int b=-15;
        System.out.println("equals " +(a==b));
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println("Logical AND " +(a==b && a!=b && a>=b && a<=b));
    }
}
