public class Trips implements Tripsuliides {
        private char[][] board = new char[3][3];
        private char[] dataChar = new char[9];
        private String[] dataInt = new String[9];
        private char turn;
        private char turnHelp;
        private int datac = 0;
        private int datai = 0;

        public void alusta(char symbol){
            this.turn=symbol;
        }
        public char kelleKord(){
            return turn;
        }
        public void paiguta(int rida, int veerg){
            board[rida-1][veerg-1] = turn;
            for(int i= 0; i<3; i++){
                for(int j= 0; j<3; j++) {
                        //System.out.print(board[i][j]);
                    }
                    //System.out.println();
                }
                //System.out.println("---");
            if(turn == 'X'){
                turnHelp = 'X';
                turn = '0';
            } else {
                turnHelp = '0';
                turn = 'X';
            }
        }

        public void salvesta(int rida, int veerg){
          dataChar[datac] = turnHelp;
          System.out.println(dataChar[datac]);
          datac++;
          dataInt[datai] = rida + " " + veerg;
          System.out.println(dataInt[datai]);
          datai++;

        }

        public static void main(String[] args){
            Trips laud = new Trips();
            laud.alusta('X');
            //System.out.println("Mängu alustab" + laud.kelleKord());
            laud.paiguta(1,1);
            laud.salvesta(1,1);
            laud.paiguta(1,2);
            laud.salvesta(1,2);
            laud.paiguta(1,3);
            laud.salvesta(1,3);
            laud.paiguta(2,1);
            laud.paiguta(2,2);
            laud.paiguta(2,3);
            laud.paiguta(3,1);
            laud.paiguta(3,2);
            laud.paiguta(3,3);
            //System.out.println(laud.kelleKord());
            }
}
