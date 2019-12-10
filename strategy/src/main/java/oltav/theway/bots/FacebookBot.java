package oltav.theway.bots;

import com.github.messenger4j.Messenger;

import java.util.Optional;

public class FacebookBot {
    void start() {
        Messenger messenger = Messenger.create("", "", "");
        messenger.onReceiveEvents();
    }
}
