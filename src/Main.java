import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> buy = new ArrayList<>();
        while (true){
            System.out.println("Выберите операцию");
            System.out.println("1.Добавить");
            System.out.println("2.Показать");
            System.out.println("3.Удалить");
            System.out.println("4.Найти");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(Integer.parseInt(input)==1){
                System.out.println("Какую покупку хотите добавить?");
                buy.add(scanner.nextLine());
                System.out.println("Итого в ссписке покупок: "+ buy.size());
            }
            if (Integer.parseInt(input)==2){
                for (int i =0;i<buy.size();i++){
                    System.out.println((i+1) + ". " + buy.get(i));
                }
            }
            if (Integer.parseInt(input)==3){
                for (int i =0;i<buy.size();i++){
                    System.out.println((i+1) + ". " + buy.get(i));
                }
                System.out.println("Какую покупку хотите удалить? Введите номер или название");
                if(scanner.hasNextInt()){
                    String input1 = scanner.nextLine();
                    buy.remove(Integer.parseInt(input1)-1);
                }
                else {
                    String input1 = scanner.nextLine();
                    buy.remove(input1);
                }
            }
            if (Integer.parseInt(input)==4){
                System.out.println("Введите текст для поиска");
                String input2 = scanner.nextLine();
                String productLower = input2.toLowerCase();
                System.out.println("Найдено:");
                for(int i=0;i<buy.size();i++){
                    String buyLower = buy.get(i).toLowerCase();
                    if (buyLower.contains(productLower)){
                        System.out.println((i+1)+". " + buy.get(i));
                    }
                }

            }

        }
    }
}