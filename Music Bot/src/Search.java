import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Search {
    public String defaultSite;
    public String keyword;
    public URL link;

    public void intakeKeyword(String keyword)
            throws MalformedURLException {
        this.keyword = keyword;
        this.defaultSite = "youtube";
        this.link = linkFromKeyword(keyword);
    }

    public void setDefaultSite(String newDefaultSite) {
        this.defaultSite = newDefaultSite;
    }

    public boolean checkURL(String str) {
        try {
            new URL(str).toURI();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public URL linkFromKeyword(String keyword)
            throws MalformedURLException {
        if (checkURL(keyword)) {
            URL alreadyURL = new URL(keyword);
            return new URL(keyword);
        }
        return switch (this.defaultSite) {
            default           -> null;
            case "youtube"    -> new URL("https://www.youtube.com/results?search_query=" + URLEncoder.encode(keyword, StandardCharsets.UTF_8).replaceAll("+", "%20"));
            case "spotify"    -> new URL("https://open.spotify.com/search/" + URLEncoder.encode(keyword, StandardCharsets.UTF_8));
            case "soundcloud" -> new URL("https://soundcloud.com/search?q=" + URLEncoder.encode(keyword, StandardCharsets.UTF_8));
            case "local"      -> null;
        };
    }
}