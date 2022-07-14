class Generics<T>{
    T item;
    Generics(T o){
        item = o;
    }

    public T getItem() {
        return item;
    }

    public void print(){
        System.out.println("Item is : " + this.getItem());
    }
}