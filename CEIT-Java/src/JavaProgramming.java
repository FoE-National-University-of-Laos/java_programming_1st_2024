class JavaProgramming {
    String name;
    JavaProgramming() {
        System.out.println("Constructor method called.");
    }
    JavaProgramming(String t) {
        name = t;
    }
    public static void main(String[] args) {
        JavaProgramming cpp  = new JavaProgramming();
        //  Language java = new Language("Java");
        cpp.setName("C++");
        //   java.getName();
        cpp.getName();
    }
    void setName(String t) {
        name = t;
    }
    void getName() {
        System.out.println("Language name: " + name);
    }
}
