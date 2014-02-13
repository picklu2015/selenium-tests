
package com.wikia.webdriver.Common.DataProvider;

import com.wikia.webdriver.PageObjectsFactory.ComponentObject.AddTable.TableBuilderComponentObject.Alignment;
import org.testng.annotations.DataProvider;

/**
 * @author llukaszj
 */
public class ArticleFeaturesCRUDDataProvider {

	@DataProvider
	public static final Object[][] getTableProperties() {
		return new Object[][] {
			{2, 500, 50, 3, 5, Alignment.Right}
		};
	}

}