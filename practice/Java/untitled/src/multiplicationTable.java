public class multiplicationTable {
    public static void main(String[] args){
        multipleicationTable(5);

    }
    /*public static void multipleicationTable(int num1){
        for(int i=num1; i<num1+1; i++){
            for(int j=1; j<10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println();
        }
    }*/

    public static void multipleicationTable(int num1){
        for(int i=1; i<10; i++){
            System.out.println(num1+"x"+i+"="+(num1*i));
        }
    }
}
