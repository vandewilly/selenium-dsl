package br.com.caelum.seleniumdsl;

import java.io.IOException;

import org.apache.commons.lang.NotImplementedException;

import br.com.caelum.seleniumdsl.js.Array;
import br.com.caelum.seleniumdsl.js.HtmlUnitArray;
import br.com.caelum.seleniumdsl.table.Table;

import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HtmlUnitPage implements Page {

    private final HtmlPage page;

    public HtmlUnitPage(HtmlPage page) {
        this.page = page;
    }
    
    public Array array(String name) {
        return new HtmlUnitArray(page.getWebClient(), name);
    }

    public Page click(String element) {
        HtmlAnchor anchorByName = page.getAnchorByName(element);
        try {
            anchorByName.click();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ContentTag div(String id) {
        return new HtmlUnitContentTag(id);
    }

    public Form form(String id) {
        return new HtmlUnitForm(id.equals("") ? "" : id + ".");
    }

    public boolean hasLink(String link) {
        HtmlAnchor anchorByName = page.getAnchorByName(link);
        return anchorByName == null;
    }

    public String invoke(String cmd) {
        throw new NotImplementedException();
    }

    public Page navigate(String element) {
        throw new NotImplementedException();
    }

    public Page refresh() {
        throw new NotImplementedException();
    }

    public void screenshot(String filename) {
        throw new NotImplementedException();
    }

    public ContentTag span(String id) {
        return new HtmlUnitContentTag(id);
    }

    public Table table(String id) {
        return new HtmlUnitTable(id);
    }

    public String title() {
        return page.getTitleText();
    }

    public Page waitUntil(String condition, long timeout) {
    	throw new NotImplementedException();
    }

}
