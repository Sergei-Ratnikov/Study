package Study;

class Note1 {
    int sizeArr;
    String[] noteArr;
    
    Note1 (int s) {
        sizeArr = s;
        noteArr = new String[sizeArr];
        noteArr[sizeArr-1] = "Hello!";
    }
    
    String[] array() {
        return noteArr;
    }
    
    String arrayStr(int i) {
    return noteArr[i];
    }
    
}

class Note {
    public static void main(String args[]) {
        Note1 array1 = new Note1(Integer.MAX_VALUE/10);
        String[] testArr = array1.array();
        System.out.println(testArr[8]);
        String testStr = array1.arrayStr(8);
        System.out.println(testStr);
        System.out.println(Integer.MAX_VALUE);
    }
}