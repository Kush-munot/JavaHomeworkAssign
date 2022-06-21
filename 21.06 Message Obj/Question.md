<p>Define a class to represent a Message with data members message_id, sender_id, receiver_id, contents and size. Define appropriate constructors and getter-setters. <br> <br>
Define a method compose() to initialize the 'contents' and the 'size'. After initializing the contents, it should call another method send().<br>
Send() method should check the size of the message. Send the message (just display a message "Sent") if size is less than 200 characters, else display "Not Sent".<br>
Define 2 subclasses of message - SMS and MMS.
SMS can send a message containing more than 200 characters in parts.
MMS can attach a file along-with text.
Additional data members
In SMS class - Part number, noOfParts (An SMS can be sent in parts if it is too long)
In MMS class - typeOfAttachment (String with values among audio, video, etc.) , sizeOfAttachement (int)
<br><br>

Also override the toString() method of Object class in Message, SMS and MMS to display the contents of these classes' objects.

Create objects of Message, SMS and MMS and call the methods appropriately.</p>