package OOPS1;

public class FrontEndDeveloper implements  ItCompany {
    private  String name;
    private String surname;
    private String language;
    private int age;

    public FrontEndDeveloper(String name, String surname, String language, int age) {
        this.name = name;
        this.surname = surname;
        this.language = language;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLanguage() {
        return language;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void writeCode() {
        System.out.println(name + " " + surname +" is making website using " + language + " language" );
    }

    @Override
    public void comeEarly() {
        System.out.println(name + " never come early" );
    }

    @Override
    public void testCode() {
        System.out.println(name + " " + surname +" will test code today");
    }

    @Override
    public void beCreative() {

    }
}
