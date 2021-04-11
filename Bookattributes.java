public class Bookattributes
{
    public static void main(String[] args)
    {
        Book obj = new Book();
        System.out.println(obj.getNumberofpages());
        System.out.println(obj.getTittle());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getWeightCapacity());

    }
}
class Book{
    int numberofpages = 150;
    float weight_capacity= 2.2F;
    String tittle = "Attitude is everything";
    String author = "jeff keller";
    
    // behaviour

    String getTittle(){
        return tittle;
    }
    int getNumberofpages(){
        return numberofpages;
    }
    float getWeightCapacity(){
        return weight_capacity;
    }
    String getAuthor(){
        return author;
    }
}