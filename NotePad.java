package Study;

import Study.Note;

class NotePad {
    
    Note note = new Note();

    void addString(String str) {
        for (int i = 0; i < note.arr.length; i++) {
            if (note.arr[i] == null) {
                note.arr[i] = str;
                break;
            }
        }
    }
    
    // Удалить запись
    void delString(int index) {
        index--;
        for (int i = index; i < note.arr.length; i++) {
            note.arr[i] = note.arr[i + 1];
            if (note.arr[i] == null) break;
        }
    }
    
    // Редактировать запись    
    void editString(int index, String str) {
        index--;
        note.arr[index] = str;
    }
  
    // Просмотреть все записи
    void showText() {
        System.out.println("Notepad:");
        for (int i = 0; i < note.arr.length; i++) {
            if (note.arr[i] == null) break;
            System.out.println("(" + (i+1) + ")\t" + note.arr[i]);            
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        
        NotePad note1 = new NotePad();
        
        note1.addString("one");
        note1.addString("two");
        note1.addString("three");
        note1.addString("five");
        note1.addString("four");
        note1.showText(); 
        
        note1.editString(4, "oups!!");
        note1.showText();
        
        note1.delString(4);        
        note1.showText();       
    }
}