package example.jbot.slack.handlers;
import org.springframework.web.socket.WebSocketSession;

import java.util.regex.Matcher;

import me.ramswaroop.jbot.core.slack.Bot;
import me.ramswaroop.jbot.core.slack.Controller;
import me.ramswaroop.jbot.core.slack.Handler;
import me.ramswaroop.jbot.core.slack.models.Event;
/**
 * @author Sergey Tarabukin
 */
@Handler
public class HandlerFour {

    @Controller()
    public void fourMessage(Bot bot, WebSocketSession session, Event
        event,
        Matcher matcher) {

    }
}
