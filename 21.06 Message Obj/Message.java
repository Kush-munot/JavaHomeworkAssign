class Message{
    String message_id, sender_id, receiver_id, contents; 
    int size;

    Message(){}
    Message(String message_id, String sender_id, String receiver_id){
        this.message_id = message_id;
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.contents = "";
        this.size = 0;
    }

    void compose(String content, int siz){
        this.contents = content;
        this.size = siz;
        send(this.contents,this.size);
    }

    void send(String content, int siz){
        if(siz<200) System.out.println("Not Sent :(");
        else System.out.println("Sent :)");
    }

    public String toString() {
        return("Message ID = " + this.message_id + " Sender ID = " + this.sender_id + " Reciver Id = " + this.receiver_id +  " Message Contents = " + this.contents + " Message Size = " + this.size);

    }
}