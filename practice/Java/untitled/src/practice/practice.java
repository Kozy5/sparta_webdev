package practice;

public class practice {
    public static void main(String[] args) {
        sayhello();

        sumNum(2);

        String ourNum = giveNum();
        System.out.println(ourNum);

        System.out.println(sumFor5(2));
    }
    // Method
    public static void sayhello(){
        System.out.println("hello");
    }

    //parameter
    public static void sumNum(int number){
        int sum = number+number;
        System.out.println(sum);
    }


    // return
    public static String giveNum(){
        String hotelNum = "010-2787-5467";
        return hotelNum;
    }

    // parameter and return
    public static int sumFor5(int number){
        int sum = number+5;
        return sum;
    }
}
