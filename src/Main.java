import java.util.ArrayList;
import java.util.Random;

public class Main {
    ArrayList<Integer> list = new ArrayList<>();

    Main(int n){
        for(int i = 0;i < n;i++){
            list.add(i+1);
        }
    }

    public int poll(){
        if(list.size() > 0){
            Random random = new Random();
            int popNum = list.get(random.nextInt(list.size()));
            list.remove((Integer)popNum);
            return popNum;
        }
        else return 0;
    }


    public static void main(String[] args) {
        Main m = new Main(10);
        for(int i = 0; i < 11;i++){
            System.out.println(m.poll());
        }
    }

}
