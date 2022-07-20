package com.epam.hotel.command;

import com.epam.hotel.command.commandImpl.AuthorizationCommand;
import com.epam.hotel.command.commandImpl.NoSuchCommand;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CommandProvider {

    // тут применяется синглтон
    private static final CommandProvider instance = new CommandProvider();

    //
    private Map<CommandName, Command> commands = new HashMap<>();
//приватный так как это синглтон
  private CommandProvider() {
        commands.put(CommandName.AUTHORIZATION, new AuthorizationCommand());
        commands.put(CommandName.REGISTRATION, new AuthorizationCommand());
        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
    }

    public static CommandProvider getInstance() {
        return instance;
    }

    // Метод, возвращающий команду
    public Command getCommand(String commandName) {
        CommandName name = CommandName.valueOf(commandName.toUpperCase());
        Command command;
        // так пишем только для привлечения внимания на null
        if (null != name) {
            command = commands.get(name);
        } else {
            command = commands.get(CommandName.NO_SUCH_COMMAND);
        }
        return command;

    }

}
