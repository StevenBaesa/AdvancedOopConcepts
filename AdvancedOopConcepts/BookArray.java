package AdvancedOopConcepts;

public class BookArray {

    public static void main(String[] args) {
        
       
        Book bookArray[]={new Fiction("The Lord of The Rings"),
                            new Fiction("The Great Gatsby"),
                            new Fiction("War and Peace"),
                            new Fiction("The Song of Achilles"),
                            new Fiction("The Lion, The Witch and the Wardrobe"),
                            new NonFiction("In Cold Blood"),
                            new NonFiction("Silent Spring"),
                            new NonFiction("How to win friends and influence people"),
                            new NonFiction("Educated"),
                            new NonFiction("Hiroshima")};

        
        for(int i=0;i<bookArray.length;i++)
        {
            
            System.out.println(bookArray[i].toString());
        }
    }

}