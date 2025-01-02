public class reverse {
}
class Myclass
{
    String user="       string huhuhuhuhu             " ;
    String[] value=null;
    String res="";
    String fres="";

    void call()
    {
        user =user.trim();
        value=user.split("");
        for(int i=0;i<=value.length-1;i++)
        {

            if(value[i].equalsIgnoreCase("i"))
            {
                int x=i;
                String h[]=res.split("");
                for(int j=h.length-1;j>=0;j--)
                {
                    fres=fres+h[j];
                }
                String q=user.substring(x+1, user.length());
                fres=fres+q;
            }
            res=res+value[i];
        }
        System.out.println("The Final output is "+fres);
    }
}
class Main2 {
    public static void main(String[] args) {
        Myclass mc=new Myclass();
        mc.call();
    }
}
