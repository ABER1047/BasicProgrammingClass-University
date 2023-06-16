public class Chapter19_2 {
    public static void main(String[] args) {
        Matrix ins_mat1 = new Matrix();
        ins_mat1.setData(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        Matrix ins_mat2 = new Matrix();
        ins_mat2.setData(new int[][] {{-1, -2, -3}, {4, 5, 6}, {-7, -8, -9}});

        Matrix ins_result_mat = new Matrix();

        System.out.println("두 행렬의 합:");
        ins_result_mat = ins_mat1.getAdded(ins_mat2);
        display(ins_result_mat.getData());

        System.out.println("두 행렬의 차:");
        ins_result_mat = ins_mat1.getSubtracted(ins_mat2);
        display(ins_result_mat.getData());

        System.out.println("두 행렬의 곱:");
        ins_result_mat = ins_mat1.getMultiplied(ins_mat2);
        display(ins_result_mat.getData());

        System.out.println("행렬의 전치-1:");
        ins_result_mat = ins_mat1.getTransposed();
        display(ins_result_mat.getData());

        System.out.println("행렬의 전치-2:");
        ins_result_mat = ins_mat2.getTransposed();
        display(ins_result_mat.getData());
    }

    public static void display(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Matrix {
    private int[][] arr;

    public void setData(int[][] arr) {
        this.arr = arr;
    }

    public int[][] getData() {
        return this.arr;
    }

    public Matrix getAdded(Matrix ins) {
        int[][] data = ins.getData();
        int[][] new_arr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                new_arr[i][j] = arr[i][j] + data[i][j];
            }
        }

        Matrix result = new Matrix();
        result.setData(new_arr);
        return result;
    }

    public Matrix getSubtracted(Matrix ins) {
        int[][] data = ins.getData();
        int[][] new_arr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                new_arr[i][j] = arr[i][j] - data[i][j];
            }
        }

        Matrix result = new Matrix();
        result.setData(new_arr);
        return result;
    }

    public Matrix getMultiplied(Matrix ins) {
        int[][] data = ins.getData();
        int[][] new_arr = new int[arr.length][data[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    new_arr[i][j] += arr[i][k] * data[k][j];
                }
            }
        }

        Matrix result = new Matrix();
        result.setData(new_arr);
        return result;
    }

    public Matrix getTransposed() {
        int[][] new_arr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                new_arr[j][i] = arr[i][j];
            }
        }

        Matrix result = new Matrix();
        result.setData(new_arr);
        return result;
    }
}
