public class Player {
    private char symbol;
    private final static char humanPlayer = 'X';
    private final static char computerPlayer = 'O';

    public Player(Player player){
        if (player){
            this.symbol = humanPlayer;
        }else{
            this.symbol = computerPlayer;
        }
    }
public char getSymbol(){
    return this.symbol;
} 
public  boolean isHuman(){
    return this.symbol == humanPlayer;
}

}
