package com.company;
import java.util.ArrayList;


public class TheAuthor {
    public ArrayList<String> Autors;
    public String b1 = "Мертвая зона";
    public String b2 = "Оно";
    public String b3 = "Институт";
    public String b4 = "Два капитана";
    public String b5 = "Зеленая миля";

    public static void main(String[] args){

     ArrayList<String> authors = new ArrayList<String>(4);

     authors.add("Стивен Кинг");
     authors.add("Джоан Роулинг");
     authors.add("Уильям Гибсон");

     System.out.println(authors);

        System.out.printf("arrayList has %d elements \n", authors.size()); // Количество объектов в списке

        for (String person : authors) {  // Ну тут мои полномочия все
            System.out.println(authors);

        }
        if (authors.contains("Стивен Кинг")) {
            // Проверка наличия элемента
            System.out.println("Arraylist содержит Стивен Кинг");
        }
        authors.remove("Стивен Кинг");                         // Удаление элемента из списка
        authors.remove("Уильям Гибсон");


 }

    public static class TheBooks {

        public String s;
    public static void main(String[] args){

        System.out.println("ЗДАРОВА БАНДИТЫ");

    }








      //  public ArrayList<String> Books;

        //    ArrayList<String> books = new ArrayList<String>();

            //books.add("Мертвая зона");                      // Добавление элементов в список
            //books.add("Чужак");
            //books.add(1, "Институт");
            //System.out.println(books.get(1));
            //System.out.printf("ArrayList has %d elements \n", books.size());

    //        for (String person : books) {
             //   System.out.println(books);

      //      }
        //    if (books.contains("Мертвая зона")) {
                                                                      // Проверка наличия элемента
          //      System.out.println("Arraylist содержит Мертвую зону");
           // }
           /// books.remove("Чужак");                         // Удаление элемента из списка

          //  Object[] booksArray = books.toArray();

          //  for (Object person : booksArray) ;

           // System.out.println(books);

        }
}

