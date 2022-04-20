package course.qa.feature;

public class HelloFormatter {
    public String format(String name){
        return String.format("$$ Hi %s, from brunch tanya $$", name.toUpperCase());
    };
}
