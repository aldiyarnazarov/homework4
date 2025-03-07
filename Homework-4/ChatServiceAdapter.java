class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChat;

    public ChatServiceAdapter(LegacyChatService legacyChat) {
        this.legacyChat = legacyChat;
    }

    @Override
    public void sendMessage(String message) {
        legacyChat.sendLegacyMessage(message);
    }
}