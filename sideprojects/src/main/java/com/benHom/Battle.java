package com.benHom;

import com.benHom.Moves.Move;
import com.benHom.Pokemon.Pokemon;
import com.benHom.Types.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//**************************************
//*******Draft Style Battles************
//**************************************

public class Battle {
    //Objects in battle
    private Trainer trainerOne;
    private Trainer trainerTwo;
    private List<Pokemon> availablePokemon = new ArrayList<>();
    private List<Move> availableMoves = new ArrayList<>();
    private List<Type> availableTypes = new ArrayList<>();
    private CombatChecker combatChecker;

    //Needed to set up properly
    private final Scanner keyboard = new Scanner(System.in);
    private boolean playerTwoTurn;
    private Integer pokemonKey;
    private final String[] statsKey = {"Hp: ", "Atk: ", "Def: ", "Sp. Atk: ", "Sp. Def: ", "Spd: "};
    int trainerOneRoundsOfSelection = 0;
    int trainerTwoRoundsOfSelection = 0;

    public Battle() {
    }

    public void startBattle() {
        setTrainer(playerTwoTurn);
    }

    public void addAvailablePokemon(List<Pokemon> availablePokemon) {
        this.availablePokemon = availablePokemon;
    }

//**********************************************************************************
//******************************** Set Trainers *************************************
//**********************************************************************************
    public void setTrainer(boolean hasTwoPlayers) {
        System.out.println("What is your name, trainer? ");
        String userInput = keyboard.nextLine();
        if (!hasTwoPlayers) {
            trainerOne = new Trainer(userInput);
        } else {
            trainerTwo = new Trainer(userInput);
        }
        if (!hasTwoPlayers) {
            System.out.println("Welcome, " + trainerOne.getName() + ", please invite another trainer to play against.");
            System.out.println();
            initiateSecondTrainer();
        }
        if (hasTwoPlayers) {
            System.out.println("Welcome, " + trainerTwo.getName() + ", good luck to you both");
            playerTwoTurn = !playerTwoTurn;
            draftPhaseStart();
        }
    }

    private void initiateSecondTrainer() {
        playerTwoTurn = !playerTwoTurn;
        setTrainer(playerTwoTurn);
    }
//**********************************************************************************
//******************************** Draft Phase *************************************
//**********************************************************************************
    private void draftPhaseStart(){
        System.out.println();
        System.out.println("You are now entering the draft phase, take turns choosing which pokemon you would like to battle with");
        draftPokemon();
    }

    private void draftPokemon() {
        boolean trainerOneHasAllPokemon = true;
        boolean trainerTwoHasAllPokemon = true;
        for (int i = 0; i < trainerOne.getPokemon().length; i++) {
            if (trainerOne.getPokemon()[i] == null) {
                trainerOneHasAllPokemon = false;
                break;
            }
            if (trainerTwo.getPokemon()[i] == null) {
                trainerTwoHasAllPokemon = false;
                break;
            }
        }
        //Displays each trainers' pokemon each round of selection
        if(trainerOneRoundsOfSelection>0) {
            System.out.print(trainerOne.getName() + "'s Pokemon: ");
            for (int i = 0 ; i<trainerOne.getPokemon().length ; i++) {
                if (trainerOne.getPokemon()[i]!=null) {
                    System.out.print(trainerOne.getPokemon()[i].getName() + " | ");
                } else {
                    break;
                }
            }
        }
        System.out.println();
        if(trainerTwoRoundsOfSelection>0) {
            System.out.print(trainerTwo.getName() + "'s Pokemon: ");
            for (int i = 0 ; i<trainerTwo.getPokemon().length ; i++) {
                if (trainerTwo.getPokemon()[i]!=null) {
                    System.out.print(trainerTwo.getPokemon()[i].getName() + " | ");
                } else {
                    break;
                }
            }
        }
        System.out.println();

        //Enters draft cycle
        if (!trainerOneHasAllPokemon || !trainerTwoHasAllPokemon) {
            System.out.println();
            System.out.println("It is " + (!playerTwoTurn ? trainerOne.getName() : trainerTwo.getName()) + "'s turn to choose a pokemon");
            System.out.println("Available Pokemon: ");
            for (int i = 0; i < availablePokemon.size(); i++) {
                System.out.println(i + 1 + ") " + availablePokemon.get(i).getName());
            }
            do {
                System.out.print(">>> ");
                String choosePokemon = keyboard.nextLine();
                try {
                    pokemonKey = Integer.parseInt(choosePokemon);
                } catch (Exception e) {
                    System.out.println("That's not a number");
                    draftPokemon();
                }
                if (pokemonKey < 1 || pokemonKey > availablePokemon.size()) {
                    System.out.println("That doesn't correspond to a pokemon");
                }
            } while (pokemonKey < 1 || pokemonKey > availablePokemon.size());
            pokemonSelectorDisplay(pokemonKey - 1);
        }
        enterBattlePhase();
    }

    private void pokemonSelectorDisplay(int index) {
        //UI displays pokemon info
        System.out.println();
        System.out.println();
        Pokemon inCycle = availablePokemon.get(index);
        System.out.println(inCycle.getName() + " : " + inCycle.getTypesString());
        System.out.println("--------------------");
        System.out.println(inCycle.getShortDescription());
        System.out.println();
        System.out.print("Moves: ");
        for (int i = 0; i < inCycle.getMoves().size(); i++) {
            System.out.print(inCycle.getMoves().get(i).getName() + " | ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Stats | ");
        for (int i = 0; i < statsKey.length; i++) {
            System.out.print(statsKey[i] + inCycle.getStats()[i] + " | ");
        }
        System.out.println();
        System.out.println();
        System.out.println("     1. Confirm     |     2. Back");

        //Confirm choice
        int confirmOrBack = 0;
        boolean validOption = false;
        while (!validOption || confirmOrBack <= 0 || confirmOrBack > 2) {
            System.out.print(">>> ");
            String choice = keyboard.nextLine();
            try {
                confirmOrBack = Integer.parseInt(choice);
                validOption = true;
            } catch (Exception e) {
                System.out.println("That's not a valid option");
            }
            if (confirmOrBack <= 0 || confirmOrBack > 2){
                System.out.println("That's not a valid option");
            }
        }
// Goes to confirmation phase
        confirmSelection(confirmOrBack, inCycle);
    }

    private void confirmSelection(int choice, Pokemon choicePokemon){
        if (choice == 1){
            if (!playerTwoTurn){
                trainerOne.getPokemon()[trainerOneRoundsOfSelection] = choicePokemon;
                trainerOneRoundsOfSelection ++;
            }
            else {
                trainerTwo.getPokemon()[trainerTwoRoundsOfSelection] = choicePokemon;
                trainerTwoRoundsOfSelection ++;
            }
            playerTwoTurn = !playerTwoTurn;
            draftPokemon();
        } else {
            draftPokemon();
        }
}
//**********************************************************************************
//******************************** Battle Phase *************************************
//**********************************************************************************


    public void enterBattlePhase(){
        System.out.println("************************* \nNow entering battle phase \n *************************");
        trainerOne.setActivePokemon(trainerOne.getPokemon()[0]);
        trainerTwo.setActivePokemon(trainerTwo.getPokemon()[0]);
        switchIn(true, true);
        turnPhase();
    }

    private void switchIn(boolean trainerOneSwitch, boolean trainerTwoSwitch) {
        if (trainerOneSwitch) {
            System.out.println(trainerOne.getName() + ": Go, " + trainerOne.getActivePokemon().getName() + "\n" + trainerOne.getActivePokemon().getName() + ": " + trainerOne.getActivePokemon().getSound());
        }
        if (trainerTwoSwitch) {
            System.out.println(trainerTwo.getName() + ": Go, " + trainerTwo.getActivePokemon().getName() + "\n" + trainerTwo.getActivePokemon().getName() + ": " + trainerTwo.getActivePokemon().getSound());
        }
    }

    //UI and move choice
    private void turnPhase(){
        String attackOrSwitch;
        System.out.println("-------------------------------------");
        System.out.println(playerTwoTurn?trainerTwo:trainerOne.getName()+"'s turn");
        System.out.print("       1) Attack        |        2) Switch \n>>> ");
        do{
            attackOrSwitch = keyboard.nextLine();
            if (!attackOrSwitch.equals("1") && !attackOrSwitch.equals("2")){
                System.out.println("Invalid");
            }
        } while (!attackOrSwitch.equals("1") && !attackOrSwitch.equals("2"));

        if (attackOrSwitch.equals("1")){
            attackMenu();
        } else {
            //switchMenu();
        }
    }

    private void attackMenu(){
        for (int i = 0; i<trainerOne.getActivePokemon().getMoves().size(); i++){
            System.out.println(i + ") " + trainerOne.getActivePokemon().getMoves().get(i));
        }
    }


    //Establish if pokemon can move based on status

    //Establish if condition move

    //Set up type damage multipliers

    //Modify Attack/Defense stats

    //Damage calculations

    //Apply move damage

    //Update users on what happened

    //Apply status damage

    //Update users on damage taken
}

