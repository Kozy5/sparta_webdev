public class _Quiz_06 {
    public static void main(String[] args){
        String name ="나코딩"; // 이름
        String id = "990130-1234567"; // 주등
        String phone ="010-1234-5678"; // 폰

        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민등록번호 : " + getHiddenData(id,8));
        System.out.println("전화번호 : " + getHiddenData(phone,9));
    }

    public static String getHiddenData(String info,int index){
        String hiddenData = info.substring(0,index);
        for(int i=0; i<info.length()-index;i++){
            hiddenData+="*";
        }
        return hiddenData;
    }
    /*public static String getHiddenData(String info, int index){
        String result ="";
        switch(info.length()){
            case 3 : result=info.substring(0,index)+"**";
            break;
            case 14 :  result = info.substring(0,index) + "******";
            break;
            case 13 : result = info.substring(0,index) + "****";
            break;
            default : result = String.valueOf(info.length());
        }

        return result;
    }*/
    /*public static String getHiddenData(String info, int index){
        String result ="";
        switch(info.length()){
            case 3 : result=info.substring(0,index);
                break;
            case 14 :  result = info.substring(0,index);
                break;
            case 13 : result = info.substring(0,index);
                break;
            default : result = String.valueOf(info.length());
        }
        for(int i=0; i<info.length()-index; i++){
            result+="*";
        }
        return result;
    }*/
}


