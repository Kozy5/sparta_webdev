public class _Quiz_05 {
    public static void main(String[] args) {
        int size = 245;
        int up = 5;
        String[] shooseList = new String[10];

        for (int i = 0; i < shooseList.length; i++) {
            shooseList[i] = String.valueOf(size+up);
            up+=5;
            System.out.println("사이즈"+shooseList[i]+"(재고 있음)");
        }
    }

}

