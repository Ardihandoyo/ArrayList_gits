import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        ArrayList<String> anime = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<>();

        anime.add("Date A Live IV");
        anime.add("Blue Period");
        anime.add("Sword Art Online Progressive");
        anime.add("Takt Op Destiny");
        anime.add("86 Cour 2");
        anime.add("Shuumatsu no Harem");

        int no=1;

        System.out.println("Daftar Anime Fall 2021 yang akan Rilis : \n" + anime);

        for (Iterator<String> iterator=anime.iterator(); iterator.hasNext();){
            String nom=(String) iterator.next();
            System.out.println("Array ke "+ no +" = "+ nom);
            no++;
        }

        numbers.add(no);
        System.out.println("");

        Scanner input = new Scanner(System.in);
        System.out.print("Input Judul diatas : ");
        String kata = input.nextLine();
        if (anime.contains(kata)) {

            System.out.println("Anime "+ kata +" Rilis Bulan Oktober ini");
        }else{
            System.out.println("Anime"+ kata +" Tidak tayang bulan ini");
        }



        // for (int i=0; i<anime.size(); i++) {
        //     for (int j=0; j<anime.size(); j++){
        //         System.out.print(".");
        //     }
        //     System.out.println(anime.get(i)+"");
        // }
        // String number = anime.get(2);
        // System.out.println("Accessed Element: " + number);

    }
    
}
