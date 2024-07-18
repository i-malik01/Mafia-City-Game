import java.util.Scanner;
import java.util.Random;


public class Main {

    //east west control method
    public static int xControl(String input, int control, int x) {
        //east west controls for control scheme 1
        if (control == 1) {
            if (input.equals("d")) {
                x++;
            } else if (input.equals("a")) {
                x--;
            } else {
            }
        }

        //east west controls for control scheme 2
        if (control == 2) {
            if (input.equals("e")) {
                x++;
            } else if (input.equals("w")) {
                x--;
            } else {
                x = x;
            }
        }
        return x;
    }

    // noth south control method
    public static int yControl(String input, int control, int y) {
        //north south controls for control scheme 1
        if (control == 1) {
            if (input.equals("w")) {
                y++;
            } else if (input.equals("s")) {
                y--;
            } else {
            }
        }

        //north south controls for control scheme 2
        if (control == 2) {
            if (input.equals("n")) {
                y++;
            } else if (input.equals("s")) {
                y--;
            } else {
                y = y;
            }
        }
        return y;
    }

    //Prints the list of inventory items
    public static void controlList(String input, int money, boolean bag, boolean mask, boolean brick, boolean car, boolean helicopterKeys) {
        System.out.println("Money: $" + money);
        System.out.println("Items:");
        System.out.println("[1] Gun");
        System.out.println("[2] Map");

        if (bag == true) {
            System.out.println("[3] Bag");
        }

        if (mask == true) {
            System.out.println("[4] Mask");
        }

        if (brick == true) {
            System.out.println("[5] Brick");
        }

        if (car == true) {
            System.out.println("[6] Car");
        }

        if (helicopterKeys == true) {
            System.out.println("[7] Helicopter");
        }
        System.out.println("[0] Exit");
    }

    //Contols the use of inventory items
    public static void invenControl(String input, int x, int y, int petrol, boolean bag, boolean mask, boolean brick, boolean car, boolean helicopterKeys) {
        if (input.equals("1")) {
            System.out.println("You use the gun");
        } else if (input.equals("2")) {
            map();
        } else if (input.equals("3") && (bag == true)) {
            System.out.println("You look and see all the items and money in your bag");
        } else if (input.equals("4") && (mask == true)) {
            System.out.println("You put on the mask. You think it makes you look cool.");
            System.out.println("But you decide to take it off because it looks like people are judging you");
        } else if (input.equals("5") && (brick == true)) {
            System.out.println("You pull out the brick");
            System.out.println("It looks like it could smash something fragile with it");
        } else if (input.equals("6") && (car == true)) {
            //checks if the car has petrol
            if (petrol > 0) {
                System.out.println("You get in the car");
                System.out.println("Where would you like to go?");
                map();
                System.out.println("petrol: " + petrol);
                System.out.println("[1]: Big Tony's Pizza");
                System.out.println("[2]: Prohibition Park");
                System.out.println("[3]: Mafia City Airport");
                System.out.println("[4]: Gangster General Goods");
                System.out.println("[5]: Mafia City Jail");
                System.out.println("[6]: Big Bank");
                System.out.println("[0]: Exit");
            } else {
                System.out.println("The car is out of petrol.");
                System.out.println("You cant drive it anywhere.");
            }
        } else if (input.equals("7") && (helicopterKeys == true)) {
            if ((x == 0) && (y == 4)) {
                System.out.println("You get in the helicopter and turn it on");
            } else {
                System.out.println("The helicopter is at Mafia City Airport.");
                System.out.println("You can't use it here.");
            }
        }
    }

    //method makes sure the player wants to quit
    static boolean quit(String input, boolean game, Scanner reader) {
        System.out.println("Are you sure you want to quit?(y/n)");
        input = reader.nextLine();
        if (input.equals("y")) {
            game = false;
            System.out.println("You tell Big Tony's men that you can't finish the job.");
            System.out.println("They tie you up and put a bag over your head.");
            reader.nextLine();
            System.out.println("You wake up with the bag off you head. You are in the desert surrounding Mafia City.");
            System.out.println("You can see the lights coming from the city glowing in the distance.");
            System.out.println("One of Big Tony's men says \"The boss told you what would happen if you couldn't finish the job.\"");
            reader.nextLine();
            System.out.println("He points a gun at your face and fires it.");
            System.out.println("Everything goes dark.");
            System.out.println();
        }
        return game;
    }

    //method for printing out the map
    static void map() {
        System.out.println("****************************************************MAP****************************************************");
        System.out.println("*  Streets         |||Godfather’s Wy  ||Syndicate St||Prohibition PkWy      ||Mafioso Av||Underworld St  |*");
        System.out.println("*------------------|||----------------||------------||----------------------||----------||---------------|*");
        System.out.println("*Gamblingo Ln      ||[MFC Airport     ][            ][                      ][Big Bank  ][               ]*");
        System.out.println("*Capone Cres       ||[                ][8 12 store  ][                      ][          ][               ]*");
        System.out.println("*Bootlegger’s Bvd  ||[Don Petrolio's  ][            ][Prohibition Park      ][          ][Milk Bar       ]*");
        System.out.println("*Capo Crst         ||[                ][            ][                      ][          ][               ]*");
        System.out.println("*Pizza Ln          ||[Big Tony's Pizza][            ][Gangster General Goods][          ][Mafia City Jail]*");
        System.out.println("***********************************************************************************************************");
    }

    //text for into cutscene
    static void introCutscene(Scanner reader, String name) {
        System.out.println("You enter the arrivals area.");
        System.out.println("You see two men dressed in black suits. One of them is holding a sign with your name on it.");
        reader.nextLine();
        System.out.println("You approach them. They each grab one of your arms firmly and start briskly escorting you without saying a word.");
        System.out.println("You get to the car park and the men take you to an expensive looking shining black car.");
        System.out.println("It looks to be from the 1920s or 1930s but it is in such pristine condition that it could be mistaken for being brand new.");
        System.out.println("You are forced into the car and have the door locked on you. The two men get in the front and start driving away from the airport.");
        reader.nextLine();
        System.out.println("The car stops outside a pizza restaurant. You read the sign on the front. It says \"Big Tony's Pizza\".");
        System.out.println("You become overwhelmed with dread. You now realise why you were wanted here.");
        reader.nextLine();
        System.out.println("The two men get you out of the car and escort you into pizza restaurant.");
        System.out.println("As you enter your fear is slightly reduced by the smell of freshly cooked wood fired pizza.");
        System.out.println("But that fear comes rushing back when you move to the back of the store, where the fresh pizza smell is replaced with that of cigars.");
        reader.nextLine();
        System.out.println("Your are escorted to a room that says \"Big Tony's Office\" on the door.");
        System.out.println("The two men sit you in a chair and then stand guard by the door, probably to stop you from leaving.");
        System.out.println("In front of you is an expensive wooden desk and an even more expensive looking leather office chair facing away from you.");
        System.out.println("The chair spins around...");
        reader.nextLine();
        System.out.println("You are face to face with Big Tony.");
        System.out.println("He is a large man in a tailored suit, holding a smoking cigar in between his left middle and pointer fingers.");
        System.out.println("He starts to speak in a thick Brooklyn accent.");
        reader.nextLine();
        System.out.println("\"" + name + ". I am pretty sure you know why you\'re here.\"");
        reader.nextLine();
        System.out.println("\"But in case you don\'t. I\'ll remind you.\"");
        reader.nextLine();
        System.out.println("\"20 years ago you came to me asking for money.\"");
        System.out.println("\"You told me you wanted to help give your newly born daughter the best upbringing possible\"");
        System.out.println("\"and I was happy to let you borrow as much as you wanted.\"");
        System.out.println("\"Because of me you were able to send her to the best school and university in the country.\"");
        System.out.println("\"I was so happy to see her become the fine young lady she is today.\"");
        System.out.println("\"It\'s always lovely to see your money being used for something good.\"");
        System.out.println("\"However there was a very important word in there.\"");
        reader.nextLine();
        System.out.println("\"Borrow.\"");
        reader.nextLine();
        System.out.println("\"I let you borrow that money because you told me that you would pay it back.\"");
        System.out.println("\"But at no point in the past 20 years have you paid even a single cent back.\"");
        reader.nextLine();
        System.out.println("\"So I have a job for you.\"");
        System.out.println("\"I no longer want money. We are well past that.\"");
        System.out.println("\"If you want to pay back your debt, you'll need to break one of my men, Phat Sal out of jail.\"");
        reader.nextLine();
        System.out.println("\"To do that you will need to fly a helicopter over the jail and lower the ladder to Phat Sal.\"");
        System.out.println("\"We don\'t have a helicopter so you\'ll need to buy one at the airport for $250,000\"");
        System.out.println("\"You can get the money by robbing the bank. We don\'t know the code to the vault\"");
        System.out.println("\"but we know it consists of the numbers: 3, 4 and 5 in a random order.\"");
        reader.nextLine();
        System.out.println("\"If you don't think you can complete the job or you try to leave the city,\"");
        System.out.println("\"my men will make sure that you and your debts are dealt with.\"");
        reader.nextLine();
        System.out.println("\"Permanently.\"");
        reader.nextLine();
        System.out.println("\"You can take this gun and paper map of the city.\"");
        System.out.println();
        System.out.println("\"Now get out of my office!\"");
        System.out.println("\"I don\'t want to see you back here unless Phat Sal is with you.\"");
        reader.nextLine();
        System.out.println("You are kicked out of the restaurant onto the street");
    }

    //prison break cutscene
    static String prisonBreakCutscene(Scanner reader, String input) {
        System.out.println("Just before you take off, one of Big Tony's men runs over the air field to the helicopter.");
        System.out.println("He gives you a picture and says \"Here's what Phat Sal looks like. We want you in and out as fast as possible.\"");
        System.out.println("\"We'll pick you up when you land.\"");
        System.out.println("You take the picture and take off.");
        System.out.println("Your heart rate begins to spike as the helicopter starts to lift off the ground.");
        reader.nextLine();
        System.out.println("You are now well above the all the buildings in the city.");
        System.out.println("The view is amazing and the city is so big.");
        reader.nextLine();
        System.out.println("You see Mafia City Jail in the distance and start to fly towards it.");
        System.out.println("As you get close you hear a voice come over the radio.");
        reader.nextLine();
        System.out.println("It says \"This is Mafia City Air Traffic Control.\"");
        System.out.println("\"Do not fly over the prison. It is restricted air space and you will be shot down.\"");
        System.out.println("Your body goes cold and it feels like time has stopped.");
        reader.nextLine();
        System.out.println("You know you don't have much time to act.");
        System.out.println("It's now or never. As you fly over the prison you hear gun fire as the guards try to shoot down your helicopter.");
        System.out.println("You check your picture and spot Phat Sal out in the prison yard.");
        System.out.println("Do you lower the rope ladder to save him?(y/n)");
        input = reader.nextLine();
        //if player chooses to not save Phat Sal
        if (input.equals("n")){
            System.out.println("You decide to not lower the ladder and free Phat Sal.");
            System.out.println("You sit and look over the city as the gun fire increases.");
            System.out.println("As you go to leave the engine cuts out and the helicopter starts to fall.");
            System.out.println("You hear a \"KABOOOOM\" and everything goes black.");
        }

        else{
            System.out.println("You Lower the rope ladder and call to Phat Sal.");
            System.out.println("He notices the ladder and gets ready to climb it.");
            System.out.println("Other prisoners start to see what Phat Sal is doing and start climbing the ladder after him.");
            reader.nextLine();
            System.out.println("The gun fire moves to the prisoners climbing the ladder which may have bought you more time");
            System.out.println("but you can see the rope ladder is starting to fray and you don't know how much longer it will last.");
            reader.nextLine();
            System.out.println("once Phat Sal makes it to the helicopter you cut the ladder.");
            System.out.println("As all the other prisoners fall, you try to get the helicopter moving before the gun fire is targeted at you again.");
            System.out.println("Under a barrage of gun fire you get away from the jail.");
            System.out.println("You rush back to the airport as fast as you can.");
            System.out.println("You can see and hear all the police cars from around the city trying to beat you there.");
            reader.nextLine();
        }

        return input;
    }

    //text for ending cutscene
    static void endingCutscene(Scanner reader, String name) {
        System.out.println("You have landed at Mafia City Airport.");
        System.out.println("Big Tony\'s men are waiting for you and Phat Sal.");
        System.out.println("As Big Tony's men rush you quickly into a black car, you can hear police sirens blaring in the distance");
        System.out.println("You arrive at the pizza restaurant and are quickly rushed into Big Tony's office.");
        System.out.println("The door is locked behind you. It\'s only you and Big Tony.");
        reader.nextLine();
        System.out.println("\"Congratulations " + name + "...\" Big Tony says as he spins his chair to face you.");
        reader.nextLine();
        System.out.println("\"I am impressed that you actually managed to break Phat Sal out.\"");
        System.out.println("\"You succeeded where many of my men have failed. I didn\'t expect you to pull the job off.\"");
        System.out.println("\"It\'s fair to say that your debt has been repaid.\"");
        System.out.println("\"Enjoy your freedom!\"");
        System.out.println("You get up and turn to leave.");
        reader.nextLine();
        System.out.println("\"However...\"");
        reader.nextLine();
        System.out.println("\"I am a man that likes to have all my loose ends tied up.\"");
        System.out.println("\"It makes it easier to keep my reputation clean.\"");
        System.out.println("\"" + name + ", you know far more about my private life than any general civilian should\"");
        System.out.println("\"and that makes you a loose end that needs to be tied up.\"");
        reader.nextLine();
        System.out.println("You feel the cold end of a pistol suddenly press against the back of your head.");
        System.out.println("\"This is nothing personal.\"");
        reader.nextLine();
        System.out.println("\"That's how mafia works.\"");
        System.out.println("Everything goes black.");
        reader.nextLine();
    }

    //sets the random bank vault code
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    //checks if the combination is correct
    public static boolean isRightGuess(int[] givenNumbers, int[] guess) {
        for (int i = 0; i < 3; i++) {
            if (givenNumbers[i] != guess[i]) {
                return false;
            }
        }
        return true;
    }

    //method for robbing people in the streets
    public static int rob(Scanner reader, int money) {
        Random randMoney = new Random();
        //genorates a random number to decide if there is anyone to rob
        int people = randMoney.nextInt(5 - 0) + 0;
        if (people > 1) {
            System.out.println("You spot someone who might have some money on them.");
            System.out.println("You approach with your gun hidden.");
            reader.nextLine();
            System.out.println("You point your gun at your target and threaten to shoot them.");
            //genorates a random number of stolen money (less than 10 = no money)
            int stolen = randMoney.nextInt(40 - 0) + 0;
            stolen = stolen - 10;
            if (stolen <= 0) {
                stolen = 0;
                System.out.println("\"AHHH! Please don't shoot me! I don't have any money.\"");
                System.out.println("\"Here you can take my wallet and see that I'm not lying.\"");
                reader.nextLine();
                System.out.println("You look and see that they are telling the truth.");
                System.out.println("You should probably make a quick escape before you draw too much attention.");
                reader.nextLine();
            } else {
                System.out.println("\"AHHH! Take whatever you want from me just please don't shoot.\"");
                System.out.println("You take all the money they have and quickly run away before anyone can chase after you.");
                reader.nextLine();
            }

            money = money + stolen;

            //tells the player how much was stolen
            System.out.println("You take all the money you can.");
            System.out.println("You managed to steal: $" + stolen);
        } else {
            System.out.println("There is no one around to rob.");
        }

        //returns money to the main method
        return money;
    }


    public static void main(String[] args) {

        //scanner and variable for player control inputs
        Scanner reader = new Scanner(System.in);
        String input = new String();

        //location variables
        int x = 0;
        int y = 0;
        int xLast = 0;
        int yLast = 0;

        //player control scheme
        int control = 1;

        //player name
        String name = new String();

        //used to loop an important question until the player confirms their choice
        Boolean confirm = new Boolean(false);

        //inventory item variables
        int money = 0;
        Boolean bag = new Boolean(false);
        Boolean mask = new Boolean(false);
        Boolean brick = new Boolean(false);
        Boolean car = new Boolean(false);
        int petrol = 3;
        Boolean helicopterKeys = new Boolean(false);

        //says if these places have been robbed
        Boolean bank = new Boolean(false);
        Boolean eightTwelve = new Boolean(false);
        Boolean milkBar = new Boolean(false);

        //game loop variables
        Boolean game = new Boolean(true);
        Boolean win = new Boolean(false);

        //start of game setup
        System.out.println("You have arrived at Mafia City Airport, after being anonymously invited meeting in Mafia City. ");
        System.out.println("Before you leave you need to go through customs.");
        System.out.println("You approach the desk, there is a lady at the counter who greets you");
        System.out.println();
        System.out.println("\"Welcome to Mafia City\" she says");
        System.out.println("\"Before I can let you you in I need to ask you come questions.");
        System.out.println("What is your name?\"(Please enter your name below)");

        //lets the player set their name
        while (confirm == false) {
            name = reader.nextLine();
            System.out.println("\"Ok so your name is " + name + " correct?\"(y/n)");
            input = reader.nextLine();

            if (input.equals("y")) {
                System.out.println("\"Great! I\'ll put that in the System.");
                confirm = true;
            } else {
                System.out.println("\"Could you please give me your actual name then?\"");
            }
        }

        //player controls setup
        confirm = false;
        //lets the player set the control scheme
        System.out.println("\"Ok, next question\"");
        System.out.println("\"What control scheme you would like to use? [1]WASD or [2]NSEW?\"");

        //control scheme confirmation loop
        while (confirm == false) {
            input = reader.nextLine();

            //confirms that the player wants to use WASD for controls
            if (input.equals("1")) {
                System.out.println("\"Ok so you would like to use control scheme 1, correct? \"(y/n)");
                input = reader.nextLine();

                if (input.equals("y")) {
                    System.out.println("\"Great! I\'ll put that in the System.");
                    //sets the WASD controlls
                    control = 1;
                    confirm = true;
                } else {
                    System.out.println("\"Could you please tell me if you are using control scheme 1 or 2 then?\"(y/n)");
                }
            }
            //confirms that the player wants to use NSEW for controls
            else if (input.equals("2")) {
                System.out.println("\"Ok so you would like to use control scheme 2, correct?\"");
                input = reader.nextLine();

                if (input.equals("y")) {
                    System.out.println("\"Great! I\'ll put that in the System.\"");
                    //sets the NSEW controlls
                    control = 2;
                    confirm = true;
                } else {
                    System.out.println("\"Could you please tell me if you are using control scheme 1 or 2 then?\"");
                }
            }
            // this askes the question again if the player doesn't pick one or two
            else {
                System.out.println("\"Sorry, I couldn't understand you said.");
                System.out.println("\"Could you please tell me whether you want to use control scheme 1 or 2?\"");
            }
        }

        System.out.println();
        System.out.println("\"Perfect! I am now able to let you enter Mafia City.");
        System.out.println("Before you go, please allow me to give you some tips to help you navigate our city.");
        System.out.println("It is common to continue text here by using return or enter.");
        reader.nextLine();
        if (control == 1) {
            System.out.println("If you want to go north use w, if you want to go south use s, ");
            System.out.println("if you want to go east use d and if you would like to go west use a.");
        }
        if (control == 2) {
            System.out.println("If you want to go north use n, if you want to go south use s, ");
            System.out.println("if you want to go east use e and if you would like to west use w.");
        }

        //explains game controls to the player
        reader.nextLine();
        System.out.println("Finally, if you come across any tools or items while you are here,");
        System.out.println("you can use them by entering the number that is next to the item.\"");
        reader.nextLine();
        System.out.println("\"Enjoy your stay in Mafia City!\"");
        reader.nextLine();

        //resets the confirm loop for later use
        confirm = false;

        introCutscene(reader, name);

        //loop that doesn't let the game finish until the player wins or chooses to quit
        while (win == false) {
            while (game == true) {

                //map layout

                //Big Tony's
                if ((x == 0) && (y == 0)) {
                    System.out.println("You are at the intersection of Godfather’s Way and Pizza Lane.");
                    System.out.println("You see Big Tony's Pizza Restaurant across the road with two of Big Tony's men out the front.");
                    System.out.println("You probably shouldn\'t stick around until you return with Phat Sal.");

                } else if ((x == 0) && (y == 1)) {
                    System.out.println("You are at the intersection of Godfather’s Way and Capo crest.");

                }

                //Don Petrolio's petrol station
                else if ((x == 0) && (y == 2)) {
                    System.out.println("You are at the intersection of Godfather’s Way and Bootlegger’s Boulevard.");
                    System.out.println("You are next to Don Petrolio's Petrol station.");

                    // checks if the player has a stolen car
                    if (car == true) {
                        System.out.println("The car you have is stolen, you probably shouldn\'t get closer");
                    } else {
                        System.out.println("Do you want to but some petrol for $200?(y/n) ");
                        input = reader.nextLine();
                        if ((input.equals("y")) && (money >= 200)) {
                            petrol++;
                            money = money - 200;
                            System.out.println("You bought some petrol.");
                        }
                    }


                } else if ((x == 0) && (y == 3)) {
                    System.out.println("You are at the intersection of Godfather’s Way and Capone Crescent.");

                }

                //code for Mafia City airport
                else if ((x == 0) && (y == 4)) {
                    System.out.println("You are at the intersection of Godfather’s Way and Gamblingo Lane.");
                    System.out.println("You are outside Mafia City Airport.");
                    System.out.println("There is an aircraft rental store.");
                    System.out.println("Do you want to enter? (y/n)");
                    input = reader.nextLine();

                    //enters the store if the player wants to
                    if (input.equals("y")) {
                        System.out.println("You enter the store.");
                        System.out.println("\"Hello, welcome to the aircraft shop.\" says the man at the desk.");

                        //loops until they want to leave the store
                        while (confirm == false) {
                            System.out.println("\"What would you like to buy?\"");
                            System.out.println("[1] helicopter ($250,000)");
                            System.out.println("[0] leave the store");

                            input = reader.nextLine();

                            //makes sure the player wants to and can actuly buy the helicopter
                            if ((input.equals("1")) && (money >= 250000) && (helicopterKeys == false)) {
                                System.out.println("\"It's a pleasure doing business with you.\"");
                                System.out.println("\"Enjoy your helicopter!\"");
                                System.out.println("You got keys to the helicopter.");
                                System.out.println("You can only take off from the airport but you are now able to free Phat Sal.");
                                reader.nextLine();
                                money = money - 250000;
                                helicopterKeys = true;
                            }

                            //checks if the player cant afford the helicopter
                            else if ((input.equals("1")) && (money < 250000)) {
                                System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                reader.nextLine();
                            }

                            //checks if the player already has a helicopter
                            else if ((input.equals("1")) && (helicopterKeys == true)) {
                                System.out.println("\"You already have a helicopter. You don't need another.\"");
                                reader.nextLine();
                            }

                            //for if the player wants to leave
                            else {
                                System.out.println("\"Thank you for coming we hope to see you again soon.\"");
                                System.out.println("What would you like to do next?");
                                confirm = true;
                            }
                        }
                        confirm = false;
                    }

                    //if the player doesn't want to enter the store
                    else {
                        System.out.println("You didn't enter the store.");
                        System.out.println("What would you like to do next?");
                    }
                } else if ((x == 1) && (y == 0)) {
                    System.out.println("You are at the intersection of Syndicate Street and Pizza Lane.");

                } else if ((x == 1) && (y == 1)) {
                    System.out.println("You are at the intersection of Syndicate Street and Capo crest.");

                } else if ((x == 1) && (y == 2)) {
                    System.out.println("You are at the intersection of Syndicate Street and Bootlegger’s Boulevard.");

                }

                //code for 8 Twelve store
                else if ((x == 1) && (y == 3)) {
                    System.out.println("You are at the intersection of Syndicate Street and Capone Crescent.");
                    System.out.println("You can see an 8 Twelve store across the road.");

                    //checks if the store has been robbed
                    if (eightTwelve == false) {
                        System.out.println("Do you want to enter? (y/n)");

                        input = reader.nextLine();

                        //enters the player into the store
                        if (input.equals("y")) {
                            System.out.println("You enter the store.");
                            System.out.println("\"Welcome to 8 Twelve.\" says the man at the counter.");

                            //loops until they want to leave the store
                            while (confirm == false) {
                                System.out.println("\"How may I help you?\"");
                                System.out.println("money: " + money);
                                System.out.println("[1] use gun");
                                System.out.println("[2] buy a coffee ($7)");
                                System.out.println("[3] buy a bag of chips ($3)");
                                System.out.println("[0] leave the store");

                                input = reader.nextLine();

                                //player robs the store
                                if (input.equals("1")) {
                                    System.out.println("\"AHHH! Please don't hurt me.\"");
                                    System.out.println("\"Take all the money you want just don't hurt me.\"");

                                    //decides how much money is stolen
                                    Random randMoney = new Random();
                                    int stolen = randMoney.nextInt(200 - 50) + 50;
                                    money = money + stolen;

                                    //tells the player how much was stolen
                                    System.out.println("You take all the money you can.");
                                    System.out.println("You managed to steal: $" + stolen);
                                    reader.nextLine();

                                    System.out.println("The shop keeper runs out of the store shouting to call the police.");
                                    System.out.println("You should probably escape before the police get here.");
                                    reader.nextLine();
                                    confirm = true;
                                    eightTwelve = true;
                                }

                                //makes sure the player wants the coffee and can buy it
                                else if ((input.equals("2")) && (money >= 7)) {
                                    System.out.println("\"Enjoy your coffee!\"");
                                    System.out.println("You drick the coffee.");
                                    System.out.println("It tastes cheap and nasty but it gives you a lot of energy.");
                                    reader.nextLine();
                                    money = money - 7;
                                }

                                //checks if the player cant afford the coffee
                                else if ((input.equals("2")) && (money < 7)) {
                                    System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                    reader.nextLine();
                                }

                                //makes sure the player wants the chips and can buy it
                                else if ((input.equals("3")) && (money >= 3)) {
                                    System.out.println("\"It's a pleasure doing business with you.\"");
                                    System.out.println("\"Enjoy your chips!\"");
                                    System.out.println("You open the chips and eat them.");
                                    System.out.println("They taste very good but one cuts the roof of your mouth.");
                                    System.out.println("The salt on the chips gets into the cut and hurts a lot.");
                                    System.out.println("You have to put down the chips because the pain is unbearable.");
                                    money = money - 3;
                                    reader.nextLine();
                                }

                                //checks if the player cant afford the chips
                                else if ((input.equals("3")) && (money < 3)) {
                                    System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                    reader.nextLine();
                                }

                                //for if the player wants to leave
                                else {
                                    System.out.println("\"Thank you for coming we hope to see you again soon.\"");
                                    System.out.println("What would you like to do next?");
                                    confirm = true;
                                }
                            }
                            confirm = false;
                        }

                        //player doesn't enter the store
                        else {
                            System.out.println("You didn't enter the store.");
                            System.out.println("What would you like to do next?");
                        }
                    }
                    //prints of the store has been robbed
                    else if (eightTwelve == true) {
                        System.out.println("You have already robbed this store. It doesn't have any money left.");
                        System.out.println("You should probably go somewhere else");
                    }
                } else if ((x == 1) && (y == 4)) {
                    System.out.println("You are at the intersection of Syndicate Street and Gamblingo Lane.");

                }

                //gangster general good code
                else if ((x == 2) && (y == 0)) {
                    System.out.println("You are at the intersection of Prohibition Parkway and Pizza Lane.");
                    System.out.println("You are outside Gangster General Goods.");
                    System.out.println("You might be able to find some useful stuff here.");
                    System.out.println("Do you want to enter? y/n");

                    input = reader.nextLine();

                    //enters the player into the store
                    if (input.equals("y")) {
                        System.out.println("You enter the store.");
                        System.out.println("\"Hello, welcome to the Gangster General goods.\" says the lady at the counter.");

                        //loops until they want to leave the store
                        while (confirm == false) {
                            System.out.println("\"What would you like to buy?\"");
                            System.out.println("money: " + money);
                            System.out.println("[1] gangster mask ($45)");
                            System.out.println("[2] duffle bag ($180)");
                            System.out.println("[3] Mafia City game ($39)");
                            System.out.println("[4] Thug Life car air freshener ($5)");
                            System.out.println("[0] leave the store");

                            input = reader.nextLine();

                            //makes sure the player wants to and can actuly buy the mask
                            if ((input.equals("1")) && (money >= 45) && (mask == false)) {
                                System.out.println("\"It's a pleasure doing business with you.\"");
                                System.out.println("\"Enjoy your new mask!\"");
                                System.out.println("You got a mask.");
                                System.out.println("You can now hide your identity when robbing the bank.");
                                reader.nextLine();
                                money = money - 45;
                                mask = true;
                            }

                            //checks if the player cant afford the mask
                            else if ((input.equals("1")) && (money < 45)) {
                                System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                reader.nextLine();
                            }

                            //checks if the player already has the mask
                            else if ((input.equals("1")) && (mask == true)) {
                                System.out.println("\"You already have a mask. You don't need another.\"");
                                reader.nextLine();
                            }

                            //makes sure the player wants the bag and can buy it
                            else if ((input.equals("2")) && (money >= 180) && (bag == false)) {
                                System.out.println("\"It's a pleasure doing business with you.\"");
                                System.out.println("\"Enjoy this big duffle bag!\"");
                                System.out.println("You got a bag.");
                                System.out.println("It has a ton of space and has plenty of room to store lots money.");
                                reader.nextLine();
                                money = money - 180;
                                bag = true;
                            }

                            //checks if the player cant afford the bag
                            else if ((input.equals("2")) && (money < 180)) {
                                System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                reader.nextLine();
                            }

                            //checks if the player already has the bag
                            else if ((input.equals("1")) && (bag == true)) {
                                System.out.println("\"You already have a bag. You don't need another.\"");
                                reader.nextLine();
                            }

                            //makes sure the player wants the game and can buy it
                            else if ((input.equals("3")) && (money >= 39)) {
                                System.out.println("\"It's a pleasure doing business with you.\"");
                                System.out.println("\"Enjoy the game!\"");
                                System.out.println("You just bought the Mafia City game for you Nintendo PlayBox 360.");
                                System.out.println("Hopefully you can play it with your kids when you get home.");
                                reader.nextLine();
                                money = money - 39;
                            }

                            //checks if the player cant afford the game
                            else if ((input.equals("3")) && (money < 39)) {
                                System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                reader.nextLine();
                            }

                            //makes sure the player wants the air feshener and can buy it
                            else if ((input.equals("4")) && (money >= 5)) {
                                System.out.println("\"It's a pleasure doing business with you.\"");
                                System.out.println("\"I'm sure your car will be smelling lovely!\"");
                                System.out.println("You just bought a Thug Life car air freshener.");
                                System.out.println("You don't have a car to put it in but maybe you will find one while you are here.");
                                reader.nextLine();
                                money = money - 5;
                            }

                            //checks if the player cant afford the air freshener
                            else if ((input.equals("4")) && (money < 5)) {
                                System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                reader.nextLine();
                            }


                            //for if the player wants to leave
                            else {
                                System.out.println("\"Thank you for coming we hope to see you again soon.\"");
                                System.out.println("What would you like to do next?");
                                confirm = true;
                            }
                        }
                        confirm = false;
                    }

                    //player doesn't enter the store
                    else {
                        System.out.println("You didn't enter the store.");
                        System.out.println("What would you like to do next?");
                    }
                } else if ((x == 2) && (y == 1)) {
                    System.out.println("You are at the intersection of Prohibition Parkway and Capo crest.");
                }

                //Prohibition Park and brick collection
                else if ((x == 2) && (y == 2)) {
                    System.out.println("You are at the intersection of Prohibition Parkway and Bootlegger’s Boulevard.");
                    System.out.println("you are in Prohibition Park.");
                    if (brick == false) {
                        System.out.println("There is brick on the ground. It could be good for breaking something fragile.");
                        System.out.println("Would you like to pick it up?(y/n)");
                        input = reader.nextLine();
                        if (input.equals("y")) {
                            brick = true;
                        }
                    }
                } else if ((x == 2) && (y == 3)) {
                    System.out.println("You are at the intersection of Prohibition Parkway and Capone Crescent.");

                } else if ((x == 2) && (y == 4)) {
                    System.out.println("You are at the intersection of Prohibition Parkway and Gamblingo Lane.");

                } else if ((x == 3) && (y == 0)) {
                    System.out.println("You are at the intersection of Mafioso Avenue and Pizza Lane.");

                } else if ((x == 3) && (y == 1)) {
                    System.out.println("You are at the intersection of Mafioso Avenue and Capo crest.");

                }

                //place to use brick to steal the car
                else if ((x == 3) && (y == 2)) {
                    System.out.println("You are at the intersection of Mafioso Avenue and Bootlegger’s Boulevard.");
                    if (car == false) {
                        System.out.println("There is an abandoned car here.");
                        System.out.println("It looks like you could steal it if you had something to smash the window.");
                    }
                } else if ((x == 3) && (y == 3)) {
                    System.out.println("You are at the intersection of Mafioso Avenue and Capone Crescent.");

                }

                //bank location and code
                else if ((x == 3) && (y == 4)) {
                    System.out.println("You are at the intersection of Mafioso Avenue and Gamblingo Lane.");
                    System.out.println("You are staring up at the tall glass doors of the Big Bank.");

                    //checks if the bank has already been robbed
                    if (bank == true) {
                        System.out.println("The bank doesn\'t have any more money.");
                        System.out.println("It would probably be best to not rob it again");
                    } else {
                        System.out.println("Do you want to enter the bank? y/n");
                        input = reader.nextLine();

                        //checks if the player has the required items
                        if (input.equals("y") && (bag == true) && (mask == true)) {
                            System.out.println("You put your mask on and enter the bank.");
                            System.out.println("you walk towards a bank teller");

                            //loops until the player pulls out the gun
                            while (confirm == false) {
                                System.out.println("press [1] to pull out the gun");
                                input = reader.nextLine();

                                if (input.equals("1")) {
                                    System.out.println("You have now pulled out your gun.");
                                    confirm = true;
                                } else {
                                    System.out.println("You didn't pull out your gun.");
                                    System.out.println("The bank teller looks at you awkwardly.");
                                }
                            }

                            System.out.println("The bank teller sees your gun and starts to shake in fear, they then tell you where the vault is.");
                            System.out.println("As you leave to go to the safe the bank teller screams, pushes the button that calls the police and runs out.");
                            System.out.println("You don't have much time. You make your way to the safe and are met with a 3 digit combination lock.");
                            System.out.println("You remember that you need to use the 3 numbers that Big Tony gave to you.");
                            input = reader.nextLine();


                            //sets the vault combination variable
                            int[] givenNumbers = {3, 4, 5};
                            int[] guess = new int[3];
                            boolean rightGuess = false;

                            //loops untill the player guesses correctly
                            while (!rightGuess) {
                                shuffleArray(givenNumbers);
                                for (int i = 0; i < 3; i++) {
                                    System.out.print("Enter a 1 digit guess for number in position " + (i + 1) + ": ");
                                    guess[i] = reader.nextInt();
                                }
                                rightGuess = isRightGuess(givenNumbers, guess);

                                //gives the player money for robbing the bank
                                if (rightGuess) {
                                    System.out.println("You guessed the correct code. The Vault is now open.");
                                    System.out.println("You rush into the vault and stuff your bag with as much money as you can.");
                                    System.out.println("You hurriedly make your way out of the bank and make your escape before the police arrive.");
                                    money = money + 250000;
                                    bank = true;
                                    reader.nextLine();

                                    //tells the player what the combination was and askes them to try again
                                } else {
                                    System.out.println("The code was: " + givenNumbers[0] + " " + givenNumbers[1] + " " + givenNumbers[2] + " Please try this again.");
                                }
                            }
                        } else if (bag == false) {
                            System.out.println("You enter tha bank, ready to pull out your gun");
                            System.out.println("but you stop yourself when you realise that you aren't prepared yet.");
                            System.out.println("You should get a bag, so that you can carry the money out.");
                        } else if (mask == false) {
                            System.out.println("You enter tha bank, ready to pull out your gun");
                            System.out.println("but you stop yourself when you realise that you aren't prepared yet.");
                            System.out.println("You should get a mask, so that you can hide your identity during the robbery.");
                        } else {
                            System.out.println("You decided to not enter The Bank.");
                        }
                    }
                } else if ((x == 4) && (y == 0)) {
                    System.out.println("You are at the intersection of Underworld Street and Pizza Lane.");
                    System.out.println("You are trying to spot Phat Sal through the gates at Mafia City Jail.");
                    System.out.println("but you don\'t know what he looks like");
                } else if ((x == 4) && (y == 1)) {
                    System.out.println("You are at the intersection of Underworld Street and Capo crest.");

                }

                //code for the milk bar
                else if ((x == 4) && (y == 2)) {
                    System.out.println("You are at the intersection of Underworld Street and Bootlegger’s Boulevard.");
                    System.out.println("You are outside the milk bar.");

                    //checks if the store has been robbed
                    if (milkBar == false) {
                        System.out.println("Do you want to enter? (y/n)");

                        input = reader.nextLine();

                        //enters the player into the store
                        if (input.equals("y")) {
                            System.out.println("You enter the store.");
                            System.out.println("\"Welcome to the Milk Bar.\" says the woman at the counter.");

                            //loops until they want to leave the store
                            while (confirm == false) {
                                System.out.println("\"How may I help you?\"");
                                System.out.println("money: " + money);
                                System.out.println("[1] use gun");
                                System.out.println("[2] buy an ice cream ($5)");
                                System.out.println("[3] buy a thick shake ($9)");
                                System.out.println("[0] leave the store");

                                input = reader.nextLine();

                                //player robs the store
                                if (input.equals("1")) {
                                    System.out.println("\"AHHH! Please don't hurt me.\"");
                                    System.out.println("\"Take all the money you want just don't hurt me.\"");

                                    //decides how much money is stolen
                                    Random randMoney = new Random();
                                    int stolen = randMoney.nextInt(200 - 50) + 50;
                                    money = money + stolen;

                                    //tells the player how much was stolen
                                    System.out.println("You take all the money you can.");
                                    System.out.println("You managed to steal: $" + stolen);
                                    reader.nextLine();

                                    System.out.println("The shop keeper runs out of the store shouting to call the police.");
                                    System.out.println("You should probably escape before the police get here.");
                                    reader.nextLine();
                                    confirm = true;
                                    milkBar = true;
                                }

                                //makes sure the player wants the ice cream and can buy it
                                else if ((input.equals("2")) && (money >= 5)) {
                                    System.out.println("\"Enjoy your fresh ice cream!\"");
                                    System.out.println("You eat ice cream.");
                                    System.out.println("It tastes so good that you eat it very quickly");
                                    System.out.println("but you have to stop so you don't get brain freeze.");
                                    reader.nextLine();
                                    money = money - 5;
                                }

                                //checks if the player cant afford the ice cream
                                else if ((input.equals("2")) && (money < 5)) {
                                    System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                    reader.nextLine();
                                }

                                //makes sure the player wants the thickshake and can buy it
                                else if ((input.equals("3")) && (money >= 9)) {
                                    System.out.println("\"It's a pleasure doing business with you.\"");
                                    System.out.println("\"Enjoy your thick shake!\"");
                                    System.out.println("You put your mouth on the straw and suck.");
                                    System.out.println("The thick shake is very thick and you can't seem to suck any up the straw.");
                                    System.out.println("You keep sucking and sucking and sucking until you almost pass out.");
                                    System.out.println("You decide to give up because you can't seem to drink it.");
                                    money = money - 9;
                                    reader.nextLine();
                                }

                                //checks if the player cant afford the thick shake
                                else if ((input.equals("3")) && (money < 9)) {
                                    System.out.println("\"Sorry, you don't have enough money to afford that.\"");
                                    reader.nextLine();
                                }

                                //for if the player wants to leave
                                else {
                                    System.out.println("\"Thank you for coming we hope to see you again soon.\"");
                                    System.out.println("What would you like to do next?");
                                    confirm = true;
                                }
                            }
                            confirm = false;
                        }

                        //player doesn't enter the store
                        else {
                            System.out.println("You didn't enter the store.");
                            System.out.println("What would you like to do next?");
                        }
                    }
                    //prints of the store has been robbed
                    else if (eightTwelve == true) {
                        System.out.println("You have already robbed this store. It doesn't have any money left.");
                        System.out.println("You should probably go somewhere else");
                    }
                } else if ((x == 4) && (y == 3)) {
                    System.out.println("You are at the intersection of Underworld Street and Capone Crescent.");

                } else if ((x == 4) && (y == 4)) {
                    System.out.println("You are at the intersection of Underworld Street and Gamblingo Lane.");

                } else {
                    System.out.println("Big Tony\'s men will shoot you if you try to leave the city");
                    System.out.println("you probably shouldn\'t go any futher in this direction");
                    x = xLast;
                    y = yLast;
                }


                //control block
                System.out.println();
                controlList(input, money, bag, mask, brick, car, helicopterKeys);
                input = reader.nextLine();
                xLast = x;
                yLast = y;
                x = xControl(input, control, x);
                y = yControl(input, control, y);
                invenControl(input, x, y, petrol, bag, mask, brick, car, helicopterKeys);

                //makes sure the player wants to quit the game
                if (input.equals("0")) {
                    game = quit(input, game, reader);
                }

                //calls the gun robbery method
                else if (input.equals("1")) {
                    if ((x == 3) && (y == 1)) {
                        System.out.println("You spot someone who might have some money on them.");
                        System.out.println("You approach with your gun hidden.");
                        reader.nextLine();
                        System.out.println("You point your gun at your target and threaten to shoot them.");
                        reader.nextLine();
                        System.out.println("However when you do they pull out a gun and shoot you in the chest.");
                        reader.nextLine();
                        System.out.println("You fall to floor in a pool of your own blood");
                        System.out.println("and slowly bleed to death.");
                        game = false;
                    } else {
                        money = rob(reader, money);
                        reader.nextLine();
                    }
                }

                //steal car
                else if ((input.equals("5")) && (x == 3) && (y == 2) && (brick == true)) {
                    System.out.println("You use the brick to smash the car's window and steal it.");
                    car = true;
                }

                //use the car.
                else if ((input.equals("6") && (car == true))) {
                    if (petrol > 0) {
                        while (confirm == false) {
                            input = reader.nextLine();

                            //exits car menu
                            if (input.equals("0")) {
                                confirm = true;
                            }

                            //takes you to Big Tony's pizza
                            else if (input.equals("1")) {
                                x = 0;
                                y = 0;
                                petrol--;
                                confirm = true;
                            }

                            //takes you to Prohibition Park
                            else if (input.equals("2")) {
                                x = 2;
                                y = 2;
                                petrol--;
                                confirm = true;
                            }

                            //takes you to Mafia City Airport
                            else if (input.equals("3")) {
                                x = 0;
                                y = 4;
                                petrol--;
                                confirm = true;
                            }

                            //takes you to Gangster General Goods
                            else if (input.equals("4")) {
                                x = 2;
                                y = 0;
                                petrol--;
                                confirm = true;
                            }

                            //takes you to Mafia City Jail
                            else if (input.equals("5")) {
                                x = 4;
                                y = 0;
                                petrol--;
                                confirm = true;
                            }

                            //takes you to the Big Bank
                            else if (input.equals("6")) {
                                x = 3;
                                y = 4;
                                petrol--;
                                confirm = true;
                            }
                        }
                        confirm = false;
                    }
                }

                //use the helicopter to break out Phat Sal
                else if (input.equals("7") && (helicopterKeys == true) && (x == 0) && (y == 4)) {
                    input = prisonBreakCutscene(reader, input);
                    //game over if you don't save home
                    if (input.equals("n")) {
                        game = false;
                    }

                    //win if you do save him
                    else {
                        game = false;
                        win = true;
                    }
                }

                System.out.println();
            }

            //checks if the game has been beaten
            if (win == true) {
                endingCutscene(reader, name);
            }

            //game restart and quit confirmation
            else {
                System.out.println("GAME OVER!");
                System.out.println();
                System.out.println("Would you like to restart?(y/n)");
                input = reader.nextLine();
                //restarts the game
                if (input.equals("y")) {
                    game = true;
                    x = 0;
                    y = 0;
                }

                //quits the game
                else if (input.equals("n")) {
                    win = true;
                }
            }
        }
                //ending text
            System.out.println("The End");
            System.out.println();
            System.out.println("Thank you for playing Mafia City!");
            System.out.println();
            System.out.println("© copyright John Sargant, Mustafa Saleh and (Idriss) Malik Sitou 2023.");
        }
    }

