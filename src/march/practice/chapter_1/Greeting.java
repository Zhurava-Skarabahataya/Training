package march.practice.chapter_1;

class Greeting {

    private String name;
    private final String HELLO_GREETING = "Hello ";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.printf("%s%s!\n", HELLO_GREETING, getName());
    }
}
