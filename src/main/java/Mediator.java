import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mediator {
    private Console console;
    private Person person;
    private Boolean gameContinue;

    public Mediator() {
        this.console = new Console(System.in, System.out);
        gameContinue = true;
        enterLounge();
        while (gameContinue) {
            String input = console.getStringInput("What would you like to do?");
            parseInput(input);
        }

    }


    public void enterLounge(){
        console.println("Welcome to our casino, Prasanthi's Palace!");
        this.person = makePerson();
        console.println(String.format("Welcome %s", person.getName()));
        console.println("You are currently in the lounge.");
        console.println("While in the lounge you can get a drink or a bite to eat.");
    }


    private void playCraps() {
        if (isUnderage()) {
            printUnderageWarning();
        } else {
            return;
        }
    }

    private void playBlackJack() {
        if (isUnderage()) {
            printUnderageWarning();
        } else {
            return;
        }
    }


    private void playCeeLo() {
        if (isUnderage()) {
            printUnderageWarning();
        } else {
            return;
        }
    }

    private void playPoker() {
        if (isUnderage()) {
            printUnderageWarning();
        } else {
            return;
        }
    }

    private void playPalace() {
    }

    public Person makePerson() {
        console.println("Tell us a little about yourself");
        Integer age = console.getIntegerInput("How old are you?");
        String name = firstLetterUppercase(console.getStringInput("What's your name?"));
        //Double wallet = (age >= 21) ? console.getDoubleInput("How much money do you want to bet today?") : 0.0;
        Double wallet = console.getDoubleInput("How much money have you brought with you today?");
        return new Person(wallet, name, age);
    }

    public void printOptions() {
        console.println("There are five games available to play :");
        console.print("1) Palace\n2) Texas Hold 'Em\n3) Black Jack\n4) Cee-lo\n5) Dolio Style Craps\n");
        console.println("If you don't feel like playing, remember you can get some food or a drink.");
//        console.println("Let us know what you want to do");
    }

    public void getDrink() {
        console.println("Welcome to Will's Watering Hole");
        if (isUnderage()) console.println("We will only serve you non-alcoholic drinks.");
        if (person.getWallet() < 8) {
            String response = console.getStringInput("Drinks are not complementary and you are short. Would you like some water?");
            if (response.equals("yes")) console.println("Water, and be on your way. Seats are for paying customers.");
            else console.println("Back to the lounge and bring some money next time.");
        }
        else {
            String drink = firstLetterUppercase(console.getStringInput("I can make you any drink, any way you want. What would you like?"));
            console.println(String.format("%s, served just the way you like it. That'll be 8 dollars", drink));
            person.setWallet(person.getWallet()-8);
            String finished = console.getStringInput("Done drinking?");
            if (finished.equals("yes")) console.println("Sorry, we have a one drink limit. You'll have to leave now");
            else console.println("Too bad, someone else needs your stool. Take your drink with you.");
        }
        console.println("You have returned to our luxurious lounge.");
    }
    public void getFood() {
        console.println("Welcome to Stefun's Sustainable Eatery");
        if (person.getWallet() < 15) console.println("C'mon, how're you going to eat with that amount of money. You can have some water.");
        else {
            String food = firstLetterUppercase(console.getStringInput("We can make just about anything. What do you want?"));
            console.println(String.format("%s, straight from the kitchen. Fifteen dollars please.", food));
            person.setWallet(person.getWallet()-15);
            String finished = console.getStringInput("Done eating?");
            if (finished.equals("yes")) console.println("Sorry, we have quite the wait. I'd appreciate it if you could leave");
            else console.println("Too bad, someone else needs your table. Here's a container for your food.");
        }
        console.println("You have returned to the beautiful lounge.");
    }

    public void parseInput(String input){
        Action action = new Action(input);
        Act act = action.getAct();
        switch (act) {
            case QUIT:
                leaveGame();
                break;
            case PLAY:
                printOptions();
                break;
            case DRINK:
                getDrink();
                break;
            case EAT:
                getFood();
                break;
            case PALACE:
                playPalace();
                break;
            case POKER:
                playPoker();
                break;
            case CEELO:
                playCeeLo();
                break;
            case BLACKJACK:
                playBlackJack();
                break;
            case CRAPS:
                playCraps();
                break;
            case LOUNGE:
                enterLounge();
                break;
            case UNKNOWN:
                console.println("We're not sure what you meant by that. Can you be more specific?");
                break;
        }
    }

    private void leaveGame() {
        console.println("We're sorry to see you go!");
        gameContinue = false;
    }

    private Boolean isUnderage() {
        if (person == null) return true;
        return (person.getAge() < 21);
    }

    private void printUnderageWarning() {
        console.println("This game is not available for those under 21.");
        String response = console.getStringInput("Would you like to play Palace instead?");
        if (response.equals("yes")) playPalace();
        else console.println("Back to the lounge with you.");

    }
    private String firstLetterUppercase(String input) {
        char firstLetter = input.charAt(0);
        String first = String.valueOf(firstLetter).toUpperCase();
        return first + input.substring(1);
    }
}
