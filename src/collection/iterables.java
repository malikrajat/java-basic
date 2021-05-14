package collection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

class UrlLibrary implements Iterable<String>{
    private  LinkedList<String> url = new LinkedList<String>();
    private class urlIterable implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < url.size();
        }

        @Override
        public String next() {
                StringBuilder sb = new StringBuilder();
            try {
                URL url1 = new URL(url.get(index));
                BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));
                String line  = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            index++;
            return sb.toString();
        }

        @Override
        public void remove() {
            url.remove(index);
        }

        @Override
        public void forEachRemaining(Consumer<? super String> action) {

        }
    }
    public UrlLibrary () {
        url.add("https://google.com");
        url.add("https://facebook.com");
        url.add("https://twitter.com");
    }

    @Override
    public Iterator<String> iterator() {
        return new urlIterable();
    }

//    @Override
//    public Iterator<String> iterator() {
//        return url.iterator();
//    }
}

public class iterables {
    public static void main(String[] args) {
        UrlLibrary urlLibrary = new UrlLibrary();
        for (String url: urlLibrary) {
            System.out.println(url);
        }
    }
}
