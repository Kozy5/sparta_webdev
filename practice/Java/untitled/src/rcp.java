import javax.naming.MalformedLinkException;

public class rcp {
    public static void main(String[] args){

        System.out.println(rcpm());



        /*want : double chack
                want : double click*/

    }

    public static String rcpm(){
        double r = Math.random();
        double n = r * 10 ;
        String rcp1="";
        switch((int)n){
            case 1: rcp1= "주먹";
                break;
            case 2 : rcp1="주먹";
                break;
            case 3: rcp1= "주먹";
                break;
            case 4: rcp1= "가위";
                break;
            case 5: rcp1= "가위";
                break;
            case 6: rcp1= "가위";
                break;
            case 7: rcp1= "보";
                break;
            case 8: rcp1= "보";
                break;
            case 9: rcp1= "보";
                break;
        }
        return rcp1;
    }
}
