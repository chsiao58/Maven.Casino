public class DStyleCrapsPlayer extends Player{
    Person person;
    Integer chips;
    Integer betchips;

    public DStyleCrapsPlayer(Person player) {
        this.person=player;
        //House house=new House(2);
       // chips=house.moneyToChips();
    }
    public  DStyleCrapsPlayer(Person player,Integer chips){
        this.person=player;
        this.chips=chips;
    }

    public Integer roll(Dice dice){
       Integer total= dice.tossAndSum();
        return total;
    }

//    public Integer numOfChips(){
//        if (person.getWallet()==0)
//            return null;
//     // return chips;
//
//    }

    public Integer bet(Integer betChips){
        this.betchips = betChips;
        chips=chips-betChips;
        return betChips;
    }
    public void earnedChips(Integer payOut){
        chips = chips+payOut;
    }

}
