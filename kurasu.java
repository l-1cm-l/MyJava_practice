class Student{
    String name = "sato";
    public void calculateAvg(int math,int english){
        System.out.println((math+english)/2);
    }
}

public class kurasu {
    public static void main(String args[]){
        Student a0001 = new Student();
        a0001.name = "sato";
        System.out.println(a0001.name);
    }
}
