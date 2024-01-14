package HW1;// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

// class EquationSolver {
//     public static void main(String[] args) {
//         String str1 = "4? + 6? = 6?";
//         String[] parts = str1.split("\\s+");
//         String q = parts[0];
//         String w = parts[2];
//         String e = parts[4];
//         int cnt = 0;
//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j < 10; j++) {
//                 for (int k = 0; k < 10; k++) {
//                     if (Integer.parseInt(q.replace("?", Integer.toString(i))) + 
//                         Integer.parseInt(w.replace("?", Integer.toString(j))) ==
//                         Integer.parseInt(e.replace("?", Integer.toString(k)))) {
//                         cnt++;
//                         System.out.println(q.replace("?", Integer.toString(i)) + " + " + 
//                             w.replace("?", Integer.toString(j)) + " = " + Integer.parseInt(e.replace("?", Integer.toString(k))));
//                             break;
//                     }
//                 }
//             }
//         }
//         if (cnt == 0) {
//             System.out.println("Нет решения");
//         }
//     }
// }
