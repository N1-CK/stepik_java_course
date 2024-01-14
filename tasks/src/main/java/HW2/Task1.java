package HW2;// Посчитайте сколько драгоценных камней в куче обычных камней Пример: jewels = “aB”, stones = “aaaAbbbB” Результат в консоль ”a3B1”
import java.util.Scanner;
class Task_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(findJewelsInStones(a, b));
        sc.close();
    }
    public static String findJewelsInStones(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < b.length(); j++) {
                if(b.charAt(j) == a.charAt(i)){
                    cnt++;
                }
            }
            if(cnt > 0){
                result = result + a.charAt(i) + cnt; 
            }
        }
        return result;
    }
}