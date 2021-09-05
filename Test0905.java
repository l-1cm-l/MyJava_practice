public class Test0905 {
    public static void main(String args[]){
    for(int i = 0;i < 5;i++){
    for(int j = 5;j < 10;j++){
        if(i==4){
            break;
        }
        if(i==1){
            continue;
        }
        if(i+j == 8){
            System.out.println("大当たり");
        }
        System.out.println(i+ "_" +j);
    }
   }
 }
}
