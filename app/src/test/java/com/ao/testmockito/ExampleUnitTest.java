package com.ao.testmockito;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 * <p>
 * <p>
 * <p>
 * * @see <a href="http://junit.sourceforge.net/javadoc/org/junit/Assert.html">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

	public static final String TEST_STRING = "HELLO WORLD!";

	@Mock
	Context mMockContext;

	@Test
	public void readStringFromContext() {

		//Returns the TEST_STRING when getString
		when(mMockContext.getString(R.string.app_name)).thenReturn(TEST_STRING);

		//Creates an object of the ClassUnderTest with the mock context
		MainActivity mainActivityTest = new MainActivity(mMockContext);

		//Stores the return value of getHelloWorldString() in result
		String result = mainActivityTest.getHelloWorldString();

		//Asserts that result is the value of TEST_STRIN
		assertThat(result, is(TEST_STRING));

	}

	@Test

	public void testMockMethod() {

		List mockList = Mockito.mock(ArrayList.class);


		mockList.add("hello world");

		Mockito.verify(mockList).add("hello world");

		assertEquals(0, mockList.size());

	}

	@Test
	public void testSpyMethod() {

		List spyList = Mockito.spy(new ArrayList());

		spyList.add("hello world");

		Mockito.verify(spyList).add("hello world");

		assertEquals(1, spyList.size());

	}


	@Test
	public void addition_isCorrect() {
		assertEquals(4, 2 + 2);
	}
}