public class values {

    public static void main(String[] args) {
        int x=1;
        int y =2;
        int z=x++;
        System.out.println(z);
        System.out.println(x);
    }
}
class findlargest{
    public static void main(String[] args) {
        int a[]={5,6,7,1,2,3,4,8,9,10};
        int b ;
        int i =1;
        while(i<=9){
            b=a[i];
            if(b<a[i]){
                System.out.println(b);
            } else if (b>a[i]) {
                System.out.println(b);

            }
            i++;

        }
    }
}


class hallowdiamond{
    public static void main(String[] args) {
        Object s =new Object().toString();
   String s2 =new String().toString();
    }
}