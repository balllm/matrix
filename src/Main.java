public class Main {
    public static void main(String[] args) {
        int[][]matrix = {
                {0, 0 , 1},
                {1, 1, 1},
                {0, 1, 0}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 1){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = 1;
                }

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}