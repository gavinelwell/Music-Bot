import java.net.MalformedURLException;
import java.net.URL;

public class Search{
    public Site defaultSite;
    public String keyword;
    public URL link;
    public void intakeKeyword(String keyword)
            throws MalformedURLException {
        this.keyword = keyword;
        this.link = linkFromKeyword(keyword);
    }
    public void setDefaultSite(Site newDefaultSite){
        this.defaultSite = newDefaultSite;
    }
    public boolean checkURL(String str){
        try{
            new URL(str).toURI();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public URL linkFromKeyword(String keyword)
            throws MalformedURLException {
        if (checkURL(keyword)){
            URL alreadyURL = new URL(keyword);
            return new URL(keyword);
        }
        String newURL;
        newURL = "https://www.youtube.com/results?search_query="+"s";
        return new URL(newURL);
    }
}
