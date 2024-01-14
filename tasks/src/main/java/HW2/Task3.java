package HW2;// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
import java.util.Scanner;
class Task_2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
      int n = sc.nextInt();
      sc.nextLine();
      String[] book = new String[n];
      for (int i = 0; i < n; i++) {
        book[i] = sc.nextLine();
      }
  
      int m = sc.nextInt();
      sc.nextLine();
      String[] allergens = new String[m * 2];
      String[] replacements = new String[m * 2];
      for (int i = 0; i < m * 2; i += 2) {
        String[] allergenAndReplacement = sc.nextLine().split(" - ");
        allergens[i] = allergenAndReplacement[0];
        allergens[i + 1] = String.valueOf(allergenAndReplacement[0].charAt(0)).toUpperCase() + allergenAndReplacement[0].substring(1);
        replacements[i] = allergenAndReplacement[1];
        replacements[i + 1] = String.valueOf(allergenAndReplacement[1].charAt(0)).toUpperCase() + allergenAndReplacement[1].substring(1);
      }
      sc.close();
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m * 2; j++) {
          book[i] = book[i].replaceAll(allergens[j], replacements[j]);
        }
      }
  
      for (String line : book) {
        System.out.println(line);
      }
    }
  }