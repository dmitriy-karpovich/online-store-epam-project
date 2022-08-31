package by.epam.onlinestore.controller.command.impl;

import by.epam.onlinestore.controller.command.Command;
import by.epam.onlinestore.controller.command.CommandResult;
import by.epam.onlinestore.controller.command.CommandResultType;

import by.epam.onlinestore.controller.context.RequestContext;
import by.epam.onlinestore.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;

public class LogOutCommand implements Command {
    private static final String LOGIN_PAGE = "command=logIn";
    private static final String USER = "user";
    private static final String ROLE = "role";

    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createRequestContext();
        requestContext.removeSessionAttribute(USER);
        requestContext.removeSessionAttribute(ROLE);
        helper.updateRequest(requestContext);

        return new CommandResult(LOGIN_PAGE, CommandResultType.REDIRECT);
    }
}
