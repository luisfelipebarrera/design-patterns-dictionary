package src.main.java.com.example.pattern.mediator.chat;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
class ChatRoom implements ChatMediator {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String msg, User sender) {
        for (User user : users) {
            if (user != sender) user.receive(msg);
        }
    }
}
