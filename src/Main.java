import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {

        System.out.print("Masukan Nama : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String namaPlayer;
        namaPlayer = br.readLine();
        System.out.println(namaPlayer+" vs Computer");
        System.out.println("------------------------");

        Presenter presenter = new Presenter();
        int [] listNumber = {0,1,2,3,4,5,6,7,8,9};
        int round = 0;
        int scorePlayer = 0;
        int scoreComputer = 0;

        do {
            System.out.print(namaPlayer+" masukan tebakan : ");
            String inputPlayer = br.readLine();
            int tebakPlayer = Integer.parseInt(inputPlayer);

            int random = new Random().nextInt(listNumber.length);
            int tebakComputer = listNumber[random];
            System.out.println("Tebakan Computer : "+tebakComputer);

            int nomor = new Random().nextInt(listNumber.length);
            int nomorAcak = listNumber[nomor];
            System.out.println("Nomor Acak : "+nomorAcak);

            int selisihPlayer = presenter.selisih(tebakPlayer,nomorAcak);
            int selisihComputer = presenter.selisih(tebakComputer,nomorAcak);

            String winner = presenter.getWinner(selisihPlayer,selisihComputer,namaPlayer);

            System.out.println("selisih "+namaPlayer+" : "+ selisihPlayer);
            System.out.println("selisih Computer : " +selisihComputer);
            System.out.println("Hasil : "+winner);
            System.out.println("------------------------");


            if (winner.equals(namaPlayer + " Win")){
                scorePlayer ++;
            }else if (winner.equals("Computer Win")){
                scoreComputer ++;
            }

            round ++;

        }while (round < 3);

        System.out.println("Score "+namaPlayer+" : "+scorePlayer);
        System.out.println("Score Computer : "+scoreComputer);
        if (scorePlayer > scoreComputer){
            System.out.println(namaPlayer+" Win");
        }else if (scoreComputer > scorePlayer){
            System.out.println("Computer Win");
        }else {
            System.out.println("Draw");
        }


    }
}
