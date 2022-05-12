import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        animalList();
        bookList();
        tvShow();
        theFinalCountdown();
    }

    private static void theFinalCountdown() {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(23);
        counter1.increase();
        counter1.decrease();
        counter2.decrease(3);
        counter2.increase(5);

    }

    private static void tvShow() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> tvlist = new ArrayList<>();
        TvShow show1 = new TvShow();
        show1.setName("Euphoria");
        show1.setEpisodes(12);
        show1.setGenre("Drama");
        TvShow show2 = new TvShow(24);
        show2.setName("24");
        show2.setGenre("Drama");
        TvShow show3 = new TvShow("The Mighty Boosh");
        show3.setEpisodes(33);
        show3.setGenre("Comedy");
        TvShow show4 = new TvShow("Better Call Saul", 30, "Comedy/Drama");
        tvlist.addAll(Arrays.asList(show1, show2, show3, show4));
        while(true){
            System.out.println("Name of the show:");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("How many episodes?");
            String epi = scanner.nextLine();
            System.out.println("What is the genre?");
            String genre = scanner.nextLine();
            int episodes = Integer.parseInt(epi);
            tvlist.add(String.valueOf(new TvShow(name, episodes,genre)));
        }
        for (Object o: tvlist){
            System.out.println(o.toString());
        }
    }

    private static void bookList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Three Body Problem", 302, 2014));
        Book book1 = new Book();
        book1.setTitle("My problem with Pachapa");
        book1.setPages(1002);
        book1.setYear(2022);
        Book book2 = new Book(233);
        book2.setTitle("Why I love Java");
        book2.setYear(2019);
        bookList.addAll(Arrays.asList(book1, book2));
        bookList.add(new Book("The Dark Forest", 400, 2015));
        bookList.add(new Book("Death's End", 592, 2010));
        System.out.println("What information will be printed?");
        String reply = scanner.nextLine();

        for (int i=0; i<bookList.size();i++){
            if(reply.equalsIgnoreCase("everything")){
                System.out.println(bookList.get(i).toString());
            }else if(reply.equalsIgnoreCase("name")){
                System.out.println(bookList.get(i).getTitle());
            }else{
                System.out.println("That is not an applicable reply");
            }
        }
    }

    public static void animalList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Animal Menu" + "\n"+"Entering nothing will stop the loop");
        ArrayList<Animal> list = new ArrayList<>();
        Animal dog1 = new Animal();
        dog1.setName("Dog");
        dog1.setIsDog(true);
        Animal cat = new Animal("Cat");
        cat.setIsDog(false);
        Animal tiger = new Animal(false);
        tiger.setName("Tiger");
        list.addAll(Arrays.asList(dog1, cat, tiger));

        while(true){
            System.out.println("Please enter a name: ");
            String name = scanner.nextLine();
            if(name.equalsIgnoreCase("")){
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String doggy = scanner.nextLine();
            boolean dog;
            dog=doggy.equalsIgnoreCase("yes");
            list.add(new Animal(name, dog));

        }
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }


    }





}



