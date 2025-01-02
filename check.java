
import java.util.ArrayList;
import java.util.Collections;
public class check {
}


  class Com {

    public static void main(String[] args) {
        ArrayList<Students> stud = new ArrayList<>();
        stud.add(new Students(23, "sangeetha"));
        stud.add(new Students(24, "saha"));
        stud.add(new Students(20, "sana"));
        stud.add(new Students(13, "sangeethamathi"));
        stud.add(new Students(11, "ganesh"));

        Collections.sort(stud);
        for(Students S : stud){
            System.out.println(S);
        }
    }

}

class Students implements Comparable<Students>{
    int age;
    String name;

    Students(int age, String name){
        this.age=age;
        this.name =name;

    }
    public String toString(){
        return "hi" ;
    }

    @Override
    public int compareTo(Students that) {
        if(this.age>that.age){
            return 1;
        }
        return -1;
    }

}


  class Solutions {
    public int mySqrt(int x) {
        // Use binary search to find the square root
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x, result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid*mid is equal to x
            if (mid == x / mid) {
                return mid;
            }

            // If mid*mid is less than x, move to the right
            if (mid < x / mid) {
                start = mid + 1;
                result = mid; // Store the result
            } else {
                end = mid - 1; // Move to the left
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solutions solution = new Solutions();
        int number = 9;
        int result = solution.mySqrt(number);

        System.out.println("Input: " + number);
        System.out.println("Output: " + result);
        System.out.println("Explanation: The square root of " + number + " is " + result + ".");
    }
}
