package src.main.java.com.example.pattern.mediator.chat;

public class ChatExample {

    public static void main(String[] args) {

        ChatMediator chat = new ChatRoom();
        User user1 = new ChatUser(chat, "Liam");
        User user2 = new ChatUser(chat, "Noah");
        User user3 = new ChatUser(chat, "Oliver");
        User user4 = new ChatUser(chat, "James");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);
        chat.addUser(user4);

        user1.send("Hello everyone!");
    }
}
