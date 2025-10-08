package src.main.java.com.example.pattern.mediator.chat;

// Mediator
interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
