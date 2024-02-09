public class Players {
     private Player human;
     private Player computer;

     public Players() {
        this.human = new Player(human:true);
        this.computer = new Player(human:false);

    }
    public Player  getHumanPlayer(){
        return this.human;
    }
}
