package sagan.tools;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import sagan.tools.Download;

@Root(strict = false)
public class Release {

    @Attribute
    private String name;

    @ElementList(name = "download", type = Download.class, inline = true)
    private List<Download> downloads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Download> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<Download> downloads) {
        this.downloads = downloads;
    }
}