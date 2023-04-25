package com.company.main;

import com.company.controller.CommandDelegator;
import com.company.exception.InvalidCommandExeption;
import com.company.exception.InvalidUserException;
import com.company.exception.NoUserLoggedInException;
import com.company.model.InputCommand;
import com.company.util.CommandUtil;
import java.util.Scanner;

public class LaunchApplication {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("Enter any command to start - ");
            String command = sc.next();

            try {
                InputCommand inputCommand = CommandUtil.validateAndGetCommand(command);
                if (inputCommand == null ){
                    throw new InvalidCommandExeption("Please enter a valid command");
                }
                String response = CommandDelegator.delegateDesiredOperation(inputCommand);
                System.out.println("Response - " + response);

            } catch (InvalidUserException e) {
                e.printStackTrace();
            } catch (NoUserLoggedInException e) {
                e.printStackTrace();
            } catch (InvalidCommandExeption invalidCommandExeption) {
                invalidCommandExeption.printStackTrace();
            }


        }
    }
}
