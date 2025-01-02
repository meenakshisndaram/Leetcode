import java.io.IOException;
import java.sql.SQLException;

public class tasks {
}
class Calc {
    int add(int... x) {
        int sum = 0; // Initialize sum to zero
        for (int num : x) { // Iterate through the arguments
            sum += num; // Add each number to the sum
        }
        return sum; // Return the total sum
    }
}

class Mains {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2, 3));            // Output: 5
        System.out.println(c.add(2, 3, 4));         // Output: 9
        System.out.println(c.add(2, 3, 4, 8, 9, 10)); // Output: 36
    }
}

/*
class buses{
    void m1()throws IOException {}
}
class passenger6 extends bus {
    @Override
    void m1()throws ArithmeticException {}
}

class busER{
    void m1()throws IOException {}
}
class passenger extends bus {
    void m1()throws SQLException {}
}*/

/*
class busE{
    void m1()throws RuntimeException {}
}
class passenger extends bus {
    void m1() throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException {}
}*/

class cricket{
    void oneday() throws  IOException{
        System.out.println("Well played ");
    }

}
class ms extends cricket{
    void oneday()throws RuntimeException{
        System.out.println("A best Capatain");

    }
}
class virat{
    public static void main(String[] args) {
        ms c= new ms();
        c.oneday();

    }
}

/*
class ab{
    void m1()throws IOException{}
}
class ab2 extends  ab{
    void m1()throws ArithmeticException,RuntimeException{}
}
class ab3 extends  ab{
    void m1(int k )throws SQLException{}
}
class ab4 extends  ab2{
    int m1(){
        return  7;
    }
}
class ab5 extends ab4{
    void m1()throws IOException{}
} */
class a3{

    public static void main(String[] args) {
        System.out.println();
    }}

class Cricket
{
    int  oneday() throws IOException{
       return 8/0;
    }
}
class Virat{
    public static void main (String[] args)throws Exception{
        Cricket c= new Cricket();
        try{
        c.oneday();
    }
        catch (Exception e){
        System.out.println("kiki");}
    }
}

/*

class cricket{
    void oneday() throws IOException{
        System.out.println("Well played ");
    }}
class Ms extends cricket{
    void oneday()throws RuntimeException{
        System.out.println("A best Capatain");
    }}
class Virat{
    public static void main(String[] args) {
        cricket c= new ms();
       */
/* c.oneday();*//*

    }}*/

class Ab{
    void m1()throws IOException{}
}
class Ab2 extends Ab{
    void m1()throws ArithmeticException,RuntimeException{}
}
class Ab3 extends Ab{

    void m1(int k )throws SQLException{}
}
class Ab4 extends Ab2{
    int m1(int x){
        return 7;
    }
}
/*
class Ab5 extends Ab4{
    void m1()throws IOException{}
}
*/


 class Mainl{
    public static void main(String[]args){
       int [] [] i ={{1,2,3,4,5}};
       for(int [] k :i){
           System.out.println(k);
       }
    }
 }


