public class Presenter {

    public int selisih(int number1, int number2) {
        int result;
        if (number1 < number2){
            result = number2 - number1;
        }else {
            result = number1 - number2;
        }
        return result;
    }

    public String getWinner (int selisihPlayer, int selisihComputer, String nama){
        if (selisihPlayer < selisihComputer){
            return nama+" Win";
        }else if (selisihComputer < selisihPlayer){
            return "Computer Win";
        }else {
            return "Draw";
        }
    }

}
