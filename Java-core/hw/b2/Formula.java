
public class Formula {
    public float average(int[] array) {
        float sum = 0f;
        for (int a = 1; a <= array.length; a++) {
            sum += array[a];
        }
        return sum / array.length;
    }

    public int[] reverseArray(int[] array) {
        int s = 0;
        int e = array.length - 1;
        int n;
        while (s < e) {
            n = array[s];
            array[s] = array[e];
            array[e] = n;
            s++;
            e--;
        }
        return array;
    }

    public void listed(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }

    public int countOddNumber(int[] array) {
        int o = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                o++;
            }

        }
        return o;
    }

    public void listedButOddOnly(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ", ");
            }
        }

    }

    public void bmiRating(float height, float weight) {
        float bmi = (weight / (height * height));
        if (bmi >= 25.0f) {
            if (bmi >= 30.0f) {
                System.out.println("Rất nguy hiểm");
            } else {
                System.out.println("Quá cân");
            }
        } else {
            if (bmi >= 18.5) {
                System.out.println("Bình thường");
            } else {
                System.out.println("Nhẹ cân");
            }

        }

    }

    public void triangle(int N) {

        if (N < 10 && N > 3) { // Chọn số N theo điều kiện
            int i;
            int u;
            /* Vòng lặp tổng sẽ xuống với số dòng tương ứng với giá trị của N */
            for (i = 1; i <= N; i++) {
                System.out.println("");
                /*
                 * Vòng lặp cấp 2 tác dụng trong một dòng, sẽ chạy hết rồi mới quay lại vòng lặp
                 * tổng, sẽ vẽ "*" tương ứng với giá trị của i, i= 1 vẽ 1 *, i = 2 vẽ 2*,...
                 */
                for (u = i; u > 0; u--) {
                    System.out.print("* ");
                }
            }
        }
    }

    public void hollowTriangle(int N) {

        if (N < 10 && N > 3) { // Chọn số N theo điều kiện
            int i;
            int u;
            /* Vòng lặp tổng sẽ xuống với số dòng tương ứng với giá trị của N */
            for (i = 1; i <= N; i++) {
                System.out.println("");
                /*
                 * Giả sử N = m(số dòng cạnh trên) + n(số dòng cạnh dưới), ưu tiên cạnh trên tam
                 * giác dài hơn cạnh dưới. m, n nguyên dương.
                 */
                // N chẵn: m = N/2 + 1, n = N/2 -1.
                // N lẻ: m = n + 1. m = N/2 + 0.5.
                /*
                 * điều kiện 1: nếu số dòng (giá trị i) đã đến điểm giữa hay chưa, do N có thể
                 * chẵn, ưu tiên cạnh trên tam giác dài hơn cạnh dưới nên cho thêm N/2 + 1 (m).
                 * Bất kể N chẵn hay lẻ thì i sẽ vượt qua điểm giữa khi i = m + 1.
                 */
                if (i <= (N / 2 + 1)) {
                    for (u = i; u > 0; u--) { /* vòng lặp cấp 2 trong điều kiện số dòng chưa vượt qua điểm giữa */
                        /*
                         * vẽ "*" theo giá trị của i như câu 6, nhưng chỉ tối đa là 2 "*" ở đầu và cuối
                         * dòng, nên đặt điều kiện chỉ vẽ * khi u có giá trị đầu tiên (u = i) và giá trị
                         * cuối cùng (u = 1) bởi u = 0 thì không vẽ "*"
                         */
                        if (u == i || u == 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print(
                                    "  "); /* nếu không phải giá trị đầu cuối thì thêm khoảng trắng vào giữa "  " */
                        }
                    }
                } else { /* vòng lặp cấp 2 trong điều kiện số dòng đã qua điểm giữa */

                    if (N % 2 == 1) { /* điều kiện 2 nếu N là số lẻ */
                        for (u = (N + 1) - i; u > 0; u--) {
                            /*
                             * Vẫn tiếp tục vẽ "*" ở giá trị đầu và cuối, đổi u = (N + 1) - i vì lúc này i =
                             * m + 1 . (N + 1) - i <=> (m + n + 1 ) - m -1 = n, số dòng cạnh dưới.
                             */
                            if (u == (N + 1) - i || u == 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }

                    } else { /* điều kiện 2 nếu N là số chẵn */
                        for (u = (N + 1) - i; u > 0; u--) {

                            if (u == (N + 1) - i || u == 1) {
                                System.out.print("*  ");
                            } else {
                                System.out.print("   "); // tăng thêm vài lần " " cho cân đối :v
                            }
                        }

                    }

                }

            }
        }
    }

    public void rectangle(int h, int w) {
        int i;
        int u;
        if (h > 3 && h < 9 && w > 3 && w < 9) { /* điều kiện để 3 < A, B < 9 */
            for (i = 1; i <= h; i++) { /* xuống dòng theo chiều cao h */
                System.out.println("");
                if (i == 1 || i == h) { /*
                                         * điều kiện 1 nếu là dòng đầu hoặc dòng cuối sẽ lấp đầy sao theo giá trị chiều
                                         * rộng
                                         */
                    for (u = 1; u <= w; u++) {
                        System.out.print("* ");
                    }
                } else {
                    for (u = 1; u <= w; u++) {
                        if (u == 1 || u == w) { /*
                                                 * điều kiện 2 nếu không phải dòng đầu và cuối chỉ điền sao vào giá trị
                                                 * đầu và cuối của chiều rộng, còn lại điền khoảng trắng " "
                                                 */
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            }
        }

    }

}
