package oldone;

public class RotateMatrix90Degrees {
    public static void main(String[] args)
    {
        //4X5
        Integer[][] matrix = new Integer[][]{{1,2,3,4,10},{5,6,7,8,10},{9,10,11,12,10},{13,14,15,16,10}};

        System.out.printf("Matrix %dx%d\n",matrix.length, matrix[0].length);
        printMatrix(matrix);
        rotateMatrix(matrix);
        printMatrix(matrix);
    }

    private static Integer[][] rotateMatrix(Integer[][] matrix){
       //TODO :-(
        for(int r=0; r<matrix.length; r++) {
            for (int c = 0; c < matrix[r].length -1; c++) {
                swapValue(matrix[r][c],matrix[c][(matrix[r].length-1-c)]);
            }
        }
        return matrix;
    }

    private static void swapValue(Integer matrix, Integer matrix1) {
    }

    private static void printMatrix(Integer[][] matrix){
        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[r].length; c++){
                System.out.printf("Value at %dx%d = %d \t", r,c,matrix[r][c]);
            }
            System.out.printf("\n");
        }
    }
}
