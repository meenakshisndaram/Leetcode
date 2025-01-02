public class Patter1 {
        public static void main(String[] args) {
            for (int i=1;i<=5;i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    class novita {
    int pass(){
        if (true){
            return 8;
        }
        else {

        }
        return  98;
    }
        public static void main(String[] args) {
            Integer i =9;
            char s =97;
            switch (s) {
                case 97:
                    System.out.println("");
                    break;
            }}}

  class ComplexIfElseExample {

    public static String evaluateConditions(int number, String type) {
        if (number < 0) {
            return "Negative number: " + number;
        } else if (number == 0) {
            return "Zero";
        } else {
            if ("even".equalsIgnoreCase(type)) {
                if (number % 2 == 0) {
                    return number + " is a positive even number.";
                } else {
                    return number + " is a positive odd number.";
                }
            } else if ("odd".equalsIgnoreCase(type)) {
                if (number % 2 != 0) {
                    return number + " is a positive odd number.";
                } else {
                    return number + " is a positive even number.";
                }
            } else {
                return "Unknown type: " + type;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluateConditions(4, "even"));  // Output: ?
        System.out.println(evaluateConditions(3, "odd"));   // Output: ?
        System.out.println(evaluateConditions(2, "odd"));   // Output: ?
        System.out.println(evaluateConditions(-1, "even"));  // Output: ?
        System.out.println(evaluateConditions(0, "odd"));    // Output: ?
        System.out.println(evaluateConditions(5, "unknown")); // Output: ?
    }
}


  class ComplexStringManipulation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = str1.intern();
        String str4 = str2.intern();
        str2 = str2.concat(" Programming");
        StringBuilder sb = new StringBuilder("Learning ");
        sb.append("Java");
        sb.insert(8, "Advanced ");
        boolean isEqual = str1.equals(str2);
        boolean isSameReference = (str1 == str2);
        String finalString = sb.toString();
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("Are str1 and str2 equal? " + isEqual);
        System.out.println("Do str1 and str2 reference the same object? " + isSameReference);
        System.out.println("Final String from StringBuilder: " + finalString);
    }
}

class VariableExample {
    private static int x;
    static int count;
    public VariableExample(){
        count++;
    }

   public static void demon(int x2){

        x=5+5;
   }

    public static void main(String[] args) {
        VariableExample example1 = new VariableExample();
        example1.demon(7);
         VariableExample example2 = new VariableExample();
        example2.demon(7);

        System.out.println(example1.x);
        System.out.println(example2.x);
        System.out.println( count);
    }
}

class ver{
    public static void main(String[] args) {
     String sc="hi";
     String sc2="hi";
     String sc3=new String("Hi");
     String sc4=sc3.intern();
     System.out.println(sc==sc2);
     System.out.println(sc==sc4);
    }
}