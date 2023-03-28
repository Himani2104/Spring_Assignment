public class Message {
    private String msgType;

    @Override
    public String toString() {
        return "Message{" +
                "msgType='" + msgType + '\'' +
                '}';
    }

   /* public Message(String msgType) {
        this.msgType = msgType;
    }*/

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public void init()
    {
        System.out.println("Init Called");
    }

    public void destroy()
    {
        System.out.println("Destroy Called");
    }
}
