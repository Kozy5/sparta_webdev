public class Main {
    public static void main(String[] args) {
        // 세로 10 x 가로 15 영화관 좌석 만들기

        String[][] seats = new String[10][15];{
                char ch = 'A';
                for(int i =0; i<10; i++){
                    for(int j =0; j<15; j++){
                        seats[i][j] = String.valueOf(ch) + (j+1);
                    }
                    ch++;
                }
        }

        for(int i =0; i< 10; i++){
            for(int j =0; j< 15; j++){
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        seats[5][5]="__";
        seats[5][6]="__";
        for(int i =0; i< 10; i++){
            for(int j =0; j< 15; j++){
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

    }
}
