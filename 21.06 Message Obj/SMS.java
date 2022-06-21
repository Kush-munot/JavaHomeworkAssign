public class SMS extends Message {
    int partNum, numOfParts;

    SMS(){}
    SMS(String message_id, String sender_id, String receiver_id,int partNum, int numOfParts){
        this.message_id = message_id;
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.partNum = partNum;
        this.numOfParts = numOfParts;
    }

    void compose(String content, int siz){
        this.contents = content;
        this.size = siz;
        send(this.contents,this.size, this.partNum, this.numOfParts);
    }

    void send(String content, int siz,int partNum, int numOfParts){
        if(partNum>numOfParts) System.out.println("SMS Not Sent :(");
        else System.out.println("SMS Sent :)");
    }
    
    public String toString() {
        return(" Message ID = " + this.message_id + "\n Sender ID = " + this.sender_id + "\n Reciver Id = " + this.receiver_id + "\n Part Number = " + this.partNum + "\n Number of Parts = " + this.numOfParts + "\n Message Contents = " + this.contents + "\n Message Size = " + this.size);

    }
}
