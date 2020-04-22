/**
 * description: RecurrenceFunction 递归函数
 * date: 2019/11/27 10:54 上午
 * author: guizhenyu
 */
public class RecurrenceFunction {

    // test
    static int getValue(int[] values, int length) {
        if (length <= 0)
            return 0;
        int tmpMax = -1;
        for (int i = 0; i < length; i++) {
            System.out.println("i:" + i);
            System.out.println("values[i]:" + values[i]);
            tmpMax = Math.max(tmpMax, values[i] + getValue(values, length - i - 1));
            System.out.println("inner length: " + length);
            System.out.println("inner tmpMax: " + tmpMax);
        }
        System.out.println("length ===========================:" + length);

        System.out.println(tmpMax);
        return tmpMax;
    }

    public static void main(String[] args) {
        int[] values = new int[]{1, 2, 6, 4, 5};
        int rodLength = values.length;
        System.out.println("Max rod value: " + getValue(values, rodLength));
    }



}
