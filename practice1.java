import java.util.Random;


public class practice1 {
    public static void main(String[] args){
        int age;
        Random rand = new Random();
        age = rand.nextInt(50);
        
        if(age>20){
            System.out.println("成人");
        }else if(age == 20){
            System.out.println("ハタチ");
        }else{
            System.out.println("未成年");
        }
        System.out.println(age);
    }
}
