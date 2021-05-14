package OOPS1;

public class GameDeveloper implements ItCompany{
    private  String name;
    private String surname;
    private String language;
    private int age;

    public GameDeveloper(String name, String surname, String language, int age) {
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
        System.out.println(name + " " + surname +" is writing game using " + language + " language" );
    }

    @Override
    public void comeEarly() {
        System.out.println(name + " come early always" );
    }

    @Override
    public void testCode() {
        System.out.println(name + " " + surname +" Never test code before, he as confidence ");
    }

    @Override
    public void beCreative() {

    }
}
