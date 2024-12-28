public class TwoDimentionalArray {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3;
        matrix[1][0] = 4; matrix[1][1] = 5; matrix[1][2] = 6;
        matrix[2][0] = 7; matrix[2][1] = 8; matrix[2][2] = 9;

        int [][] matrix2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("========================================");

        for (int[] i : matrix2){
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
    }
    
}
