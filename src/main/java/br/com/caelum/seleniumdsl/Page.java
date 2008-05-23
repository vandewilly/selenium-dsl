package br.com.caelum.seleniumdsl;

import br.com.caelum.seleniumdsl.js.Array;
import br.com.caelum.seleniumdsl.table.Table;

/**
 * A web page.
 * 
 * @author Guilherme Silveira
 */
public interface Page {

	/**
	 * Accesses a web form.
	 * @param id
	 * @return
	 */
	Form form(String id);

	/**
	 * Access to a div.
	 * @param id
	 * @return
	 */
	ContentTag div(String id);

	/**
	 * Access to a span.
	 * @param id
	 * @return
	 */
	ContentTag span(String id);

	/**
	 * Access to a table.
	 * @param id
	 * @return
	 */
	Table table(String id);

	/**
	 * Clicks an element and waits for the browser to load the page
	 * 
	 * @param element
	 *            the elements's id or name or an Selenium expression
	 * @return the Page
	 */
	Page navigate(String element);

	/**
	 * Clicks something
	 * 
	 * @param element
	 *            the element's id or name or a Selenium expression
	 * @return the Page
	 */
	Page click(String element);

	/**
	 * Checks for the existence of a link
	 * @param link
	 * @return
	 */
	boolean hasLink(String link);

	/**
	 * Returns the page title.
	 * 
	 * @return the page title
	 */
	String title();
	
	/**
	 * Returns access to a javascript array.
	 * @param name	the variable name
	 * @return	the javascript array
	 */
	Array array(String name);

}