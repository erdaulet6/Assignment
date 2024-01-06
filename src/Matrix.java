import java.util.Scanner;

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
            System.out.println("Invalid row or column index.");
        }
    }

    public void add(Matrix otherMatrix) {
        if (this.rows == otherMatrix.rows && this.columns == otherMatrix.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    this.matrix[i][j] += otherMatrix.matrix[i][j];
                }
            }
        } else {
            System.out.println("Matrix dimensions do not match for addition.");
        }
    }

    public void multiply(double scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] *= scalar;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiply(Matrix otherMatrix) {
        if (this.columns == otherMatrix.rows) {
            double[][] result = new double[this.rows][otherMatrix.columns];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < otherMatrix.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        result[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];
                    }
                }
            }
            this.matrix = result;
            this.columns = otherMatrix.columns;
        } else {
            System.out.println("Invalid matrix multiplication. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Matrix 1: ");
        int rows1 = scanner.nextInt();

        System.out.print("Enter the number of columns for Matrix 1: ");
        int columns1 = scanner.nextInt();

        Matrix matrix1 = new Matrix(rows1, columns1);

        System.out.println("Enter the elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print("Matrix1[" + i + "][" + j + "]: ");
                double element = scanner.nextDouble();
                matrix1.setElement(i, j, element);
            }
        }

        System.out.print("Enter the number of rows for Matrix 2: ");
        int rows2 = scanner.nextInt();

        System.out.print("Enter the number of columns for Matrix 2: ");
        int columns2 = scanner.nextInt();

        Matrix matrix2 = new Matrix(rows2, columns2);

        System.out.println("Enter the elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print("Matrix2[" + i + "][" + j + "]: ");
                double element = scanner.nextDouble();
                matrix2.setElement(i, j, element);
            }
        }

        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("Matrix 2:");
        matrix2.print();

        // Test addition
        matrix1.add(matrix2);
        System.out.println("After addition:");
        matrix1.print();

        // Test multiplication by a scalar
        System.out.print("Enter a scalar value for multiplication: ");
        double scalar = scanner.nextDouble();
        matrix1.multiply(scalar);
        System.out.println("After multiplication by " + scalar + ":");
        matrix1.print();

        // Test matrix multiplication (optional)
        if (matrix1.columns == matrix2.rows) {
            matrix1.multiply(matrix2);
            System.out.println("After matrix multiplication:");
            matrix1.print();
        }

        scanner.close();
    }
}
