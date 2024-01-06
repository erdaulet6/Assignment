public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public void setElement(int row, int column, double value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            matrix[row][column] = value;
        } else {
            System.out.println("Invalid matrix indices.");
        }
    }

    public double getElement(int row, int column) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            return matrix[row][column];
        } else {
            System.out.println("Invalid matrix indices.");
            return 0.0;
        }
    }

    public void add(Matrix otherMatrix) {
        if (rows == otherMatrix.rows && columns == otherMatrix.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] += otherMatrix.getElement(i, j);
                }
            }
        } else {
            System.out.println("Matrices have different dimensions and cannot be added.");
        }
    }

    public void multiplyByNumber(double number) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] *= number;
            }
        }
    }

    public void multiply(Matrix otherMatrix) {
        if (columns == otherMatrix.rows) {
            double[][] result = new double[rows][otherMatrix.columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < otherMatrix.columns; j++) {
                    for (int k = 0; k < columns; k++) {
                        result[i][j] += matrix[i][k] * otherMatrix.getElement(k, j);
                    }
                }
            }

           
            matrix = result;
            columns = otherMatrix.columns;
        } else {
            System.out.println("Invalid matrix dimensions for multiplication.");
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        Matrix matrix2 = new Matrix(3, 2);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);
        matrix2.setElement(2, 0, 11);
        matrix2.setElement(2, 1, 12);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        System.out.println("\nMatrix 2:");
        matrix2.printMatrix();

        System.out.println("\nAdding Matrix 1 and Matrix 2:");
        matrix1.add(matrix2);
        matrix1.printMatrix();

        System.out.println("\nMultiplying Matrix 1 by 2:");
        matrix1.multiplyByNumber(2);
        matrix1.printMatrix();

        System.out.println("\nMultiplying Matrix 1 and Matrix 2:");
        matrix1.multiply(matrix2);
        matrix1.printMatrix();
    }
}
