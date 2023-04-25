package com.company.util;

import com.company.model.InputCommand;

public class CommandUtil {


    public static InputCommand validateAndGetCommand(String inputString){
        for (InputCommand command : InputCommand.values()){
            if (inputString.equalsIgnoreCase(command.name())){
                return command;
            }
        }
        return null;
    }
}