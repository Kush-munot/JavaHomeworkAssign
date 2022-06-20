class Book{
    String title, author, publisher;
    int pages, price;
    
    Book(){}
    Book(String title,String author,String publisher, int pages,int price){        
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
    }

    Book arr[] = new Book[10];
    int cnt = 0;

    void classifyBook(){
        if(this.pages> 500){
            arr[cnt] = this;
            arr[cnt].displayInfo();
            cnt++;
        }
    }

    void displayInfo(){
        System.out.println("Author : "+ this.author + " Title : " + this.title + " Publisher : "+ this.publisher + " Pages : " + this.pages + " Cost : " + this.price);
    }
}