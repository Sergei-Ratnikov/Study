package Study;

 
public class FilesApp {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("C:\\Games\\notestest.txt", false)) {
           // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    } 
}
