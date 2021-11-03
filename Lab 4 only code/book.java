public class book
{
  String title,author;
  Double price;
  public book(){
  }
  public book(String title, String author, double price){
   this.title=title;
    this.author=author;
    this.price=price;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public Double getPrice(){
    return price;
  }
}

    