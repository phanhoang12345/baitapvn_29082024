package btvn_29082024;
import java.util.ArrayList;
import java.util.Scanner;

public class btvn_29082024 {

    // 1. Method nhập mảng số thực
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    // 2. Method xuất mảng ra màn hình
    public static void printData(float[] arrays) {
        System.out.print("Mảng số thực: ");
        for (float value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 3. Method tìm giá trị phần tử lớn thứ 2 trong mảng
    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;
        for (float value : arrays) {
            if (value > max1) {
                max2 = max1;
                max1 = value;
            } else if (value > max2 && value < max1) {
                max2 = value;
            }
        }
        return max2;
    }

    // 4. Method Xoá các phần tử lẻ ra khỏi mảng
    public static float[] deleteOddNumber(float[] arrays) {
        ArrayList<Float> list = new ArrayList<>();
        for (float value : arrays) {
            if (value % 2 == 0) {
                list.add(value);
            }
        }
        float[] newArray = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }

    // Method main để sử dụng các method ở trên
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        float[] arrays = new float[n];

        // Nhập dữ liệu vào mảng
        arrays = importData(arrays);

        // Xuất mảng ra màn hình
        printData(arrays);

        // Tìm phần tử lớn thứ 2
        float max2 = findMax2(arrays);
        System.out.println("Phần tử lớn thứ 2 trong mảng: " + max2);

        // Xóa các phần tử lẻ
        arrays = deleteOddNumber(arrays);
        System.out.print("Mảng sau khi xoá các phần tử lẻ: ");
        printData(arrays);
    }
}


