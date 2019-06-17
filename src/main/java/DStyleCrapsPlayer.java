public class DStyleCrapsPlayer extends Player{
    Person person;
    Integer chips;
<<<<<<< HEAD
=======
    Integer betchips;


//        House house=new House(2, null);
//        chips=house.moneyToChips(20.0);



    public  DStyleCrapsPlayer(Person player,Integer chips){
>>>>>>> ada73ca9ac4742d37a82da0884bebf26e8ff6d52
        this.person=player;
        House house=new House(2, null);
        chips=house.moneyToChips(20.0);

    }

    public Integer roll(Dice dice){
       Integer total= dice.tossAndSum();
        return total;
    }
<<<<<<< HEAD
    public Integer numOfChips(){
        if (person.getWallet()==0)
            return null;
        else
        return chips;
        
    }
=======
>>>>>>> ada73ca9ac4742d37a82da0884bebf26e8ff6d52
    public Integer bet(Integer betChips){
        chips=chips-betChips;
        return betChips;
    }

}
