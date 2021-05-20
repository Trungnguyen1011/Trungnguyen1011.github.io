

public class HomeWork {
    public static void main(String[] args) {


        System.out.println("Bài tập về nhà");
        Formula formula = new Formula();
        int[] array = new int[] {10, 20, 30 ,40 ,50};
        System.out.println("Câu sô 1: Tính trung bình tổng các số trong mảng: ");
        System.out.print("[ ");
        formula.listed(array);
        System.out.println("] ");
        System.out.println("Bài toán có kết quả là: " + formula.average(array));

        

        int[] reverseMe = new int[] {1, 2, 3 ,4 ,5};
        System.out.println("Câu số 2: Đảo ngược thứ tự mảng sau: ");
        System.out.print("[ ");
        formula.listed(reverseMe);
        System.out.println("] ");
        System.out.println("Có kết quả là: "); 
        formula.reverseArray(reverseMe);
        System.out.print("[ ");
        formula.listed(reverseMe);
        System.out.println("] ");
        
        int[] howManyOddinME = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Câu số 3: Số lượng số lẻ trong mảng này: ");
        System.out.print("[ ");
        formula.listed(howManyOddinME);
        System.out.println("] ");
        System.out.println("là: " + formula.countOddNumber(howManyOddinME));

        int[] sortOutTheOdd = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Câu số 4: Những sô lẻ của mảng này: ");
        formula.listed(sortOutTheOdd);
        System.out.println("là: ");
        System.out.print("[ ");
        formula.listedButOddOnly(sortOutTheOdd);
        System.out.println("] ");

        float height = 1.74f;
        float weight = 80.0f;
        System.out.println("Câu số 5: Đánh giá thể trạng qua chỉ số BMI: ");
        System.out.println("Thể trạng của người có cân nặng " + weight + "kg" 
        + " và chiều cao là " + height + "m được cho là "
        ); 
        formula.bmiRating(height, weight);


    }

}

