public class MMS extends Message {
    String typeOfAttachment; int sizeOfAttachement;

    MMS(){}
    MMS(String message_id, String sender_id, String receiver_id,String typeOfAttachment, int sizeOfAttachement){
        this.message_id = message_id;
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.typeOfAttachment = typeOfAttachment;
        this.sizeOfAttachement = sizeOfAttachement;
    }
    void compose(String content, int siz){
        this.contents = content;
        this.size = siz;
        send(this.contents,this.size,this.typeOfAttachment, this.sizeOfAttachement);
    }

    void send(String content, int siz, String typeOfAttachment, int sizeOfAttachement){
        if(sizeOfAttachement>100) System.out.println("MMS Not Sent :(");
        else System.out.println("MMS Sent :)");
    }

    public String toString() {
        return(" Message ID = " + this.message_id + "\n Sender ID = " + this.sender_id + "\n Reciver Id = " + this.receiver_id + "\n Type Of Attacement = " + this.typeOfAttachment + "\n Size Of Attachment = " + this.sizeOfAttachement + "\n Message Contents = " + this.contents + "\n Message Size = " + this.size);
    }
}
