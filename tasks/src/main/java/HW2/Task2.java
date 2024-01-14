package HW2;

// Task_1
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// Пример: s = "cba", index = [3,2,1] result "abc"
class Task_1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        String result = shuffle(s, index);
        System.out.println(result);
    }

    public static String shuffle(final String s, final int[] index) {
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            result[index[i] - 1] = chars[i];
        }

        return new String(result);
    }
}
