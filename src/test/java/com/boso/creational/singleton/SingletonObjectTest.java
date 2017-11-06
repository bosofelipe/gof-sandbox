package com.boso.creational.singleton;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class SingletonObjectTest {

	@Test
	void showMessage() throws Exception {
		MatcherAssert.assertThat(new SingletonObject().showMessage(), CoreMatchers.equalTo("Hello World!"));
	}
}
